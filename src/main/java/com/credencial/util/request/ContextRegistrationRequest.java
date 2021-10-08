package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ContextRegistrationRequest implements Serializable, JSonable {

    private String bussinesName;
    private String bussinesNameShort;
    private String addresOne;
    private String addresTwo;
    private String observations;
    private String applicationBundle;
    private String rsaPrivate;
    private String rsaPublic;
    private String applicationKey;
    private String applicationSecret;

    public String getAddresOne() {
        return addresOne;
    }

    public String getAddresTwo() {
        return addresTwo;
    }

    public String getApplicationBundle() {
        return applicationBundle;
    }

    public String getApplicationKey() {
        return applicationKey;
    }

    public String getApplicationSecret() {
        return applicationSecret;
    }

    public String getBussinesName() {
        return bussinesName;
    }

    public String getBussinesNameShort() {
        return bussinesNameShort;
    }

    public String getObservations() {
        return observations;
    }

    public String getRsaPrivate() {
        return rsaPrivate;
    }

    public String getRsaPublic() {
        return rsaPublic;
    }

    public void setAddresOne(String addresOne) {
        this.addresOne = addresOne;
    }

    public void setAddresTwo(String addresTwo) {
        this.addresTwo = addresTwo;
    }

    public void setApplicationBundle(String applicationBundle) {
        this.applicationBundle = applicationBundle;
    }

    public void setApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
    }

    public void setApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
    }

    public void setBussinesName(String bussinesName) {
        this.bussinesName = bussinesName;
    }

    public void setBussinesNameShort(String bussinesNameShort) {
        this.bussinesNameShort = bussinesNameShort;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public void setRsaPrivate(String rsaPrivate) {
        this.rsaPrivate = rsaPrivate;
    }

    public void setRsaPublic(String rsaPublic) {
        this.rsaPublic = rsaPublic;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ContextRegistrationRequest.class);
    }

}
