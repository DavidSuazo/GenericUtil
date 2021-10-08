package com.credencial.util.invoker.bill;

import com.credencial.util.JSonable;
import com.credencial.util.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author cj_sr
 */
public class AuthenticationResponse implements JSonable {

    private String token;
    private String expires;

    public AuthenticationResponse(String token, String expires) {
        this.token = token;
        this.expires = expires;
    }

    public AuthenticationResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.fromJson(message, AuthenticationResponse.class);
    }

}
