package com.credencial.util.tecas.core.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class AhorroCoreResponse implements Serializable, JSonable {

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, AhorroCoreResponse.class);
    }

    /**
     * @return the encodedKey
     */
    public String getEncodedKey() {
        return encodedKey;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param encodedKey the encodedKey to set
     */
    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    private String encodedKey;
    private String id;
}
