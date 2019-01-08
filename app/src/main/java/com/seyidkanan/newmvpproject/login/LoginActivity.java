package com.seyidkanan.newmvpproject.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.seyidkanan.newmvpproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @BindView(R.id.editTextUsername)
    EditText editTextUsername;
    @BindView(R.id.editTextPassword)
    EditText editTextPassword;

    private LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        new LoginPresenter(this);
    }

    @OnClick(R.id.button)
    public void onClickLoginButton() {
        presenter.onClickLoginButton();
    }

    @Override
    public String getUsername() {
        return editTextUsername.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return editTextPassword.getText().toString().trim();
    }

    @Override
    public void onIncorrectInputs() {
        Toast.makeText(this, "Incorrect input", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccessfulLogin() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.presenter = presenter;
    }


}
