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
public class GiftCardWSRequest implements Serializable, JSonable {

    @SerializedName(value = "request")
    public GiftCardRequest giftCardRequest;

    public GiftCardRequest getGiftCardRequest() {
        return giftCardRequest;
    }

    public void setGiftCardRequest(GiftCardRequest giftCardRequest) {
        this.giftCardRequest = giftCardRequest;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, GiftCardWSRequest.class);
    }
}
