package com.credencial.util.spendpay;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class AuthToken implements Serializable, JSonable {

    private String access_token;
    private float expires_in;
    private float refresh_expires_in;
    private String refresh_token;
    private String token_type;
    private float not_before_policy;
    private String session_state;
    private String scope;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, AuthToken.class);
    }

    // Getter Methods 
    public String getAccess_token() {
        return access_token;
    }

    public float getExpires_in() {
        return expires_in;
    }

    public float getRefresh_expires_in() {
        return refresh_expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public String getSession_state() {
        return session_state;
    }

    public String getScope() {
        return scope;
    }

    // Setter Methods 
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setExpires_in(float expires_in) {
        this.expires_in = expires_in;
    }

    public void setRefresh_expires_in(float refresh_expires_in) {
        this.refresh_expires_in = refresh_expires_in;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public void setSession_state(String session_state) {
        this.session_state = session_state;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * @return the not_before_policy
     */
    public float getNot_before_policy() {
        return not_before_policy;
    }

    /**
     * @param not_before_policy the not_before_policy to set
     */
    public void setNot_before_policy(float not_before_policy) {
        this.not_before_policy = not_before_policy;
    }
}
