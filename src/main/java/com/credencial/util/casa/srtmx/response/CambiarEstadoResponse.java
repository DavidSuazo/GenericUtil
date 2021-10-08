/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.casa.srtmx.response;

/**
 *
 * @author David
 */
public class CambiarEstadoResponse {

    private Response_SRT response;
    private Atencion atencion;
    
    public CambiarEstadoResponse(){}
    
    public Response_SRT getResponse() {
        return response;
    }

    public void setResponse(Response_SRT response) {
        this.response = response;
    }

    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }
    
}
