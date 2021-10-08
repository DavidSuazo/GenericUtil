/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.buytime.xml;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author David
 */
@XmlRootElement(name = "MENSAJE")
public class Mensaje implements Serializable, JSonable{

    private String codigo;

    private String texto;
    
    private String referencia;

    public String getCodigo() {
        return codigo;
    }

    @XmlElement(name = "CODIGO")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTexto() {
        return texto;
    }

    @XmlElement(name = "TEXTO")
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
      @Override
    public String toJson() {
           Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Mensaje.class);
    }

    public String getReferencia() {
        return referencia;
    }

    @XmlElement(name = "REFERENCIA")
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
