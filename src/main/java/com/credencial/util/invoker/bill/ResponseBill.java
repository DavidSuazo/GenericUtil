package com.credencial.util.invoker.bill;

import com.credencial.util.response.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author cj_sr
 */
public class ResponseBill extends Response{
    
    private AuthenticationResponse authenticationResponse;

    /**
     * @return the authenticationResponse
     */
    public AuthenticationResponse getAuthenticationResponse() {
        return authenticationResponse;
    }

    /**
     * @param authenticationResponse the authenticationResponse to set
     */
    public void setAuthenticationResponse(AuthenticationResponse authenticationResponse) {
        this.authenticationResponse = authenticationResponse;
    }
    
     @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ResponseBill.class);
    }

    
}
