package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class Authentication  implements Serializable, JSonable {
    private String user;
    private String password;
    private String mail;
    private String originator;
    
    

    public String getMail() {
        return mail;
    }

    public String getOriginator() {
        return originator;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
  
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Authentication.class);
    }
    
}
