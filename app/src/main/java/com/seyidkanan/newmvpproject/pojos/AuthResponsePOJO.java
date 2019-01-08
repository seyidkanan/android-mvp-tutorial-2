package com.seyidkanan.newmvpproject.pojos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/**
 * created by seyidkanan at 7/16/18
 */
public class AuthResponsePOJO {
/*

{
    "status": 0,
    "message": {
        "phone": [
            "Telefon nömrəsi artıq qeydiyyatdan keçib"
        ]
    }
}

{
    "status": 0,
    "message": {
        "phone": [
            "Telefon nömrəsi düzgün daxil edilməyib",
            "Telefon nömrəsi artıq qeydiyyatdan keçib"
        ]
    }
}

{
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
}

{
    "status": 1,
    "message": "User created successfully"
}

*/

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType;

    private JsonElement message;

    private JsonElement errors;

    private String status; //status 0 is meaning smthing going fail, status 1 is

    private Boolean numberConfirm;

    public Boolean getNumberConfirm() {
        return numberConfirm;
    }

    public void setNumberConfirm(Boolean numberConfirm) {
        this.numberConfirm = numberConfirm;
    }

    public void setMessage(JsonElement message) {
        this.message = message;
    }

    public JsonElement getErrors() {
        return errors;
    }

    public void setErrors(JsonElement errors) {
        this.errors = errors;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public JsonElement getMessage() {
        return message;
    }

    public void setMessage(JsonObject message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AuthResponsePOJO{" +
                "accessToken='" + accessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", message=" + message +
                ", status=" + status +
                '}';
    }
}
