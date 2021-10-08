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
public class BalanceTransactionsResponse extends BaseAutorizaResponse implements Serializable, JSonable  {

    private BigDecimal availableConsumptions;
    private BigDecimal availableDues;
    private BigDecimal availableAdvances;
    private BigDecimal availableLoans;
    private BigDecimal balanceLaterCountDestiny;
    private BigDecimal balanceCountDestiny;
    private BigDecimal minimumPayment;
    private BigDecimal debtToDay;
    private String dateDateOfLastLiqidation;
    private List<Transaction> transactions;
    private BigDecimal depositsOfTheDay;
    private BigDecimal retreatsOfTheDay;

    public BigDecimal getDepositsOfTheDay() {
        return depositsOfTheDay;
    }

    public BigDecimal getRetreatsOfTheDay() {
        return retreatsOfTheDay;
    }

    public void setDepositsOfTheDay(BigDecimal depositsOfTheDay) {
        this.depositsOfTheDay = depositsOfTheDay;
    }

    public void setRetreatsOfTheDay(BigDecimal retreatsOfTheDay) {
        this.retreatsOfTheDay = retreatsOfTheDay;
    }

    public BigDecimal getAvailableAdvances() {
        return availableAdvances;
    }

    public BigDecimal getAvailableConsumptions() {
        return availableConsumptions;
    }

    public BigDecimal getAvailableLoans() {
        return availableLoans;
    }

    public BigDecimal getBalanceCountDestiny() {
        return balanceCountDestiny;
    }

    public BigDecimal getBalanceLaterCountDestiny() {
        return balanceLaterCountDestiny;
    }

    public String getDateDateOfLastLiqidation() {
        return dateDateOfLastLiqidation;
    }

    public BigDecimal getDebtToDay() {
        return debtToDay;
    }

    public BigDecimal getMinimumPayment() {
        return minimumPayment;
    }

    public void setAvailableAdvances(BigDecimal availableAdvances) {
        this.availableAdvances = availableAdvances;
    }

    public void setAvailableConsumptions(BigDecimal availableConsumptions) {
        this.availableConsumptions = availableConsumptions;
    }

    public void setAvailableLoans(BigDecimal availableLoans) {
        this.availableLoans = availableLoans;
    }

    public void setBalanceCountDestiny(BigDecimal balanceCountDestiny) {
        this.balanceCountDestiny = balanceCountDestiny;
    }

    public void setBalanceLaterCountDestiny(BigDecimal balanceLaterCountDestiny) {
        this.balanceLaterCountDestiny = balanceLaterCountDestiny;
    }

    public void setDateDateOfLastLiqidation(String dateDateOfLastLiqidation) {
        this.dateDateOfLastLiqidation = dateDateOfLastLiqidation;
    }

    public void setDebtToDay(BigDecimal debtToDay) {
        this.debtToDay = debtToDay;
    }

    public void setMinimumPayment(BigDecimal minimumPayment) {
        this.minimumPayment = minimumPayment;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public BigDecimal getAvailableDues() {
        return availableDues;
    }

    public void setAvailableDues(BigDecimal availableDues) {
        this.availableDues = availableDues;
    }
  @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, BalanceTransactionsResponse.class);
    }

}
