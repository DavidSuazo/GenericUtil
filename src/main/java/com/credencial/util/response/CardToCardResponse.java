package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author cj_sr
 */
public class CardToCardResponse extends BaseAutorizaResponse implements Serializable, JSonable {

    private BigDecimal balanceLater;
    private BigDecimal balanceLaterCountDestiny;
    private BigDecimal balanceCountDestiny;
    private List<Transaction> transactions;
    private String numericRef;
    private String keyTracking;

    public String getNumericRef() {
        return numericRef;
    }

    public String getKeyTracking() {
        return keyTracking;
    }

    public void setNumericRef(String numericRef) {
        this.numericRef = numericRef;
    }

    public void setKeyTracking(String keyTracking) {
        this.keyTracking = keyTracking;
    }

    public BigDecimal getBalanceCountDestiny() {
        return balanceCountDestiny;
    }

    public BigDecimal getBalanceLater() {
        return balanceLater;
    }

    public BigDecimal getBalanceLaterCountDestiny() {
        return balanceLaterCountDestiny;
    }

    public void setBalanceCountDestiny(BigDecimal balanceCountDestiny) {
        this.balanceCountDestiny = balanceCountDestiny;
    }

    public void setBalanceLater(BigDecimal balanceLater) {
        this.balanceLater = balanceLater;
    }

    public void setBalanceLaterCountDestiny(BigDecimal balanceLaterCountDestiny) {
        this.balanceLaterCountDestiny = balanceLaterCountDestiny;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CardToCardResponse.class);
    }

}
