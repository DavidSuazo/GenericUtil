package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class Transaction implements Serializable, JSonable   {
     
    private String date;
    private String hour;
    private String comerce;
    private String amount;
    private String descriptionAmount;
    private String numberAutorization;
    

    public String getAmount() {
        return amount;
    }

    public String getComerce() {
        return comerce;
    }

    public String getDate() {
        return date;
    }

    public String getDescriptionAmount() {
        return descriptionAmount;
    }

    public String getHour() {
        return hour;
    }

    public String getNumberAutorization() {
        return numberAutorization;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setComerce(String comerce) {
        this.comerce = comerce;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescriptionAmount(String descriptionAmount) {
        this.descriptionAmount = descriptionAmount;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setNumberAutorization(String numberAutorization) {
        this.numberAutorization = numberAutorization;
    }
    
    
       @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Transaction.class);
    }
   
    
}
