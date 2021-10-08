package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
//@XmlRootElement(name = "Usuario")
public class Usuario {

    private String identificador;
    private String tipoIdentificador;
    private String pin;

    public String getIdentificador() {
        return identificador;
    }

    @XmlElement(name = "Identificador")
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoIdentificador() {
        return tipoIdentificador;
    }

    @XmlElement(name = "TipoIdentificador")
    public void setTipoIdentificador(String tipoIdentificador) {
        this.tipoIdentificador = tipoIdentificador;
    }

    public String getPin() {
        return pin;
    }

    @XmlElement(name = "Pin")
    public void setPin(String pin) {
        this.pin = pin;
    }

}
