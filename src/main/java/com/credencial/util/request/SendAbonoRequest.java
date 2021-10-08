package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class SendAbonoRequest implements Serializable, JSonable {

    Abono abono;

    public Abono getAbono() {
        return abono;
    }

    public void setAbono(Abono abonoObject) {
        this.abono = abonoObject;
    }
    
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, SendAbonoRequest.class);
    }    
}
