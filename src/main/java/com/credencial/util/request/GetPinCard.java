package com.credencial.util.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetPinCard extends CvvDinamicRequest {

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, GetPinCard.class);
    }
}
