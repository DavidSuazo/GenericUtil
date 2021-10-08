/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.altaweb.cgi;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author David
 */
public class ResponseAltaweb implements Serializable, JSonable {

    private RegistracionWebResponse RegistracionWebResponse;

    public RegistracionWebResponse getRegistracionWebResponse() {
        return RegistracionWebResponse;
    }

    @XmlElement(name = "RegistracionWebResponse")
    public void setRegistracionWebResponse(RegistracionWebResponse RegistracionWebResponse) {
        this.RegistracionWebResponse = RegistracionWebResponse;
    }

    @Override
    public String toString() {
        return "ClassPojo [RegistracionWebResponse = " + RegistracionWebResponse + "]";
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ResponseAltaweb.class);
    }

}
