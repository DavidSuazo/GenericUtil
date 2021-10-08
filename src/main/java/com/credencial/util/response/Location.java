package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Location {

    private String cod_admin;
    private String name;
    private String cod_postal;
    private String cod_prov_admin;

    private String id_provincia;
    private String id_localidad;
    private String c_mnpio;
    private String name_mnpio;
    private String name_localidad;
    private String name_province;
    private String cod_province;

    public void setCod_admin(String cod_admin) {
        this.cod_admin = cod_admin;
    }

    public String getCod_admin() {
        return cod_admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public String getCod_prov_admin() {
        return cod_prov_admin;
    }

    public void setCod_prov_admin(String cod_prov_admin) {
        this.cod_prov_admin = cod_prov_admin;
    }

    public String getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(String id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(String id_localidad) {
        this.id_localidad = id_localidad;
    }

    public String getC_mnpio() {
        return c_mnpio;
    }

    public void setC_mnpio(String c_mnpio) {
        this.c_mnpio = c_mnpio;
    }

    public String getName_mnpio() {
        return name_mnpio;
    }

    public void setName_mnpio(String name_mnpio) {
        this.name_mnpio = name_mnpio;
    }

    public String getName_localidad() {
        return name_localidad;
    }

    public void setName_localidad(String name_localidad) {
        this.name_localidad = name_localidad;
    }

    public String getName_province() {
        return name_province;
    }

    public void setName_province(String name_province) {
        this.name_province = name_province;
    }

    public String getCod_province() {
        return cod_province;
    }

    public void setCod_province(String cod_province) {
        this.cod_province = cod_province;
    }

}
