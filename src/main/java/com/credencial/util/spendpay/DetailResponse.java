package com.credencial.util.spendpay;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cj_sr
 */
public class DetailResponse implements Serializable, JSonable {

    private String id;
    private ArrayList<Detail> details;
    private String status;
    private String coin;
    private double amount;
    private String payment_id;
    private String external_transaction_id;
    private String request_date;
    private String due_date;
    private String approved_date;
    private String collector_id;
    private int code;
    private String message;
    private int extended_code;
    private String alias;
    private String denCom;
    private String nroCom;
    private String rubroCom;

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @return the denCom
     */
    public String getDenCom() {
        return denCom;
    }

    /**
     * @return the nroCom
     */
    public String getNroCom() {
        return nroCom;
    }

    /**
     * @return the rubroCom
     */
    public String getRubroCom() {
        return rubroCom;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @param denCom the denCom to set
     */
    public void setDenCom(String denCom) {
        this.denCom = denCom;
    }

    /**
     * @param nroCom the nroCom to set
     */
    public void setNroCom(String nroCom) {
        this.nroCom = nroCom;
    }

    /**
     * @param rubroCom the rubroCom to set
     */
    public void setRubroCom(String rubroCom) {
        this.rubroCom = rubroCom;
    }


    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the extended_code
     */
    public int getExtended_code() {
        return extended_code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @param extended_code the extended_code to set
     */
    public void setExtended_code(int extended_code) {
        this.extended_code = extended_code;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, DetailResponse.class);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the details
     */
    public List<Detail> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(ArrayList<Detail> details) {
        this.details = details;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the coin
     */
    public String getCoin() {
        return coin;
    }

    /**
     * @param coin the coin to set
     */
    public void setCoin(String coin) {
        this.coin = coin;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the payment_id
     */
    public String getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * @return the external_transaction_id
     */
    public String getExternal_transaction_id() {
        return external_transaction_id;
    }

    /**
     * @param external_transaction_id the external_transaction_id to set
     */
    public void setExternal_transaction_id(String external_transaction_id) {
        this.external_transaction_id = external_transaction_id;
    }

    /**
     * @return the request_date
     */
    public String getRequest_date() {
        return request_date;
    }

    /**
     * @param request_date the request_date to set
     */
    public void setRequest_date(String request_date) {
        this.request_date = request_date;
    }

    /**
     * @return the due_date
     */
    public String getDue_date() {
        return due_date;
    }

    /**
     * @param due_date the due_date to set
     */
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    /**
     * @return the approved_date
     */
    public String getApproved_date() {
        return approved_date;
    }

    /**
     * @param approved_date the approved_date to set
     */
    public void setApproved_date(String approved_date) {
        this.approved_date = approved_date;
    }

    /**
     * @return the collector_id
     */
    public String getCollector_id() {
        return collector_id;
    }

    /**
     * @param collector_id the collector_id to set
     */
    public void setCollector_id(String collector_id) {
        this.collector_id = collector_id;
    }

}
