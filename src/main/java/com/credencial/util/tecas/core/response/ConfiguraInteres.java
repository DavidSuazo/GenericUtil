package com.credencial.util.tecas.core.response;

import java.util.List;

/**
 *
 * @author tecto
 */
public class ConfiguraInteres {

    private Object tasaInteres;
    private Object origenTasaInteres;
    private boolean devengarInteresDespuesVencimieno;
    private Object metodoAplicacionInteres;
    private Object metodoCalculoSaldoInteres;
    private Object metodoCalculoInteres;
    private Object frecuenciaCargoInteres;
    private Object tipoInteres;
    private boolean acumularInteresTardio;
    private ConfiguraTasaInteres configuraTasaInteres;
    private ConfiguracionPagoInteres configuracionPagoInteres;

    public Object getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Object tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Object getOrigenTasaInteres() {
        return origenTasaInteres;
    }

    public void setOrigenTasaInteres(Object origenTasaInteres) {
        this.origenTasaInteres = origenTasaInteres;
    }

    public boolean isDevengarInteresDespuesVencimieno() {
        return devengarInteresDespuesVencimieno;
    }

    public void setDevengarInteresDespuesVencimieno(boolean devengarInteresDespuesVencimieno) {
        this.devengarInteresDespuesVencimieno = devengarInteresDespuesVencimieno;
    }

    public Object getMetodoAplicacionInteres() {
        return metodoAplicacionInteres;
    }

    public void setMetodoAplicacionInteres(Object metodoAplicacionInteres) {
        this.metodoAplicacionInteres = metodoAplicacionInteres;
    }

    public Object getMetodoCalculoSaldoInteres() {
        return metodoCalculoSaldoInteres;
    }

    public void setMetodoCalculoSaldoInteres(Object metodoCalculoSaldoInteres) {
        this.metodoCalculoSaldoInteres = metodoCalculoSaldoInteres;
    }

    public Object getMetodoCalculoInteres() {
        return metodoCalculoInteres;
    }

    public void setMetodoCalculoInteres(Object metodoCalculoInteres) {
        this.metodoCalculoInteres = metodoCalculoInteres;
    }

    public Object getFrecuenciaCargoInteres() {
        return frecuenciaCargoInteres;
    }

    public void setFrecuenciaCargoInteres(Object frecuenciaCargoInteres) {
        this.frecuenciaCargoInteres = frecuenciaCargoInteres;
    }

    public Object getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(Object tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public boolean isAcumularInteresTardio() {
        return acumularInteresTardio;
    }

    public void setAcumularInteresTardio(boolean acumularInteresTardio) {
        this.acumularInteresTardio = acumularInteresTardio;
    }

    public ConfiguraTasaInteres getConfiguraTasaInteres() {
        return configuraTasaInteres;
    }

    public void setConfiguraTasaInteres(ConfiguraTasaInteres configuraTasaInteres) {
        this.configuraTasaInteres = configuraTasaInteres;
    }

    public ConfiguracionPagoInteres getConfiguracionPagoInteres() {
        return configuracionPagoInteres;
    }

    public void setConfiguracionPagoInteres(ConfiguracionPagoInteres configuracionPagoInteres) {
        this.configuracionPagoInteres = configuracionPagoInteres;
    }

}
