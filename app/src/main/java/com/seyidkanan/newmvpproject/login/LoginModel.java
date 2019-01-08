package com.seyidkanan.newmvpproject.login;

public class LoginModel implements LoginContract.Model {

    private LoginApiCallBack loginApiCallBack;

    public LoginModel(LoginApiCallBack loginApiCallBack) {
        this.loginApiCallBack = loginApiCallBack;
    }

    @Override
    public void loginAPI() {
        // TODO: 1/4/19 call api
    }


}
