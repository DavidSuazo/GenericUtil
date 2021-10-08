package com.credencial.util.response;

/**
 *
 * @author tecto
 */
public class Operation {

    private int idUser;
    private int idOperation;
    private String cbuOrd;
    private String cbuBenef;
    private String cuitBenef;
    private String nombreBenef;
    private String monto;
    private String cuitOrd;
    private String conceptoOper;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(int idOperation) {
        this.idOperation = idOperation;
    }

    public String getCbuOrd() {
        return cbuOrd;
    }

    public void setCbuOrd(String cbuOrd) {
        this.cbuOrd = cbuOrd;
    }

    public String getCbuBenef() {
        return cbuBenef;
    }

    public void setCbuBenef(String cbuBenef) {
        this.cbuBenef = cbuBenef;
    }

    public String getCuitBenef() {
        return cuitBenef;
    }

    public void setCuitBenef(String cuitBenef) {
        this.cuitBenef = cuitBenef;
    }

    public String getNombreBenef() {
        return nombreBenef;
    }

    public void setNombreBenef(String nombreBenef) {
        this.nombreBenef = nombreBenef;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getCuitOrd() {
        return cuitOrd;
    }

    public void setCuitOrd(String cuitOrd) {
        this.cuitOrd = cuitOrd;
    }

    public String getConceptoOper() {
        return conceptoOper;
    }

    public void setConceptoOper(String conceptoOper) {
        this.conceptoOper = conceptoOper;
    }

}
