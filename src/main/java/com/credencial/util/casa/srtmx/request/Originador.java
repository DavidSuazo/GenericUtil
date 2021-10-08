/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.casa.srtmx.request;

/**
 *
 * @author David
 */
public class Originador {

    private String Solicitante;
    private String ZonaHoraria;

    public Originador(String solicitante, String zona) {
        this.Solicitante = solicitante;
        this.ZonaHoraria = zona;
    }

    public Originador() {
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String Solicitante) {
        this.Solicitante = Solicitante;
    }

    public String getZonaHoraria() {
        return ZonaHoraria;
    }

    public void setZonaHoraria(String ZonaHoraria) {
        this.ZonaHoraria = ZonaHoraria;
    }

}
