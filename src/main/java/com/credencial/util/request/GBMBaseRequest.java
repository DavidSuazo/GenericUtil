package com.credencial.util.request;

import com.credencial.util.Constantes;
import static com.credencial.util.Constantes.P_PUSH_TOKEN;
import com.google.gson.annotations.Expose;

/**
 *
 * @author cj_sr
 */
public class GBMBaseRequest {

    @Expose(serialize = false, deserialize = true)
    private Authentication authentication;
    private String latitude;
    private String longitude;
    private String pushToken;
    @Expose(serialize = false, deserialize = true)
    private String cardNumber;
    @Expose(serialize = false, deserialize = true)
    private String synonymous;
    private String dateTransaction;
    private String hourTransaction;
    private String transactionSecuence;
    private String commerce;
    private String nameCommerce;
    @Expose(serialize = false, deserialize = true)
    private String terminal;
    private boolean getIsCardRepleced;
    private String lastCardNumber;

    public String getDateTransaction() {
        return dateTransaction;
    }

    public String getHourTransaction() {
        return hourTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public void setHourTransaction(String hourTransaction) {
        this.hourTransaction = hourTransaction;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getPushToken() {
        if (pushToken == null || pushToken.equals(Constantes.EMPTY_STRING)) {
            return P_PUSH_TOKEN;
        } else {
            return pushToken;
        }
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCommerce() {
        return commerce;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getTransactionSecuence() {
        return transactionSecuence;
    }

    public void setCommerce(String commerce) {
        this.commerce = commerce;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public void setTransactionSecuence(String transactionSecuence) {
        this.transactionSecuence = transactionSecuence;
    }

    public String getSynonymous() {
        return synonymous;
    }

    public void setSynonymous(String synonymous) {
        this.synonymous = synonymous;
    }

    public String getNameCommerce() {
        return nameCommerce;
    }

    public void setNameCommerce(String nameCommerce) {
        this.nameCommerce = nameCommerce;
    }

    public boolean isGetIsCardRepleced() {
        return getIsCardRepleced;
    }

    public void setGetIsCardRepleced(boolean getIsCardRepleced) {
        this.getIsCardRepleced = getIsCardRepleced;
    }

    public String getLastCardNumber() {
        return lastCardNumber;
    }

    public void setLastCardNumber(String lastCardNumber) {
        this.lastCardNumber = lastCardNumber;
    }

}
