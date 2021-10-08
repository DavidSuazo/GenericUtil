package com.credencial.uti.ws.cred;

import com.credencial.util.JSonable;
import com.credencial.util.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author cj_sr
 */
public class Data  implements JSonable  {
    
    @SerializedName(value = "ALIAS")
    private String alias;        
    
    @SerializedName(value = "DEN_COM")
    private String denCom;        
    
    @SerializedName(value = "NRO_COM_QR")
    private String nroCom;        
    
    @SerializedName(value = "RUBRO_COM")
    private String rubroCom;        

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @return the denCom
     */
    public String getDenCom() {
        return denCom;
    }

    /**
     * @return the nroCom
     */
    public String getNroCom() {
        return nroCom;
    }

    /**
     * @return the rubroCom
     */
    public String getRubroCom() {
        return rubroCom;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @param denCom the denCom to set
     */
    public void setDenCom(String denCom) {
        this.denCom = denCom;
    }

    /**
     * @param nroCom the nroCom to set
     */
    public void setNroCom(String nroCom) {
        this.nroCom = nroCom;
    }

    /**
     * @param rubroCom the rubroCom to set
     */
    public void setRubroCom(String rubroCom) {
        this.rubroCom = rubroCom;
    }
    
    
    
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.fromJson(message, Data.class);
    }
}
