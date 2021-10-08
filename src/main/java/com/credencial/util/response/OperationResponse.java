package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author cj_sr
 */
public class OperationResponse implements Serializable, JSonable {

    private Boolean success;
    private String keyTracking;
    private int numericalReference;
    private String folioOrigin;
    private int idUser;
    private String amount;
    private String orderingAcount;
    private String company;
    private String channel;
    private String dateTransaction;
    private String contextApplication;
    private String currency;
    private int idContext;
    private ArrayList<Operation> operations;

    public String getKeyTracking() {
        return keyTracking;
    }

    public int getNumericalReference() {
        return numericalReference;
    }

    public String getFolioOrigin() {
        return folioOrigin;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getAmount() {
        return amount;
    }

    public String getOrderingAcount() {
        return orderingAcount;
    }

    public String getCompany() {
        return company;
    }

    public String getChannel() {
        return channel;
    }

    public void setKeyTracking(String keyTracking) {
        this.keyTracking = keyTracking;
    }

    public void setNumericalReference(int numericalReference) {
        this.numericalReference = numericalReference;
    }

    public void setFolioOrigin(String folioOrigin) {
        this.folioOrigin = folioOrigin;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setOrderingAcount(String orderingAcount) {
        this.orderingAcount = orderingAcount;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, OperationResponse.class);
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getContextApplication() {
        return contextApplication;
    }

    public String getCurrency() {
        return currency;
    }

    public void setContextApplication(String contextApplication) {
        this.contextApplication = contextApplication;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getIdContext() {
        return idContext;
    }

    public void setIdContext(int idContext) {
        this.idContext = idContext;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
