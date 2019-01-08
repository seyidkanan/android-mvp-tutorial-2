package com.seyidkanan.newmvpproject.login;

import com.seyidkanan.newmvpproject.pojos.AuthPOJO;

public class LoginPresenter implements LoginContract.Presenter, LoginApiCallBack {


    private LoginContract.View view;


    public LoginPresenter(LoginContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void onClickLoginButton() {
        if (view != null) {
            if (view.getUsername().length() == 0 || view.getPassword().length() == 0) {
                view.onIncorrectInputs();
            } else {
                // TODO: 1/4/19 process login
                view.onSuccessfulLogin();
                LoginModel loginModel = new LoginModel(this);
                loginModel.loginAPI();
            }
        }
    }

    @Override
    public void getUserData() {

    }

    @Override
    public void onSuccessAPI(AuthPOJO authPOJO) {

    }

    @Override
    public void onFailureAPI(Throwable throwable) {

    }

}
