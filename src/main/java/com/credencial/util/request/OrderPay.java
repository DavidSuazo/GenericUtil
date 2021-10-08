package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cj_sr
 */
public class OrderPay implements Serializable, JSonable{

    private String type;
    private String collector_id;
    private String return_url;
    private String back_url;
    private String notification_url;
    private String external_transaction_id;
    private ArrayList<Details> details;
    private Float rate;
    private Float charge_delay;
    private String currency_id;
    private PaymentMethods paymentMethos;
    private Payer payer;
    private Date due_date;
    private Date last_due_date;
    private Metadata metadata;

    public String getBack_url() {
        return back_url;
    }

    public Float getCharge_delay() {
        return charge_delay;
    }

    public String getCollector_id() {
        return collector_id;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public ArrayList<Details> getDetails() {
        return details;
    }

    public Date getDue_date() {
        return due_date;
    }

    public String getExternal_transaction_id() {
        return external_transaction_id;
    }

    public Date getLast_due_date() {
        return last_due_date;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public String getNotification_url() {
        return notification_url;
    }

    public Payer getPayer() {
        return payer;
    }

    public PaymentMethods getPaymentMethos() {
        return paymentMethos;
    }

    public Float getRate() {
        return rate;
    }

    public String getReturn_url() {
        return return_url;
    }

    public String getType() {
        return type;
    }

    public void setBack_url(String back_url) {
        this.back_url = back_url;
    }

    public void setCharge_delay(Float charge_delay) {
        this.charge_delay = charge_delay;
    }

    public void setCollector_id(String collector_id) {
        this.collector_id = collector_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public void setDetails(ArrayList<Details> details) {
        this.details = details;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public void setExternal_transaction_id(String external_transaction_id) {
        this.external_transaction_id = external_transaction_id;
    }

    public void setLast_due_date(Date last_due_date) {
        this.last_due_date = last_due_date;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public void setNotification_url(String notification_url) {
        this.notification_url = notification_url;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public void setPaymentMethos(PaymentMethods paymentMethos) {
        this.paymentMethos = paymentMethos;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, OrderPay.class);
    }    

}
