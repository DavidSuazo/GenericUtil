package com.credencial.util.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class RequestPush implements Serializable {

    private String to;
    private Notification notification;
    private Data data;
    private Apn apns;

    public Data getData() {
        return data;
    }

    public Notification getNotification() {
        return notification;
    }

    public String getTo() {
        return to;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, RequestPush.class);
    }

    
    /**
     * @return the apns
     */
    public Apn getApns() {
        return apns;
    }

    /**
     * @param apns the apns to set
     */
    public void setApns(Apn apns) {
        this.apns = apns;
    }

}
