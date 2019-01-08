package com.seyidkanan.newmvpproject.login;

import com.seyidkanan.newmvpproject.pojos.AuthPOJO;

public interface LoginApiCallBack {

    void onSuccessAPI(AuthPOJO authPOJO);

    void onFailureAPI(Throwable throwable);

}
