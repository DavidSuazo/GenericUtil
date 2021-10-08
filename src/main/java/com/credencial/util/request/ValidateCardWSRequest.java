package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class ValidateCardWSRequest extends GBMBaseRequest implements Serializable, JSonable {

    @SerializedName(value = "request")
    private  ValidateCardRequest cardRequest;
   
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }
    
    public String toJsonExclude() {
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(new NoModuleExclusionStrategy(false))
                .addDeserializationExclusionStrategy(new NoModuleExclusionStrategy(true))
                .create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ValidateCardWSRequest.class);
    }

    public ValidateCardRequest getCardRequest() {
        return cardRequest;
    }

    public void setCardRequest(ValidateCardRequest cardRequest) {
        this.cardRequest = cardRequest;
    }
}
