package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author tecto
 */
public class RegRep {

    private String pais;
    private String alant;
    private String alact;
    private String panc;

    public String getPais() {
        return pais;
    }

    @XmlElement(name = "Pais")
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAlant() {
        return alant;
    }

    @XmlElement(name = "Alant")
    public void setAlant(String alant) {
        this.alant = alant;
    }

    public String getAlact() {
        return alact;
    }

    @XmlElement(name = "Alact")
    public void setAlact(String alact) {
        this.alact = alact;
    }

    public String getPanc() {
        return panc;
    }

    @XmlElement(name = "Panc")
    public void setPanc(String panc) {
        this.panc = panc;
    }

}
