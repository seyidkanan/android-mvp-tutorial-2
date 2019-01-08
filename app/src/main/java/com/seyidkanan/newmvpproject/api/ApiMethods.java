package com.seyidkanan.newmvpproject.api;

import com.seyidkanan.newmvpproject.pojos.AuthPOJO;
import com.seyidkanan.newmvpproject.pojos.AuthResponsePOJO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import retrofit2.http.Query;

/**
 * Created by seyidkanan on 3/5/18.
 */

public interface ApiMethods {

    String LANG = "lang";
    String ACCESS_TOKEN = "access_token";

    interface Auth {

        //https://shop.az/api/v1/auth/login
        @Headers({"Content-Type:application/json", "Accept:application/json"})
        @POST("auth/login")
        Call<AuthPOJO> login(
                @Query(LANG) String lang,
                @Body AuthPOJO authPOJO
        );

        //https://shop.az/api/v1/auth/register
        @POST("auth/register")
        Call<AuthResponsePOJO> register(
                @Query(LANG) String lang,
                @Body AuthPOJO authPOJO
        );

        @Headers({"Content-Type:application/json", "Accept:application/json"})
        @GET("user/owner")
        Call<AuthPOJO> getProfile(
                @Header("Authorization") String accessToken
        );

    }

}
