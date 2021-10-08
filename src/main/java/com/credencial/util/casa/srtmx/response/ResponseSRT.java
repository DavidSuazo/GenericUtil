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
public class ResponseSRT implements Serializable, JSonable{

    private String codigo;
    private String descripcion;
    private String ticketWS;
    
    public ResponseSRT() {
    }
    /*public Response (String codigo, String descripccion, String ticket){
    this.codigo = codigo;
    this.descripcion =  descripccion;
    this.ticketWS = ticket;
    }*/
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String Codigo) {
        this.codigo = Codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getTicketWS() {
        return ticketWS;
    }

    public void setTicketWS(String TicketWS) {
        this.ticketWS = TicketWS;
    }
   @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ResponseSRT.class);
    }
    
    
}
