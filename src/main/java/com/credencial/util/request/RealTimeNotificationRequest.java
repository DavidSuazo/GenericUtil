package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class RealTimeNotificationRequest implements Serializable, JSonable {

    private String merchant_id;
    private String merchant_name;
    private String date_iso_8601;
    private String date_pos;
    private String hour_pos;
    private String heading;
    private String trace_iso_8583;
    private String authorization_code;
    private String origin_amount;
    private String origin_currency_code;
    private String net_amount;
    private String net_currency_code;
    private String acount_number;
    private String system;
    private String transacction;
    private String transacction_type;
    private String transaction_s_type;
    private String pan_last;
    private String masked_pan;
    private String change_type;
    private String alias;
    private String product_code;
    private String response_code;
    private String location;
    private String origin_country;
    private String channel;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, RealTimeNotificationRequest.class);
    }

    /**
     * @return the merchant_id
     */
    public String getMerchant_id() {
        return merchant_id;
    }

    /**
     * @param merchant_id the merchant_id to set
     */
    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    /**
     * @return the merchant_name
     */
    public String getMerchant_name() {
        return merchant_name;
    }

    /**
     * @param merchant_name the merchant_name to set
     */
    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    /**
     * @return the date_iso_8601
     */
    public String getDate_iso_8601() {
        return date_iso_8601;
    }

    /**
     * @param date_iso_8601 the date_iso_8601 to set
     */
    public void setDate_iso_8601(String date_iso_8601) {
        this.date_iso_8601 = date_iso_8601;
    }

    /**
     * @return the date_pos
     */
    public String getDate_pos() {
        return date_pos;
    }

    /**
     * @param date_pos the date_pos to set
     */
    public void setDate_pos(String date_pos) {
        this.date_pos = date_pos;
    }

    /**
     * @return the hour_pos
     */
    public String getHour_pos() {
        return hour_pos;
    }

    /**
     * @param hour_pos the hour_pos to set
     */
    public void setHour_pos(String hour_pos) {
        this.hour_pos = hour_pos;
    }

    /**
     * @return the heading
     */
    public String getHeading() {
        return heading;
    }

    /**
     * @param heading the heading to set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * @return the trace_iso_8583
     */
    public String getTrace_iso_8583() {
        return trace_iso_8583;
    }

    /**
     * @param trace_iso_8583 the trace_iso_8583 to set
     */
    public void setTrace_iso_8583(String trace_iso_8583) {
        this.trace_iso_8583 = trace_iso_8583;
    }

    /**
     * @return the authorization_code
     */
    public String getAuthorization_code() {
        return authorization_code;
    }

    /**
     * @param authorization_code the authorization_code to set
     */
    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    /**
     * @return the origin_amount
     */
    public String getOrigin_amount() {
        return origin_amount;
    }

    /**
     * @param origin_amount the origin_amount to set
     */
    public void setOrigin_amount(String origin_amount) {
        this.origin_amount = origin_amount;
    }

    /**
     * @return the origin_currency_code
     */
    public String getOrigin_currency_code() {
        return origin_currency_code;
    }

    /**
     * @param origin_currency_code the origin_currency_code to set
     */
    public void setOrigin_currency_code(String origin_currency_code) {
        this.origin_currency_code = origin_currency_code;
    }

    /**
     * @return the net_amount
     */
    public String getNet_amount() {
        return net_amount;
    }

    /**
     * @param net_amount the net_amount to set
     */
    public void setNet_amount(String net_amount) {
        this.net_amount = net_amount;
    }

    /**
     * @return the net_currency_code
     */
    public String getNet_currency_code() {
        return net_currency_code;
    }

    /**
     * @param net_currency_code the net_currency_code to set
     */
    public void setNet_currency_code(String net_currency_code) {
        this.net_currency_code = net_currency_code;
    }

    /**
     * @return the acount_number
     */
    public String getAcount_number() {
        return acount_number;
    }

    /**
     * @param acount_number the acount_number to set
     */
    public void setAcount_number(String acount_number) {
        this.acount_number = acount_number;
    }

    /**
     * @return the system
     */
    public String getSystem() {
        return system;
    }

    /**
     * @param system the system to set
     */
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * @return the transacction
     */
    public String getTransacction() {
        return transacction;
    }

    /**
     * @param transacction the transacction to set
     */
    public void setTransacction(String transacction) {
        this.transacction = transacction;
    }

    /**
     * @return the transacction_type
     */
    public String getTransacction_type() {
        return transacction_type;
    }

    /**
     * @param transacction_type the transacction_type to set
     */
    public void setTransacction_type(String transacction_type) {
        this.transacction_type = transacction_type;
    }

    /**
     * @return the transaction_s_type
     */
    public String getTransaction_s_type() {
        return transaction_s_type;
    }

    /**
     * @param transaction_s_type the transaction_s_type to set
     */
    public void setTransaction_s_type(String transaction_s_type) {
        this.transaction_s_type = transaction_s_type;
    }

    /**
     * @return the pan_last
     */
    public String getPan_last() {
        return pan_last;
    }

    /**
     * @param pan_last the pan_last to set
     */
    public void setPan_last(String pan_last) {
        this.pan_last = pan_last;
    }

    /**
     * @return the masked_pan
     */
    public String getMasked_pan() {
        return masked_pan;
    }

    /**
     * @param masked_pan the masked_pan to set
     */
    public void setMasked_pan(String masked_pan) {
        this.masked_pan = masked_pan;
    }

    /**
     * @return the change_type
     */
    public String getChange_type() {
        return change_type;
    }

    /**
     * @param change_type the change_type to set
     */
    public void setChange_type(String change_type) {
        this.change_type = change_type;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the product_code
     */
    public String getProduct_code() {
        return product_code;
    }

    /**
     * @param product_code the product_code to set
     */
    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    /**
     * @return the response_code
     */
    public String getResponse_code() {
        return response_code;
    }

    /**
     * @param response_code the response_code to set
     */
    public void setResponse_code(String response_code) {
        this.response_code = response_code;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the origin_country
     */
    public String getOrigin_country() {
        return origin_country;
    }

    /**
     * @param origin_country the origin_country to set
     */
    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

}
