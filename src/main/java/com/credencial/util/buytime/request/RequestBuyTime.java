package com.credencial.util.buytime.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author David
 */
public class RequestBuyTime implements JSonable {
    
    private String nameService;
    private String codigoDispositivo;
    private String password;
    private String idDistribuidor;
    private String telefono;
    private String idServicio;
    private String nameServicio;
    private String idProducto;
    private String nameProducto;
    private String precio;
    private String numeroSerie;
    private String idSucursal;
    private String horaLocal;
    private String referencia;
    private String montoPago;
    
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * @param numeroSerie the numeroSerie to set
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * @return the idSucursal
     */
    public String getIdSucursal() {
        return idSucursal;
    }

    /**
     * @param idSucursal the idSucursal to set
     */
    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    /**
     * @return the horaLocal
     */
    public String getHoraLocal() {
        return horaLocal;
    }

    /**
     * @param horaLocal the horaLocal to set
     */
    public void setHoraLocal(String horaLocal) {
        this.horaLocal = horaLocal;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the montoPago
     */
    public String getMontoPago() {
        return montoPago;
    }

    /**
     * @param montoPago the montoPago to set
     */
    public void setMontoPago(String montoPago) {
        this.montoPago = montoPago;
    }
    public String getNameService() {
        return nameService;
    }

    /**
     * @param nameService the nameService to set
     */
    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    /**
     * @return the codigoDispositivo
     */
    public String getCodigoDispositivo() {
        return codigoDispositivo;
    }

    /**
     * @param codigoDispositivo the codigoDispositivo to set
     */
    public void setCodigoDispositivo(String codigoDispositivo) {
        this.codigoDispositivo = codigoDispositivo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the idDistribuidor
     */
    public String getIdDistribuidor() {
        return idDistribuidor;
    }

    /**
     * @param idDistribuidor the idDistribuidor to set
     */
    public void setIdDistribuidor(String idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the idServicio
     */
    public String getIdServicio() {
        return idServicio;
    }

    /**
     * @param idServicio the idServicio to set
     */
    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, RequestBuyTime.class);
    }

    public String getNameServicio() {
        return nameServicio;
    }

    public void setNameServicio(String nameServicio) {
        this.nameServicio = nameServicio;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
