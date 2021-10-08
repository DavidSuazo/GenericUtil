package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class ActividadEconomicaRequest implements Serializable, JSonable {

    private String cod_actividad;
    private String actividad_desc;
    private String actividad_desc_larg;

    public String getCod_actividad() {
        return cod_actividad;
    }

    public void setCod_actividad(String cod_actividad) {
        this.cod_actividad = cod_actividad;
    }

    public String getActividad_desc() {
        return actividad_desc;
    }

    public void setActividad_desc(String actividad_desc) {
        this.actividad_desc = actividad_desc;
    }

    public String getActividad_desc_larg() {
        return actividad_desc_larg;
    }

    public void setActividad_desc_larg(String actividad_desc_larg) {
        this.actividad_desc_larg = actividad_desc_larg;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ActividadEconomicaRequest.class);
    }

    public String toJsonLog() {
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(new NoModuleExclusionStrategy(false))
                .addDeserializationExclusionStrategy(new NoModuleExclusionStrategy(true))
                .create();
        return gson.toJson(this);
    }

}
