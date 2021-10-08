package com.credencial.util.request;

import java.math.BigDecimal;

/**
 *
 * @author cj_sr
 */
public class AuthorizationDetail {

    private String email;
    private String idAuthorization;
    private int type;
    private String code;
    private String authNumber;
    private String transactionExtId;
    private String transactionId;
    private String message;
    private BigDecimal amount;
    private BigDecimal amountWithFirstComission;
    private BigDecimal amountWithTwoComission;
    private BigDecimal amountPesosArg;
    private String tokenDriver;
    private String fullLastName;
    private String dateTime;
    private String bank;
    private String sucursal;
    private String beneficiary;
    private String account;

    public String getEmail() {
        return email;
    }

    public String getIdAuthorization() {
        return idAuthorization;
    }

    public int getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public String getAuthNumber() {
        return authNumber;
    }

    public String getTransactionExtId() {
        return transactionExtId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getMessage() {
        return message;
    }

    public String getTokenDriver() {
        return tokenDriver;
    }

    public String getFullLastName() {
        return fullLastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdAuthorization(String idAuthorization) {
        this.idAuthorization = idAuthorization;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public void setTransactionExtId(String transactionExtId) {
        this.transactionExtId = transactionExtId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTokenDriver(String tokenDriver) {
        this.tokenDriver = tokenDriver;
    }

    public void setFullLastName(String fullLastName) {
        this.fullLastName = fullLastName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountWithFirstComission() {
        return amountWithFirstComission;
    }

    public void setAmountWithFirstComission(BigDecimal amountWithFirstComission) {
        this.amountWithFirstComission = amountWithFirstComission;
    }

    public BigDecimal getAmountWithTwoComission() {
        return amountWithTwoComission;
    }

    public void setAmountWithTwoComission(BigDecimal amountWithTwoComission) {
        this.amountWithTwoComission = amountWithTwoComission;
    }

    public BigDecimal getAmountPesosArg() {
        return amountPesosArg;
    }

    public void setAmountPesosArg(BigDecimal amountPesosArg) {
        this.amountPesosArg = amountPesosArg;
    }

}
