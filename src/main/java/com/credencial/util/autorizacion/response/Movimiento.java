/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.autorizacion.response;

/**
 *
 * @author David
 */
public class Movimiento {

    private String fecha;
    private String hora;
    private String comercio;
    private String importe;
    private String descripcionImporte;
    private String codigoAutorizacion;
    private String nombreComercio;
    private String detalleOperacion;
    private String importeDolares;
    private String cupon;
    private String Ult4;
    
    
     /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param Fecha the fecha to set
     */
    public void setFecha(String Fecha) {
        this.fecha = Fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param Hora the hora to set
     */
    public void setHora(String Hora) {
        this.hora = Hora;
    }

    /**
     * @return the comercio
     */
    public String getComercio() {
        return comercio;
    }

    /**
     * @param Comercio the comercio to set
     */
    public void setComercio(String Comercio) {
        this.comercio = Comercio;
    }

    /**
     * @return the importe
     */
    public String getImporte() {
        return importe;
    }

    /**
     * @param Importe the importe to set
     */
    public void setImporte(String Importe) {
        this.importe = Importe;
    }

    /**
     * @return the descripcionImporte
     */
    public String getDescripcionImporte() {
        return descripcionImporte;
    }

    /**
     * @param DescripcionImporte the descripcionImporte to set
     */
    public void setDescripcionImporte(String DescripcionImporte) {
        this.descripcionImporte = DescripcionImporte;
    }

    /**
     * @return the codigoAutorizacion
     */
    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    /**
     * @param CodigoAutorizacion the codigoAutorizacion to set
     */
    public void setCodigoAutorizacion(String CodigoAutorizacion) {
        this.codigoAutorizacion = CodigoAutorizacion;
    }

    public String getNombreComercio() {
        return nombreComercio;
    }

    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    public String getDetalleOperacion() {
        return detalleOperacion;
    }

    public void setDetalleOperacion(String detalleOperacion) {
        this.detalleOperacion = detalleOperacion;
    }

    public String getImporteDolares() {
        return importeDolares;
    }

    public void setImporteDolares(String importeDolares) {
        this.importeDolares = importeDolares;
    }

    public String getCupon() {
        return cupon;
    }

    public void setCupon(String cupon) {
        this.cupon = cupon;
    }

    public String getUlt4() {
        return Ult4;
    }

    public void setUlt4(String Ult4) {
        this.Ult4 = Ult4;
    }
    
    

}
