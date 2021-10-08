package com.credencial.util.request;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author cj_sr
 */
public class Payer {

    public String getEmail() {
        return email;
    }

    public String getExternal_reference() {
        return external_reference;
    }

    public String getId() {
        return id;
    }

    public Identification getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Phones> getPhones() {
        return phones;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExternal_reference(String external_reference) {
        this.external_reference = external_reference;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(ArrayList<Phones> phones) {
        this.phones = phones;
    }
    private String id;
    private String external_reference;
    private String name;
    private String email;
    private Identification identification;
    private ArrayList<Phones> phones;
}
