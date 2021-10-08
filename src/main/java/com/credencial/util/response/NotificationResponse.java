package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class NotificationResponse implements Serializable, JSonable {

    private String message;
    private String amount;
    private String code;
    private String tmp1;
    private String numAuth;
    private int retrival_ref;
    private NotificationType notificationType;

    public enum NotificationType {
        CHARGE, DISCHARGE, CARD_2_CARD, PAY_AND_CHARGE
    }

    public String getMessage() {
        return message;
    }


    public String getAmount() {
        return amount;
    }

    public String getCode() {
        return code;
    }

    public String getTmp1() {
        return tmp1;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTmp1(String tmp1) {
        this.tmp1 = tmp1;
    }

    public String getNumAuth() {
        return numAuth;
    }

    public void setNumAuth(String numAuth) {
        this.numAuth = numAuth;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, NotificationResponse.class);
    }

    public int getRetrival_ref() {
        return retrival_ref;
    }

    public void setRetrival_ref(int retrival_ref) {
        this.retrival_ref = retrival_ref;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

}
