package com.credencial.util.buytime.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author David
 */
public class ResponseBuyTime implements Serializable, JSonable {
    
    private Mensaje mensaje;
    private Productos productos;
    private String id_tx;
    private String numAutorizacion;
    private String saldo_f;
    private String comision;
    private String comision_f;
    private String fecha;
    private String monto;

    public String getId_tx() {
        return id_tx;
    }

    public void setId_tx(String id_tx) {
        this.id_tx = id_tx;
    }

    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    public String getSaldo_f() {
        return saldo_f;
    }

    public void setSaldo_f(String saldo_f) {
        this.saldo_f = saldo_f;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getComision_f() {
        return comision_f;
    }

    public void setComision_f(String comision_f) {
        this.comision_f = comision_f;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
            
    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toJson() {
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ResponseBuyTime.class);
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    
}