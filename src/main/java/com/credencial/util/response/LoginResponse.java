package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class LoginResponse implements Serializable, JSonable {

    private StatusByCardResponse statusByCardResponse;
    private BalanceTransactionsResponse balanceTransactionsResponse;
    private String cardNumber;
    private int idUser;
    private int idStatus;
    private String alias;
    private String dni;
    private String keyOnboard;
    private String pinDriver;
    private String clabe;
    private String telephone;
    private String pushToken;
    private String vencimiento;
    private String num_cuenta;
    private String fullName;
    private String webRregistration;
    private int catalogVersion;
    private String cbu;

    public String getCardNumber() {
        return cardNumber;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public StatusByCardResponse getStatusByCardResponse() {
        return statusByCardResponse;
    }

    public void setStatusByCardResponse(StatusByCardResponse statusByCardResponse) {
        this.statusByCardResponse = statusByCardResponse;
    }

    public BalanceTransactionsResponse getBalanceTransactionsResponse() {
        return balanceTransactionsResponse;
    }

    public void setBalanceTransactionsResponse(BalanceTransactionsResponse balanceTransactionsResponse) {
        this.balanceTransactionsResponse = balanceTransactionsResponse;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, LoginResponse.class);
    }

    public String getKeyOnboard() {
        return keyOnboard;
    }

    public void setKeyOnboard(String keyOnboard) {
        this.keyOnboard = keyOnboard;
    }

    public String getPinDriver() {
        return pinDriver;
    }

    public void setPinDriver(String pinDriver) {
        this.pinDriver = pinDriver;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getWebRregistration() {
        return webRregistration;
    }

    public void setWebRregistration(String webRregistration) {
        this.webRregistration = webRregistration;
    }

    public int getCatalogVersion() {
        return catalogVersion;
    }

    public void setCatalogVersion(int catalogVersion) {
        this.catalogVersion = catalogVersion;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

}
