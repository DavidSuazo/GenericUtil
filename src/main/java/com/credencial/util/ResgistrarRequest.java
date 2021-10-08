/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util;

import com.credencial.util.autorizacion.request.RequestAutorizar;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author David
 */
public class ResgistrarRequest implements JSonable{
    private String usuario;
    private String psw;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ResgistrarRequest.class);
    }
    
    
}
