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
public class Persona implements Serializable, JSonable {

    private String denominacion;
    private Documento documento;
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String localidad;
    private Pais pais;

    public Persona() {
    }

    public Persona(String denominacion, Documento doc, String telefono, String direccion, String codPostal, String localidad, Pais pais) {
        this.denominacion = denominacion;
        this.documento = doc;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codPostal;
        this.localidad = localidad;
        this.pais = pais;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String Denominacion) {
        this.denominacion = Denominacion;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.codigoPostal = CodigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String Localidad) {
        this.localidad = Localidad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

       @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Persona.class);
    }
    

}
