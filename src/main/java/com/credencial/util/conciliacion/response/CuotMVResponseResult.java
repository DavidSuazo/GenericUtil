package com.credencial.util.conciliacion.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

/**
 *
 * @author tecto
 */
public class CuotMVResponseResult implements JSonable {

    private ArrayList<TasasIntR> tasasIntResponse = new ArrayList<>();
    private ArrayList<Consumo> consumos = new ArrayList<>();

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CuotMVResponseResult.class);
    }

    public ArrayList<TasasIntR> getTasasIntResponse() {
        return tasasIntResponse;
    }

    public void setTasasIntResponse(ArrayList<TasasIntR> tasasIntResponse) {
        this.tasasIntResponse = tasasIntResponse;
    }

    public ArrayList<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(ArrayList<Consumo> consumos) {
        this.consumos = consumos;
    }

}
