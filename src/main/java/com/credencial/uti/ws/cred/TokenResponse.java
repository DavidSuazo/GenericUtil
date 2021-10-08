package com.credencial.uti.ws.cred;

import com.credencial.util.JSonable;
import com.credencial.util.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author cj_sr
 */
public class TokenResponse implements JSonable{

    private String token;
    private String token_expiration;
    private float token_expires_in_millis;
    private String token_type;
    private String utcnow;

    // Getter Methods 
    public String getToken() {
        return token;
    }

    public String getToken_expiration() {
        return token_expiration;
    }

    public float getToken_expires_in_millis() {
        return token_expires_in_millis;
    }

    public String getToken_type() {
        return token_type;
    }

    public String getUtcnow() {
        return utcnow;
    }

    // Setter Methods 
    public void setToken(String token) {
        this.token = token;
    }

    public void setToken_expiration(String token_expiration) {
        this.token_expiration = token_expiration;
    }

    public void setToken_expires_in_millis(float token_expires_in_millis) {
        this.token_expires_in_millis = token_expires_in_millis;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public void setUtcnow(String utcnow) {
        this.utcnow = utcnow;

    }
    
    
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.fromJson(message, TokenResponse.class);
    }

}
