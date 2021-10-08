package com.credencial.util.tecas.core.response;

import java.util.List;

/**
 *
 * @author tecto
 */
public class ConfiguraTasaInteres {

    private String encodedKey;
    private String tasaInteres;
    private String frecuenciaCargoInteres;
    private String conteoFrecuenciaCargoInteres;
    private List<Object> nivelesTasaInteres;
    private String terminosTasaInteres;

    public String getEncodedKey() {
        return encodedKey;
    }

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    public String getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(String tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String getFrecuenciaCargoInteres() {
        return frecuenciaCargoInteres;
    }

    public void setFrecuenciaCargoInteres(String frecuenciaCargoInteres) {
        this.frecuenciaCargoInteres = frecuenciaCargoInteres;
    }

    public String getConteoFrecuenciaCargoInteres() {
        return conteoFrecuenciaCargoInteres;
    }

    public void setConteoFrecuenciaCargoInteres(String conteoFrecuenciaCargoInteres) {
        this.conteoFrecuenciaCargoInteres = conteoFrecuenciaCargoInteres;
    }

    public List<Object> getNivelesTasaInteres() {
        return nivelesTasaInteres;
    }

    public void setNivelesTasaInteres(List<Object> nivelesTasaInteres) {
        this.nivelesTasaInteres = nivelesTasaInteres;
    }

    public String getTerminosTasaInteres() {
        return terminosTasaInteres;
    }

    public void setTerminosTasaInteres(String terminosTasaInteres) {
        this.terminosTasaInteres = terminosTasaInteres;
    }

}
