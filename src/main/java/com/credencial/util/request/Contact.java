package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class Contact extends GBMBaseRequest implements Serializable, JSonable {

    private String nameAlias;
    private String numberTelephone;
    private String typeContact;
    private String mail;
    private String dateRegister;
    private String idUser;
    private String full_name;
    private String type_transfer;
    private String name_institution;
    private String id_institution;
    private String id_contacts;
    private String operation;
    private String typeAccount;
    private String razonSocial;
    private String cuitRfc;

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Contact.class);
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getType_transfer() {
        return type_transfer;
    }

    public void setType_transfer(String type_transfer) {
        this.type_transfer = type_transfer;
    }

    public String getName_institution() {
        return name_institution;
    }

    public void setName_institution(String name_institution) {
        this.name_institution = name_institution;
    }

    public String getId_institution() {
        return id_institution;
    }

    public void setId_institution(String id_institution) {
        this.id_institution = id_institution;
    }

    public String getId_contacts() {
        return id_contacts;
    }

    public void setId_contacts(String id_contacts) {
        this.id_contacts = id_contacts;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuitRfc() {
        return cuitRfc;
    }

    public void setCuitRfc(String cuitRfc) {
        this.cuitRfc = cuitRfc;
    }

}
