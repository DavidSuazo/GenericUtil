package com.credencial.util.tecas.core.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class CuentaRequest implements Serializable, JSonable {

    private String id;
    private String coreId;
    private String nombreAhorro;
    private String idTipoProducto;
    private String tipoTitularCuenta;
    private String idTitularCuenta;
    private Boolean aprobar;
    private DatosAdicionalesCuenta datosAdicionalesCuenta;
    private CamposAdicionales camposAdicionales;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CuentaRequest.class);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoreId() {
        return coreId;
    }

    public void setCoreId(String coreId) {
        this.coreId = coreId;
    }

    public String getNombreAhorro() {
        return nombreAhorro;
    }

    public void setNombreAhorro(String nombreAhorro) {
        this.nombreAhorro = nombreAhorro;
    }

    public String getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(String idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getTipoTitularCuenta() {
        return tipoTitularCuenta;
    }

    public void setTipoTitularCuenta(String tipoTitularCuenta) {
        this.tipoTitularCuenta = tipoTitularCuenta;
    }

    public String getIdTitularCuenta() {
        return idTitularCuenta;
    }

    public void setIdTitularCuenta(String idTitularCuenta) {
        this.idTitularCuenta = idTitularCuenta;
    }

    public Boolean getAprobar() {
        return aprobar;
    }

    public void setAprobar(Boolean aprobar) {
        this.aprobar = aprobar;
    }

    public CamposAdicionales getCamposAdicionales() {
        return camposAdicionales;
    }

    public void setCamposAdicionales(CamposAdicionales camposAdicionales) {
        this.camposAdicionales = camposAdicionales;
    }

    public DatosAdicionalesCuenta getDatosAdicionalesCuenta() {
        return datosAdicionalesCuenta;
    }

    public void setDatosAdicionalesCuenta(DatosAdicionalesCuenta datosAdicionalesCuenta) {
        this.datosAdicionalesCuenta = datosAdicionalesCuenta;
    }

}
