package com.credencial.util.tecas.core.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author cj_sr
 */
public class AhorroCoreRequest  implements Serializable, JSonable {

    private String numeroCuenta;
    private BigDecimal monto;
    private String usuario;
    private String terminal;
    private String folioCaja;
    private String forma;
    private String causal;
    private CamposAdicionales CamposAdicionalesObject;
    private String coreId;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, AhorroCoreRequest.class);
    }
    // Getter Methods 
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getFolioCaja() {
        return folioCaja;
    }

    public String getForma() {
        return forma;
    }

    public String getCausal() {
        return causal;
    }

    public CamposAdicionales getCamposAdicionales() {
        return CamposAdicionalesObject;
    }

    public String getCoreId() {
        return coreId;
    }

    // Setter Methods 
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public void setFolioCaja(String folioCaja) {
        this.folioCaja = folioCaja;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setCausal(String causal) {
        this.causal = causal;
    }

    public void setCamposAdicionales(CamposAdicionales camposAdicionalesObject) {
        this.CamposAdicionalesObject = camposAdicionalesObject;
    }

    public void setCoreId(String coreId) {
        this.coreId = coreId;

    }

}
