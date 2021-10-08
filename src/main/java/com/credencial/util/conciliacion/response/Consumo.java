package com.credencial.util.conciliacion.response;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author tecto
 */
public class Consumo {

    @SerializedName(value = "fechaOperacion", alternate = {"FechaOperacion"})
    private String FechaOperacion;
    @SerializedName(value = "detalleOperacion", alternate = {"DetalleOperacion"})
    private String DetalleOperacion;
    @SerializedName(value = "importeDolares", alternate = {"ImporteDolares"})
    private String ImporteDolares;
    @SerializedName(value = "rubroComercio", alternate = {"RubroComercio"})
    private String RubroComercio;
    @SerializedName(value = "importePesos", alternate = {"ImportePesos"})
    private String ImportePesos;
    @SerializedName(value = "movId", alternate = {"MovId"})
    private String MovId;
    @SerializedName(value = "tipoTarjeta", alternate = {"TipoTarjeta"})
    private String TipoTarjeta;
    @SerializedName(value = "ult4", alternate = {"Ult4"})
    private int Ult4;

    public String getFechaOperacion() {
        return FechaOperacion;
    }

    public void setFechaOperacion(String FechaOperacion) {
        this.FechaOperacion = FechaOperacion;
    }

    public String getDetalleOperacion() {
        return DetalleOperacion;
    }

    public void setDetalleOperacion(String DetalleOperacion) {
        this.DetalleOperacion = DetalleOperacion;
    }

    public String getImporteDolares() {
        return ImporteDolares;
    }

    public void setImporteDolares(String ImporteDolares) {
        this.ImporteDolares = ImporteDolares;
    }

    public String getRubroComercio() {
        return RubroComercio;
    }

    public void setRubroComercio(String RubroComercio) {
        this.RubroComercio = RubroComercio;
    }

    public String getImportePesos() {
        return ImportePesos;
    }

    public void setImportePesos(String ImportePesos) {
        this.ImportePesos = ImportePesos;
    }

    public String getMovId() {
        return MovId;
    }

    public void setMovId(String MovId) {
        this.MovId = MovId;
    }

    public String getTipoTarjeta() {
        return TipoTarjeta;
    }

    public void setTipoTarjeta(String TipoTarjeta) {
        this.TipoTarjeta = TipoTarjeta;
    }

    public int getUlt4() {
        return Ult4;
    }

    public void setUlt4(int Ult4) {
        this.Ult4 = Ult4;
    }

}
