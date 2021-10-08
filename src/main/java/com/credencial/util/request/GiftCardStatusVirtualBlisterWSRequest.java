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
public class GiftCardStatusVirtualBlisterWSRequest implements Serializable, JSonable {

    @SerializedName(value = "request")
    public GiftCardStatusVirtualBlisterRequest giftCardStatusVirtualBlisterRequest;

    public GiftCardStatusVirtualBlisterRequest getGiftCardStatusVirtualBlisterRequest() {
        return giftCardStatusVirtualBlisterRequest;
    }

    public void setGiftCardStatusVirtualBlisterRequest(GiftCardStatusVirtualBlisterRequest giftCardStatusVirtualBlisterRequest) {
        this.giftCardStatusVirtualBlisterRequest = giftCardStatusVirtualBlisterRequest;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, GiftCardStatusVirtualBlisterWSRequest.class);
    }
}
