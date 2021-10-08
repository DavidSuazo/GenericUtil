package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tecto
 */
public class ActividadEconomicaResponse implements Serializable, JSonable {

    private ArrayList<ActividadEconomica> actividadesEconomicas;

    public ArrayList<ActividadEconomica> getActividadesEconomicas() {
        return actividadesEconomicas;
    }

    public void setActividadesEconomicas(ArrayList<ActividadEconomica> actividadesEconomicas) {
        this.actividadesEconomicas = actividadesEconomicas;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ActividadEconomicaResponse.class);
    }
}
