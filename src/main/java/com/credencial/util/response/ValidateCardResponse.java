package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class ValidateCardResponse implements Serializable, JSonable {

    private String statusCode;
    private String responseCode;
    private String transactionUniqueId;
    private String balanceAmount;

    // Getter Methods 
    public String getStatusCode() {
        return statusCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getTransactionUniqueId() {
        return transactionUniqueId;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    // Setter Methods 
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public void setTransactionUniqueId(String transactionUniqueId) {
        this.transactionUniqueId = transactionUniqueId;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ValidateCardResponse.class);
    }
}
