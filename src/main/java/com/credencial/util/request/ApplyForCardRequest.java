package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ApplyForCardRequest extends GBMBaseRequest implements Serializable, JSonable {

    private int idUser;
    private String typeProduct;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ApplyForCardRequest.class);
    }

    public int getIdUser() {
        return idUser;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

}
