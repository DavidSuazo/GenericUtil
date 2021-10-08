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
public class Documento {

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getIden() {
        return Iden;
    }

    public void setIden(String Iden) {
        this.Iden = Iden;
    }
    private String Tipo;
    private String Iden;
    
    
}
