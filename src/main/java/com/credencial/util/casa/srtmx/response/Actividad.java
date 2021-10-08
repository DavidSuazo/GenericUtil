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
public class Actividad implements Serializable, JSonable {

    private String momentoUltimaActualizacion;
    private String momentoUltimaOperacionAprobada;
    private String momentoUltimaOperacionDenegada;
    private String momentoUltimaAltaBoletin;
    private String momentoUltimaBajaBoletin;

    public Actividad() {
    }

    public Actividad(String momentoUltimaActualizacion,
            String momentoUltimaOperacionAprobada,
            String momentoUltimaOperacionDenegada,
            String momentoUltimaAltaBoletin,
            String momentoUltimaBajaBoletin) {
        this.momentoUltimaActualizacion = momentoUltimaActualizacion;
        this.momentoUltimaOperacionAprobada = momentoUltimaOperacionAprobada;
        this.momentoUltimaOperacionDenegada = momentoUltimaOperacionDenegada;
        this.momentoUltimaAltaBoletin = momentoUltimaAltaBoletin;
        this.momentoUltimaBajaBoletin = momentoUltimaBajaBoletin;
    }

    public String getMomentoUltimaActualizacion() {
        return momentoUltimaActualizacion;
    }

    public void setMomentoUltimaActualizacion(String MomentoUltimaActualizacion) {
        this.momentoUltimaActualizacion = MomentoUltimaActualizacion;
    }

    public String getMomentoUltimaOperacionAprobada() {
        return momentoUltimaOperacionAprobada;
    }

    public void setMomentoUltimaOperacionAprobada(String MomentoUltimaOperacionAprobada) {
        this.momentoUltimaOperacionAprobada = MomentoUltimaOperacionAprobada;
    }

    public String getMomentoUltimaOperacionDenegada() {
        return momentoUltimaOperacionDenegada;
    }

    public void setMomentoUltimaOperacionDenegada(String MomentoUltimaOperacionDenegada) {
        this.momentoUltimaOperacionDenegada = MomentoUltimaOperacionDenegada;
    }

    public String getMomentoUltimaAltaBoletin() {
        return momentoUltimaAltaBoletin;
    }

    public void setMomentoUltimaAltaBoletin(String MomentoUltimaAltaBoletin) {
        this.momentoUltimaAltaBoletin = MomentoUltimaAltaBoletin;
    }

    public String getMomentoUltimaBajaBoletin() {
        return momentoUltimaBajaBoletin;
    }

    public void setMomentoUltimaBajaBoletin(String MomentoUltimaBajaBoletin) {
        this.momentoUltimaBajaBoletin = MomentoUltimaBajaBoletin;
    }

       @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Actividad.class);
    }
    

}
