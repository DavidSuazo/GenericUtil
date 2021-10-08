package com.credencial.util.casa.srtmx.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author David
 */
public class Atencion implements Serializable,JSonable{

    private String inicio;
    private String fin;
    private String tiempo;
    
    public Atencion(String inicio, String fin, String tiempo ){
    this.inicio = inicio;
    this.fin = fin;
    this.tiempo = tiempo;
    }
    
    public Atencion(){}
    
    
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String Inicio) {
        this.inicio = Inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String Fin) {
        this.fin = Fin;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.tiempo = Tiempo;
    }
 
      @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Atencion.class);
    }

    
    
}
