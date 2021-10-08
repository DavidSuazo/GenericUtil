package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class UpdatePinDriverRequest extends GBMBaseRequest implements Serializable, JSonable {

    private String pinDriver;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, UpdatePinDriverRequest.class);
    }

    public String getPinDriver() {
        return pinDriver;
    }

    public void setPinDriver(String pinDriver) {
        this.pinDriver = pinDriver;
    }



}
