package com.credencial.util.tecas.core.response;

import java.util.List;

/**
 *
 * @author tecto
 */
public class ConfiguracionPagoInteres {

    private String puntoPagoInteres;
    private List<Object> fechasPagoIntereses;

    public String getPuntoPagoInteres() {
        return puntoPagoInteres;
    }

    public void setPuntoPagoInteres(String puntoPagoInteres) {
        this.puntoPagoInteres = puntoPagoInteres;
    }

    public List<Object> getFechasPagoIntereses() {
        return fechasPagoIntereses;
    }

    public void setFechasPagoIntereses(List<Object> fechasPagoIntereses) {
        this.fechasPagoIntereses = fechasPagoIntereses;
    }

}
