package com.credencial.util.invoker.bill;

import com.credencial.util.JSonable;
import com.credencial.util.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author cj_sr
 */
public class EntityOautRequest implements JSonable {

    private String user;
    private String password;
    private String entity;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.fromJson(message, EntityOautRequest.class);

    }
}
