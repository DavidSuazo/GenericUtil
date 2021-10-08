package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class DoResponse implements Serializable, JSonable {

    private String jwt;
    private int expirationDate;
    private int responseCode;
    private String responseDescription;
    private String transactionGUID;
    private String authorizationCode;
    private String message;
    private String estatusCode;
    private String estatusDescription;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getTransactionGUID() {
        return transactionGUID;
    }

    public void setTransactionGUID(String transactionGUID) {
        this.transactionGUID = transactionGUID;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEstatusCode() {
        return estatusCode;
    }

    public void setEstatusCode(String estatusCode) {
        this.estatusCode = estatusCode;
    }

    public String getEstatusDescription() {
        return estatusDescription;
    }

    public void setEstatusDescription(String estatusDescription) {
        this.estatusDescription = estatusDescription;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, DoResponse.class);
    }
}
