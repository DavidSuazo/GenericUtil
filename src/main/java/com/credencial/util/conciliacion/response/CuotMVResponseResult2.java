package com.credencial.util.conciliacion.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tecto
 */
public class CuotMVResponseResult2 implements JSonable {

    private List<TasasIntResponse> tasasIntResponse = new ArrayList<>();
    private List<Consumos> consumos = new ArrayList<>();

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CuotMVResponseResult2.class);
    }

    public List<TasasIntResponse> getTasasIntResponse() {
        return tasasIntResponse;
    }

    public void setTasasIntResponse(List<TasasIntResponse> tasasIntResponse) {
        this.tasasIntResponse = tasasIntResponse;
    }

    public List<Consumos> getConsumos() {
        return consumos;
    }

    public void setConsumos(List<Consumos> consumos) {
        this.consumos = consumos;
    }

}
