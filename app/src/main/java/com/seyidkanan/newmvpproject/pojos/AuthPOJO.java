package com.seyidkanan.newmvpproject.pojos;

import com.google.gson.annotations.SerializedName;

/**
 * created by seyidkanan at 7/11/18
 */
public class AuthPOJO extends AuthResponsePOJO {

    //request
    private Integer id;
    private String phone;
    private String phone_two;
    private String password;
    private String fullname;
    private String name;
    @SerializedName("last_name")
    private String lastName;
    private String email;
    @SerializedName("password_confirmation")
    private String passwordConfirmation;

    private String code;

    public AuthPOJO() {
    }

    public AuthPOJO(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone_two() {
        return phone_two;
    }

    public void setPhone_two(String phone_two) {
        this.phone_two = phone_two;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "AuthPOJO{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", phone_two='" + phone_two + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", passwordConfirmation='" + passwordConfirmation + '\'' +
                '}';
    }
}
