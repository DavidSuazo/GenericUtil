package com.credencial.util.conciliacion.response;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author tecto
 */
public class ConsCTh {

    @SerializedName(value = "itot", alternate = {"Itot"})
    private String Itot;
    @SerializedName(value = "pgra", alternate = {"Pgra"})
    private String Pgra;
    @SerializedName(value = "idp", alternate = {"Idp"})
    private String Idp;
    @SerializedName(value = "icuo", alternate = {"Icuo"})
    private String Icuo;
    @SerializedName(value = "fOrig", alternate = {"FOrig"})
    private String FOrig;
    @SerializedName(value = "est", alternate = {"Est"})
    private String Est;
    @SerializedName(value = "plan", alternate = {"Plan"})
    private String Plan;

    public String getFOrig() {
        return FOrig;
    }

    public void setFOrig(String FOrig) {
        this.FOrig = FOrig;
    }

    public String getPlan() {
        return Plan;
    }

    public void setPlan(String Plan) {
        this.Plan = Plan;
    }

    public String getItot() {
        return Itot;
    }

    public void setItot(String Itot) {
        this.Itot = Itot;
    }

    public String getIcuo() {
        return Icuo;
    }

    public void setIcuo(String Icuo) {
        this.Icuo = Icuo;
    }

    public String getPgra() {
        return Pgra;
    }

    public void setPgra(String Pgra) {
        this.Pgra = Pgra;
    }

    public String getEst() {
        return Est;
    }

    public void setEst(String Est) {
        this.Est = Est;
    }

    public String getIdp() {
        return Idp;
    }

    public void setIdp(String Idp) {
        this.Idp = Idp;
    }

}
