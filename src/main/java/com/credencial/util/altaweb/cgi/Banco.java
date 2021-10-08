package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
//@XmlRootElement(name = "Banco")
public class Banco {

    private String Codigo;

    public String getCodigo() {
        return Codigo;
    }

    @XmlElement(name = "Codigo")
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

}
