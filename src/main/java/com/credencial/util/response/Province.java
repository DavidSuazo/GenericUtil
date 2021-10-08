package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Province {
         
   private int id_provincia;
   private String nom_provincia;
   private String cod_provincia;
   private String abm;

    public int getId_provincia() {
        return id_provincia;
    }

    public String getNom_provincia() {
        return nom_provincia;
    }

    
    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public void setNom_provincia(String nom_provincia) {
        this.nom_provincia = nom_provincia;
    }


    public String getCod_provincia() {
        return cod_provincia;
    }

    public String getAbm() {
        return abm;
    }

    public void setCod_provincia(String cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    public void setAbm(String abm) {
        this.abm = abm;
    }
    
    
}
