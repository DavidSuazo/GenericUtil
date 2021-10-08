package com.credencial.util.conciliacion.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author tecto
 */
public class CuotMVResponseRoot implements JSonable {

    private boolean success;
    private CuotMVResponseResult cuotMVResponseResult;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CuotMVResponseRoot.class);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CuotMVResponseResult getCuotMVResponseResult() {
        return cuotMVResponseResult;
    }

    public void setCuotMVResponseResult(CuotMVResponseResult cuotMVResponseResult) {
        this.cuotMVResponseResult = cuotMVResponseResult;
    }

}
