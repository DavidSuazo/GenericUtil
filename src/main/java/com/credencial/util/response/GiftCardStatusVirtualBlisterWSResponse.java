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
public class GiftCardStatusVirtualBlisterWSResponse implements Serializable, JSonable {

    @SerializedName(value = "response")
    private GiftCardStatusVirtualBlisterResponse giftCardStatusVirtualBlisterResponse;

    public GiftCardStatusVirtualBlisterResponse getGiftCardStatusVirtualBlisterResponse() {
        return giftCardStatusVirtualBlisterResponse;
    }

    public void setGiftCardStatusVirtualBlisterResponse(GiftCardStatusVirtualBlisterResponse giftCardStatusVirtualBlisterResponse) {
        this.giftCardStatusVirtualBlisterResponse = giftCardStatusVirtualBlisterResponse;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, GiftCardStatusVirtualBlisterWSResponse.class);
    }
}
