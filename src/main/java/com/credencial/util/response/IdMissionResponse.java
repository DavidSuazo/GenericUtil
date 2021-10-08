package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.credencial.util.request.Form_Data;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class IdMissionResponse implements Serializable, JSonable {

    private int status_code = 0;
    private String status_message = "Success";

    /**
     * @return the status_code
     */
    public int getStatus_code() {
        return status_code;
    }

    /**
     * @param status_code the status_code to set
     */
    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    /**
     * @return the status_message
     */
    public String getStatus_message() {
        return status_message;
    }

    /**
     * @param status_message the status_message to set
     */
    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, IdMissionResponse.class);
    }

}
