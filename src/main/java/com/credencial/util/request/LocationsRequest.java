package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class LocationsRequest {

    private int idProvince;
    private String codProv;
    private String postalCode;
    private String bundle;
    private int idContex;
    private int isCPEmpty;

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public int getIdContex() {
        return idContex;
    }

    public void setIdContex(int idContex) {
        this.idContex = idContex;
    }

    public String getCodProv() {
        return codProv;
    }

    public void setCodProv(String codProv) {
        this.codProv = codProv;
    }

    public int getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getIsCPEmpty() {
        return isCPEmpty;
    }

    public void setIsCPEmpty(int isCPEmpty) {
        this.isCPEmpty = isCPEmpty;
    }

}
