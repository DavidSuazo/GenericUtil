package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class InstitutionRequest extends GBMBaseRequest implements Serializable, JSonable{
    private String card_clabe;

    public String getCard_clabe() {
        return card_clabe;
    }

    public void setCard_clabe(String card_clabe) {
        this.card_clabe = card_clabe;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, InstitutionRequest.class);
    }
}
