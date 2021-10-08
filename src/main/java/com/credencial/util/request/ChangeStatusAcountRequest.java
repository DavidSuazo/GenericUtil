package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ChangeStatusAcountRequest extends GBMBaseRequest  implements Serializable,JSonable{
    
    private AuthenticationSRT authenticationSRT;
    private Originator originator;
    private String acount;
    private String newState;
    
    

    public Originator getOriginator() {
        return originator;
    }


    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
    
      @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ChangeStatusAcountRequest.class);
    }

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }

    public AuthenticationSRT getAuthenticationSRT() {
        return authenticationSRT;
    }

    public void setAuthenticationSRT(AuthenticationSRT authenticationSRT) {
        this.authenticationSRT = authenticationSRT;
    }

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }
     
    
}
