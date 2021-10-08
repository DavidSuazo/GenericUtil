package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class GiftCardStatusVirtualBlisterRequest implements Serializable, JSonable {

    private String accessKey;
    private String code;
    private String dateTime;
    private String pin;
    private String transactionUniqueId;
    private String messageSignature;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTransactionUniqueId() {
        return transactionUniqueId;
    }

    public void setTransactionUniqueId(String transactionUniqueId) {
        this.transactionUniqueId = transactionUniqueId;
    }

    public String getMessageSignature() {
        return messageSignature;
    }

    public void setMessageSignature(String messageSignature) {
        this.messageSignature = messageSignature;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, GiftCardStatusVirtualBlisterRequest.class);
    }

}
