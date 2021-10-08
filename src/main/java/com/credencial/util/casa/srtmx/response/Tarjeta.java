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
public class Tarjeta implements Serializable, JSonable {
    private String numero;
    private String cuenta;
    private Entidad entidad;
    private String sucursal;
    private ProductoTarjeta producto;
    private Estado estado;
    private Vigencias vigencias;
    private Persona persona;
    private Actividad actividad;
    private String contadorPinERR;

    public Tarjeta(){}
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.cuenta = Cuenta;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.sucursal = Sucursal;
    }

    public ProductoTarjeta getProducto() {
        return producto;
    }

    public void setProducto(ProductoTarjeta producto) {
        this.producto = producto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Vigencias getVigencias() {
        return vigencias;
    }

    public void setVigencias(Vigencias vigencias) {
        this.vigencias = vigencias;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public String getContadorPinERR() {
        return contadorPinERR;
    }

    public void setContadorPinERR(String ContadorPinERR) {
        this.contadorPinERR = ContadorPinERR;
    }

  
    @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Tarjeta.class);
    }
    
    
    
    
}
