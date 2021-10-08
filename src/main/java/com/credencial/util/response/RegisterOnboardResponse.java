package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.credencial.util.altaweb.cgi.Consumos;
import com.credencial.util.request.RegisterOnboardRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 * @author emilio Created on : 17/07/2019, 02:29:12 AM
 *
 */
public class RegisterOnboardResponse implements Serializable, JSonable {

    private boolean success;

    private String codigo;
    private String mensaje;
    private String alias;
    private String nse;
    private String cuenta;
    private String docID;
    private String pathFile;
    private String errorDescriptionCred;
    private String clabe;
    private String vencimiento;
    private String cardNumber;
    private RegisterOnboardRequest registerOnboardRequest;
    private RegisterMerchantMTTResponse  registerMerchantMTTResponse;
    private Consumos[] consumos;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNse() {
        return nse;
    }

    public void setNse(String nse) {
        this.nse = nse;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getErrorDescriptionCred() {
        return errorDescriptionCred;
    }

    public void setErrorDescriptionCred(String errorDescriptionCred) {
        this.errorDescriptionCred = errorDescriptionCred;
    }

    public RegisterOnboardRequest getRegisterOnboardRequest() {
        return registerOnboardRequest;
    }

    public void setRegisterOnboardRequest(RegisterOnboardRequest registerOnboardRequest) {
        this.registerOnboardRequest = registerOnboardRequest;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, RegisterOnboardResponse.class);
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Consumos[] getConsumos() {
        return consumos;
    }

    public void setConsumos(Consumos[] consumos) {
        this.consumos = consumos;
    }

    public RegisterMerchantMTTResponse getRegisterMerchantMTTResponse() {
        return registerMerchantMTTResponse;
    }

    public void setRegisterMerchantMTTResponse(RegisterMerchantMTTResponse registerMerchantMTTResponse) {
        this.registerMerchantMTTResponse = registerMerchantMTTResponse;
    }

}
