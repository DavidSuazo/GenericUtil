/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.buytime.xml;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author David
 */
@XmlRootElement(name = "RESPONSE")
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

    @XmlElement(name = "ID_TX")
    public void setId_tx(String id_tx) {
        this.id_tx = id_tx;
    }

    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    @XmlElement(name = "NUM_AUTORIZACION")
    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    public String getSaldo_f() {
        return saldo_f;
    }

    @XmlElement(name = "SALDO_F")
    public void setSaldo_f(String saldo_f) {
        this.saldo_f = saldo_f;
    }

    public String getComision() {
        return comision;
    }

    @XmlElement(name = "COMISION")
    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getComision_f() {
        return comision_f;
    }

    @XmlElement(name = "COMISION_F")
    public void setComision_f(String comision_f) {
        this.comision_f = comision_f;
    }

    public String getFecha() {
        return fecha;
    }

    @XmlElement(name = "FECHA")
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMonto() {
        return monto;
    }

    @XmlElement(name = "MONTO")
    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    @XmlElement(name = "MENSAJE")
    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the productos
     */
    public Productos getProductos() {
        return productos;
    }

    @XmlElement(name = "PRODUCTOS")
    public void setProductos(Productos productos) {
        this.productos = productos;
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

}
