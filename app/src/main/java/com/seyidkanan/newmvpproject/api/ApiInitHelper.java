package com.seyidkanan.newmvpproject.api;

import android.content.Context;

import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by seyidkanan on 3/13/18.
 */

public class ApiInitHelper {

    // Our lovely API client :)
    private Retrofit retrofit;

    private ApiMethods.Auth authService;

    private Context context;

    public ApiInitHelper(Context context) {
        this.context = context;
    }

    public OkHttpClient getUnsafeOkHttpClient() {

        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                @Override
                public void checkClientTrusted(
                        java.security.cert.X509Certificate[] chain,
                        String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(
                        java.security.cert.X509Certificate[] chain,
                        String authType) throws CertificateException {
                }

                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[0];
                }
            }};

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts,
                    new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext
                    .getSocketFactory();

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient okHttpClient = new OkHttpClient();

            okHttpClient = okHttpClient.newBuilder()
                    .sslSocketFactory(sslSocketFactory)
//                    .addInterceptor(new AddCookiesInterceptor(context))
//                    .contextaddInterceptor(new ReceivedCookiesInterceptor(context))
                    .hostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER)
                    .addInterceptor(logging)
                    .build();

            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public ApiInitHelper initDefaultApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
//                .addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getUnsafeOkHttpClient())
                .build();
        return this;
    }


    public ApiInitHelper createAuthService() {
        if (authService == null) {
            authService = retrofit.create(ApiMethods.Auth.class);
        }
        return this;
    }
    public ApiMethods.Auth getAuthService() {
        return authService;
    }

}
