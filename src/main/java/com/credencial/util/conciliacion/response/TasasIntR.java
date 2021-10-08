package com.credencial.util.conciliacion.response;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author tecto
 */
public class TasasIntR {

    @SerializedName(value = "idT", alternate = {"IdT"})
    private String IdT;
    @SerializedName(value = "plan", alternate = {"Plan"})
    private String Plan;
    @SerializedName(value = "tasa", alternate = {"Tasa"})
    private String Tasa;
    @SerializedName(value = "mGr", alternate = {"MGr"})
    private String MGr;
    @SerializedName(value = "fechaVig", alternate = {"FechaVig"})
    private String FechaVig;

    public String getIdT() {
        return IdT;
    }

    public void setIdT(String IdT) {
        this.IdT = IdT;
    }

    public String getPlan() {
        return Plan;
    }

    public void setPlan(String Plan) {
        this.Plan = Plan;
    }

    public String getTasa() {
        return Tasa;
    }

    public void setTasa(String Tasa) {
        this.Tasa = Tasa;
    }

    public String getMGr() {
        return MGr;
    }

    public void setMGr(String MGr) {
        this.MGr = MGr;
    }

    public String getFechaVig() {
        return FechaVig;
    }

    public void setFechaVig(String FechaVig) {
        this.FechaVig = FechaVig;
    }

}
