package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class Identification {

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getCountry() {
        return country;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    private String type;
    private String number;
    private String country;
    
}
