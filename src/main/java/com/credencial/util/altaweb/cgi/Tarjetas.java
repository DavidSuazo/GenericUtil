package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
//@XmlRootElement(name = "Tarjetas")
public class Tarjetas {

    private String Marca;
    private String Flag;
    private String Numero;
    private String Cuenta;
    private String Vtoact;

    public String getMarca() {
        return Marca;
    }

    @XmlElement(name = "Marca")
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getFlag() {
        return Flag;
    }

    @XmlElement(name = "Flag")
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    public String getNumero() {
        return Numero;
    }

    @XmlElement(name = "Numero")
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCuenta() {
        return Cuenta;
    }

    @XmlElement(name = "Cuenta")
    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getVtoAct() {
        return Vtoact;
    }

    @XmlElement(name = "Vtoact")
    public void setVtoAct(String Vtoact) {
        this.Vtoact = Vtoact;
    }

    @Override
    public String toString() {
        return "ClassPojo [Numero = " + Numero + ", Marca = " + Marca + ", Vtoact = " + Vtoact + ", Flag = " + Flag + ", Cuenta = " + Cuenta + "]";
    }

}
