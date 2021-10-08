package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class InfoUserResponse implements Serializable, JSonable {

    private int idUser;
    private int idContext;
    private String clabe;
    private String telephone;
    private String alias;
    private String pushToken;
    private String bussinesName;
    private String keyPushNotification;
    private String pushFlag;
    private String channel;
    private String currency;
    private String rubro;
    private String commerce_name;
    private String commerce_number;
    private String cuit_rfc;
    private String cbu;

    public int getIdUser() {
        return idUser;
    }

    public String getClabe() {
        return clabe;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPushToken() {
        return pushToken;
    }

    public String getBussinesName() {
        return bussinesName;
    }

    public String getKeyPushNotification() {
        return keyPushNotification;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public void setBussinesName(String bussinesName) {
        this.bussinesName = bussinesName;
    }

    public void setKeyPushNotification(String keyPushNotification) {
        this.keyPushNotification = keyPushNotification;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, InfoUserResponse.class);
    }

    public String getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(String pushFlag) {
        this.pushFlag = pushFlag;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getChannel() {
        return channel;
    }

    public String getCurrency() {
        return currency;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getCommerce_name() {
        return commerce_name;
    }

    public void setCommerce_name(String commerce_name) {
        this.commerce_name = commerce_name;
    }

    public String getCommerce_number() {
        return commerce_number;
    }

    public void setCommerce_number(String commerce_number) {
        this.commerce_number = commerce_number;
    }

    public String getCuit_rfc() {
        return cuit_rfc;
    }

    public void setCuit_rfc(String cuit_rfc) {
        this.cuit_rfc = cuit_rfc;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public int getIdContext() {
        return idContext;
    }

    public void setIdContext(int idContext) {
        this.idContext = idContext;
    }

}
