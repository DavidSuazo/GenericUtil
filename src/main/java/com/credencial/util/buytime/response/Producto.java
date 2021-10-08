/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.buytime.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author David
 */
public class Producto implements Serializable, JSonable {

    /**
     * @return the servicio
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the idServicio
     */
    public String getIdServicio() {
        return idServicio;
    }

    /**
     * @param idServicio the idServicio to set
     */
    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the idCatTipoServicio
     */
    public String getIdCatTipoServicio() {
        return idCatTipoServicio;
    }

    /**
     * @param idCatTipoServicio the idCatTipoServicio to set
     */
    public void setIdCatTipoServicio(String idCatTipoServicio) {
        this.idCatTipoServicio = idCatTipoServicio;
    }

    /**
     * @return the tipoFront
     */
    public String getTipoFront() {
        return tipoFront;
    }

    /**
     * @param tipoFront the tipoFront to set
     */
    public void setTipoFront(String tipoFront) {
        this.tipoFront = tipoFront;
    }

    /**
     * @return the hasDigitoVerificador
     */
    public String getHasDigitoVerificador() {
        return hasDigitoVerificador;
    }

    /**
     * @param hasDigitoVerificador the hasDigitoVerificador to set
     */
    public void setHasDigitoVerificador(String hasDigitoVerificador) {
        this.hasDigitoVerificador = hasDigitoVerificador;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the showAyuda
     */
    public String getShowAyuda() {
        return showAyuda;
    }

    /**
     * @param showAyuda the showAyuda to set
     */
    public void setShowAyuda(String showAyuda) {
        this.showAyuda = showAyuda;
    }

   

 private String servicio;
 private String producto;
 private String idServicio;
 private String idProducto;
 private String idCatTipoServicio;
 private String tipoFront;
 private String hasDigitoVerificador;
 private String precio;
 private String showAyuda;

    @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Producto.class);
    }
    
}
