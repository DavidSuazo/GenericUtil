package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class PaymentMethods {

    public Float getAmount() {
        return amount;
    }

    public String getAuthorization_transaction_id() {
        return authorization_transaction_id;
    }

    public Integer getExpiration_month() {
        return expiration_month;
    }

    public Integer getExpiration_year() {
        return expiration_year;
    }

    public Holder getHolder() {
        return holder;
    }

    public Integer getInstallments() {
        return installments;
    }

    public Integer getMedia_payment_id() {
        return media_payment_id;
    }

    public String getNumber() {
        return number;
    }

    public String getPromotion_id() {
        return promotion_id;
    }

    public String getSecurity_code() {
        return security_code;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setAuthorization_transaction_id(String authorization_transaction_id) {
        this.authorization_transaction_id = authorization_transaction_id;
    }

    public void setExpiration_month(Integer expiration_month) {
        this.expiration_month = expiration_month;
    }

    public void setExpiration_year(Integer expiration_year) {
        this.expiration_year = expiration_year;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public void setMedia_payment_id(Integer media_payment_id) {
        this.media_payment_id = media_payment_id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPromotion_id(String promotion_id) {
        this.promotion_id = promotion_id;
    }

    public void setSecurity_code(String security_code) {
        this.security_code = security_code;
    }
    private String authorization_transaction_id;
    private Float  amount;
    private Integer media_payment_id;
    private String number;
    private Integer installments;
    private String promotion_id;
    private Integer expiration_year;
    private Integer expiration_month;
    private String security_code;
    private Holder holder;
    
}
