/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.casa.srtmx.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author David
 */
public class Vigencias implements Serializable, JSonable {

    private String actual;
    private String anterior;

    public Vigencias(String actual, String anterior) {
        this.actual = actual;
        this.anterior = anterior;
    }

    public Vigencias() {
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String Actual) {
        this.actual = Actual;
    }

    public String getAnterior() {
        return anterior;
    }

    public void setAnterior(String Anterior) {
        this.anterior = Anterior;
    }

    @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Vigencias.class);
    }
    
}
