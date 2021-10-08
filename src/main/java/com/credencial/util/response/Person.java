package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Person {

    private String denomination;
    private Document document;
    private String telephone;
    private String address;
    private String postalCode;
    private String location;
    private Country country;

    public String getAddress() {
        return address;
    }

    public Country getCountry() {
        return country;
    }

    public String getDenomination() {
        return denomination;
    }

    public Document getDocument() {
        return document;
    }

    public String getLocation() {
        return location;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Person() {
    }

    public Person(String denomination, Document document, String telephone, String address, String postalCode, String location, Country country) {
        this.denomination = denomination;
        this.document = document;
        this.telephone = telephone;
        this.address = address;
        this.postalCode = postalCode;
        this.location = location;
        this.country = country;
    }

}
