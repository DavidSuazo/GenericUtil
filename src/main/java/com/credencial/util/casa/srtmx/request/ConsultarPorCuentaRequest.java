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
public class ConsultarPorCuentaRequest {

    private Autenticacion autenticacion;
    private Originador originador;
    private String Cuenta;
    private String Pagina;
    private String PideGZ;
    
    public Autenticacion getAutenticacion() {
        return autenticacion;
    }

    public void setAutenticacion(Autenticacion autenticacion) {
        this.autenticacion = autenticacion;
    }

    public Originador getOriginador() {
        return originador;
    }

    public void setOriginador(Originador originador) {
        this.originador = originador;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getPagina() {
        return Pagina;
    }

    public void setPagina(String Pagina) {
        this.Pagina = Pagina;
    }

    public String getPideGZ() {
        return PideGZ;
    }

    public void setPideGZ(String PideGZ) {
        this.PideGZ = PideGZ;
    }
    
}
