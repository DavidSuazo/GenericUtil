package com.credencial.util.digipro;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class FormatResponse implements Serializable, JSonable {

    private String descripcion;

    private String codigo;

    private Klazz klazz;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Klazz getKlazz() {
        return klazz;
    }

    public void setKlazz(Klazz klazz) {
        this.klazz = klazz;
    }

    @Override
    public String toString() {
        return "ClassPojo [descripcion = " + descripcion + ", codigo = " + codigo + ", klazz = " + klazz + "]";
    }
       @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, FormatResponse.class);
    }
}
