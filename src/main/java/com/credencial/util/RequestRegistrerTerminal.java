
package com.credencial.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author donma
 */
public class RequestRegistrerTerminal implements Serializable,JSonable {
    
    private String idDistributor;
    private String codeDistributor;
    private String password;
    private String phone;
    private String nip;

 
     @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

  @Override
    public Object fromJSON(String message) {
         Gson gson = new  GsonBuilder().setDateFormat("yyyy-MM-dd").create();
     return gson.fromJson(message, RequestRegistrerTerminal.class);
    }

    /**
     * @return the idDitributor
     */
    public String getIdDistributor() {
        return idDistributor;
    }

    /**
     * @param idDistributor the idDitributor to set
     */
    public void setIdDitributor(String idDistributor) {
        this.idDistributor = idDistributor;
    }

    /**
     * @return the codeDistributor
     */
    public String getCodeDistributor() {
        return codeDistributor;
    }

    /**
     * @param codeDistributor the codeDistributor to set
     */
    public void setCodeDistributor(String codeDistributor) {
        this.codeDistributor = codeDistributor;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }
}
