package com.credencial.util.response;

import java.math.BigDecimal;

/**
 *
 * @author cj_sr
 */
public class BaseAutorizaResponse {

    private String authorizationCode;
    private String transactionExternoId;
    private String transactionId;
    private String typoCoding;
    private String dataAdd;
    private BigDecimal balance;
    private BigDecimal balanceDollars;

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getBalanceDollars() {
        return balanceDollars;
    }

    public String getDataAdd() {
        return dataAdd;
    }

    public String getTransactionExternoId() {
        return transactionExternoId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getTypoCoding() {
        return typoCoding;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setBalanceDollars(BigDecimal balanceDollars) {
        this.balanceDollars = balanceDollars;
    }

    public void setDataAdd(String dataAdd) {
        this.dataAdd = dataAdd;
    }

    public void setTransactionExternoId(String transactionExternoId) {
        this.transactionExternoId = transactionExternoId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setTypoCoding(String typoCoding) {
        this.typoCoding = typoCoding;
    }

}
