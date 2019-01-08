package com.seyidkanan.newmvpproject.login;

import com.seyidkanan.newmvpproject.BaseView;

public interface LoginContract {


    interface View extends BaseView<Presenter> {

        String getUsername();

        String getPassword();

        void onIncorrectInputs();

        void onSuccessfulLogin();

    }

    interface Presenter {

        void onClickLoginButton();

        void getUserData();

    }

    interface Model{

        void loginAPI();

    }


}
