package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public  class UpdatePasswordResponse implements Serializable, JSonable {

    public String getMessage() {
        return message;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
    
    private String message;
    private String statusDescription;
 
      @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, UpdatePasswordResponse.class);
    }
}
