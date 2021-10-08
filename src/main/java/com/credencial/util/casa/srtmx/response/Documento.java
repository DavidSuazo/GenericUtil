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
public class Documento implements Serializable, JSonable {

    private String tipo;
    private String iden;

    public Documento(String tipo, String iden) {
        this.tipo = tipo;
        this.iden = iden;
    }

    public Documento() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String Iden) {
        this.iden = Iden;
    }

      @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Documento.class);
    }
    

}
