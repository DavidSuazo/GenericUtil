package com.credencial.util.response;

/**
 *
 * @author tecto
 */
public class Balance {

    private String availableConsumptions;
    private String vailableQuotas;
    private String availableAdvances;
    private String availableLoans;
    private String balance;
    private String balanceDollars;

    public String getAvailableConsumptions() {
        return availableConsumptions;
    }

    public void setAvailableConsumptions(String availableConsumptions) {
        this.availableConsumptions = availableConsumptions;
    }

    public String getVailableQuotas() {
        return vailableQuotas;
    }

    public void setVailableQuotas(String vailableQuotas) {
        this.vailableQuotas = vailableQuotas;
    }

    public String getAvailableAdvances() {
        return availableAdvances;
    }

    public void setAvailableAdvances(String availableAdvances) {
        this.availableAdvances = availableAdvances;
    }

    public String getAvailableLoans() {
        return availableLoans;
    }

    public void setAvailableLoans(String availableLoans) {
        this.availableLoans = availableLoans;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBalanceDollars() {
        return balanceDollars;
    }

    public void setBalanceDollars(String balanceDollars) {
        this.balanceDollars = balanceDollars;
    }

}
