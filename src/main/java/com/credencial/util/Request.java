package com.credencial.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author David
 */
public class Request implements Serializable,JSonable{

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    private String key;
    private String data;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

  @Override
    public Object fromJSON(String message) {
         Gson gson = new  GsonBuilder().setDateFormat("yyyy-MM-dd").create();
     return gson.fromJson(message, Request.class);
    }
    
}
