package com.seyidkanan.newmvpproject.pojos;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * created by seyidkanan at 7/16/18
 */
public class AuthMessagePOJO {

    /*{
        "status": 0,
            "message": {
                "phone": [
                        "Telefon nömrəsi düzgün daxil edilməyib",
                        "Telefon nömrəsi artıq qeydiyyatdan keçib"
                    ],
                "password": [
                    "Şifrə mütləq daxil edilməlidir"
                    ],
                    "password_confirmation": [
                        "Təsdiq şifrəsi və Şifrə eyni deyil."
                    ]
    }
    }*/

    private List<String> phone;
    private List<String> password;
    private List<String> name;
    @SerializedName("last_name")
    private List<String> lastName;
    private List<String> email;
    @SerializedName("password_confirmation")
    private List<String> passwordConfirmation;

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getPassword() {
        return password;
    }

    public void setPassword(List<String> password) {
        this.password = password;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getLastName() {
        return lastName;
    }

    public void setLastName(List<String> lastName) {
        this.lastName = lastName;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(List<String> passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    @Override
    public String toString() {
        return "AuthMessagePOJO{" +
                "phone=" + phone +
                ", password=" + password +
                ", name=" + name +
                ", lastName=" + lastName +
                ", email=" + email +
                ", passwordConfirmation=" + passwordConfirmation +
                '}';
    }
}
