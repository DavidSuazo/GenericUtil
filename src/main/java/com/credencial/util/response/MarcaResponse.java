package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.credencial.util.request.Marca;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class MarcaResponse implements Serializable, JSonable {

    private ResponseSrt responseSrt;
    private Marca marca;

    public ResponseSrt getResponseSrt() {
        return responseSrt;
    }

    public void setResponseSrt(ResponseSrt responseSrt) {
        this.responseSrt = responseSrt;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, MarcaResponse.class);
    }
}
