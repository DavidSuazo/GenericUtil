package com.credencial.util.request;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author cj_sr
 */
public class Aps {
    
    @SerializedName("mutable-content")
    private int mutable_content = 1;

    /**
     * @return the mutable_content
     */
    public int getMutable_content() {
        return mutable_content;
    }

    /**
     * @param mutable_content the mutable_content to set
     */
    public void setMutable_content(int mutable_content) {
        this.mutable_content = mutable_content;
    }
    
}
