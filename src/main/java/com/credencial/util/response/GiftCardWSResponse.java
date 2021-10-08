package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class GiftCardWSResponse implements Serializable, JSonable {

    @SerializedName(value = "response")
    private GiftCardResponse giftCardResponse;

    public GiftCardResponse getGiftCardResponse() {
        return giftCardResponse;
    }

    public void setGiftCardResponse(GiftCardResponse giftCardResponse) {
        this.giftCardResponse = giftCardResponse;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, GiftCardWSResponse.class);
    }
}
