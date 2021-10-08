package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ChangeStatusCardResponse implements Serializable, JSonable  {

    private ResponseSrt responseSrt;
    private Attention attention;

    public Attention getAttention() {
        return attention;
    }

   

    public void setAttention(Attention attention) {
        this.attention = attention;
    }

  
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ChangeStatusCardResponse.class);
    }

    public ResponseSrt getResponseSrt() {
        return responseSrt;
    }

    public void setResponseSrt(ResponseSrt responseSrt) {
        this.responseSrt = responseSrt;
    }

}
