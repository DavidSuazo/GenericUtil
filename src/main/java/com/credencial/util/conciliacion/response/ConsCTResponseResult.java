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
public class ConsCTResponseResult implements JSonable {

    private ArrayList<ConsCTh> listConsCT = new ArrayList<>();

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ConsCTResponseResult.class);
    }

    public ArrayList<ConsCTh> getListConsCT() {
        return listConsCT;
    }

    public void setListConsCT(ArrayList<ConsCTh> listConsCT) {
        this.listConsCT = listConsCT;
    }

}
