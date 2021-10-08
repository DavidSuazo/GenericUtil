package com.credencial.util.altaweb.cgi;

import java.util.ArrayList;
import com.credencial.util.conciliacion.response.Consumo;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author tecto
 */
public class Consumos {

    private String FechaOperacion;
    private String DetalleOperacion;
    private String ImporteDolares;
    private String Cupon;
    private String ImportePesos;
    private String Ult4;
    private String Autoriz;

    public String getFechaOperacion() {
        return FechaOperacion;
    }

    @XmlElement(name = "FechaOperacion")
    public void setFechaOperacion(String FechaOperacion) {
        this.FechaOperacion = FechaOperacion;
    }

    public String getDetalleOperacion() {
        return DetalleOperacion;
    }

    @XmlElement(name = "DetalleOperacion")
    public void setDetalleOperacion(String DetalleOperacion) {
        this.DetalleOperacion = DetalleOperacion;
    }

    public String getImporteDolares() {
        return ImporteDolares;
    }

    @XmlElement(name = "ImporteDolares")
    public void setImporteDolares(String ImporteDolares) {
        this.ImporteDolares = ImporteDolares;
    }

    public String getCupon() {
        return Cupon;
    }

    @XmlElement(name = "Cupon")
    public void setCupon(String Cupon) {
        this.Cupon = Cupon;
    }

    public String getImportePesos() {
        return ImportePesos;
    }

    @XmlElement(name = "ImportePesos")
    public void setImportePesos(String ImportePesos) {
        this.ImportePesos = ImportePesos;
    }

    public String getUlt4() {
        return Ult4;
    }

    @XmlElement(name = "Ult4")
    public void setUlt4(String Ult4) {
        this.Ult4 = Ult4;
    }

    public String getAutoriz() {
        return Autoriz;
    }

    @XmlElement(name = "Autoriz")
    public void setAutoriz(String Autoriz) {
        this.Autoriz = Autoriz;
    }

    @Override
    public String toString() {
        return "ClassPojo [FechaOperacion = " + FechaOperacion + ", DetalleOperacion = " + DetalleOperacion + ", ImporteDolares = " + ImporteDolares + ", Cupon = " + Cupon + ", ImportePesos = " + ImportePesos + ", Ult4 = " + Ult4 + "]";
    }
}
