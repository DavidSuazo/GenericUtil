/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
@XmlRootElement(name = "RegMod")
public class RegMod {
    private String pais;
    private String ruc;
    private String alant;
    private String alact;
    private String callEnt;
    private String localEnt;
    private String cposEnt;
    private String plodEnt;
    private String provEnt;
    private String graTar;
    private String mail;
    private String panc;

    public String getPais() {
        return pais;
    }

    @XmlElement(name = "Pais")
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRuc() {
        return ruc;
    }

    @XmlElement(name = "Ruc")
    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getCallEnt() {
        return callEnt;
    }

    @XmlElement(name = "Callent")
    public void setCallEnt(String callEnt) {
        this.callEnt = callEnt;
    }

    public String getLocalEnt() {
        return localEnt;
    }

    @XmlElement(name = "Localent")
    public void setLocalEnt(String localEnt) {
        this.localEnt = localEnt;
    }

    public String getCposEnt() {
        return cposEnt;
    }

    @XmlElement(name = "CPosent")
    public void setCposEnt(String cposEnt) {
        this.cposEnt = cposEnt;
    }

    public String getPlodEnt() {
        return plodEnt;
    }

    @XmlElement(name = "Plodent")
    public void setPlodEnt(String plodEnt) {
        this.plodEnt = plodEnt;
    }

    public String getProvEnt() {
        return provEnt;
    }

    @XmlElement(name = "Provent")
    public void setProvEnt(String provEnt) {
        this.provEnt = provEnt;
    }

    public String getGraTar() {
        return graTar;
    }

    @XmlElement(name = "GraTar")
    public void setGraTar(String graTar) {
        this.graTar = graTar;
    }

    public String getMail() {
        return mail;
    }

    @XmlElement(name = "Mail")
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPanc() {
        return panc;
    }

    @XmlElement(name = "Panc")
    public void setPanc(String panc) {
        this.panc = panc;
    }
    
    
    
}
