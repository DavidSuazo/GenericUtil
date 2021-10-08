package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class Originator {
    private String timeZone;
    private String nameSolicitante;
    

    public String getNameSolicitante() {
        return nameSolicitante;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setNameSolicitante(String nameSolicitante) {
        this.nameSolicitante = nameSolicitante;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    
    public Originator(){}
    public Originator(String nameSolicitante, String timeZone){
    this.nameSolicitante = nameSolicitante;
    this.timeZone = timeZone;
    }
    
}
