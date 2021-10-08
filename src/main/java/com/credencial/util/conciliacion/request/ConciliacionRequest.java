package com.credencial.util.conciliacion.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class ConciliacionRequest implements Serializable, JSonable {

    private String operacion;
    private String nroCuenta;
    private String numero;
    private String pagina;
    private String registrosPagina;
    private String context;
    private String user;
    private String password;
    private String entityNumber;
    private String typeOperation;
    private String movID;
    private int numberPlans;
    private int numberFees;
    private int rateIdentifier;
    private String synonimus;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getRegistrosPagina() {
        return registrosPagina;
    }

    public void setRegistrosPagina(String registrosPagina) {
        this.registrosPagina = registrosPagina;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEntityNumber() {
        return entityNumber;
    }

    public void setEntityNumber(String entityNumber) {
        this.entityNumber = entityNumber;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ConciliacionRequest.class);
    }

    public String getMovID() {
        return movID;
    }

    public void setMovID(String movID) {
        this.movID = movID;
    }

    public int getNumberPlans() {
        return numberPlans;
    }

    public void setNumberPlans(int numberPlans) {
        this.numberPlans = numberPlans;
    }

    public int getNumberFees() {
        return numberFees;
    }

    public void setNumberFees(int numberFees) {
        this.numberFees = numberFees;
    }

    public int getRateIdentifier() {
        return rateIdentifier;
    }

    public void setRateIdentifier(int rateIdentifier) {
        this.rateIdentifier = rateIdentifier;
    }

    public String getSynonimus() {
        return synonimus;
    }

    public void setSynonimus(String synonimus) {
        this.synonimus = synonimus;
    }
    
}
