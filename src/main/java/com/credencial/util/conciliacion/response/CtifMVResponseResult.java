package com.credencial.util.conciliacion.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author tecto
 */
public class CtifMVResponseResult implements JSonable {

    private String idMov;
    private String numberInstallments;
    private String totalAmount;
    private String accountAmount1;
    private String rate;
    private Boolean isSuccess;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CtifMVResponseResult.class);
    }

    public String getIdMov() {
        return idMov;
    }

    public void setIdMov(String idMov) {
        this.idMov = idMov;
    }

    public String getNumberInstallments() {
        return numberInstallments;
    }

    public void setNumberInstallments(String numberInstallments) {
        this.numberInstallments = numberInstallments;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getAccountAmount1() {
        return accountAmount1;
    }

    public void setAccountAmount1(String accountAmount1) {
        this.accountAmount1 = accountAmount1;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
