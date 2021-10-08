package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
@XmlRootElement(name = "RegCom")
public class RegCom {

    private String Pais;
    private String razonSocial;
    private String condTrib;
    private String catContr;
    private String nroIIBB;
    private String cuit;
    private String aliasTar;
    private String calleCom;
    private String puertaCom;
    private String plodCom;
    private String cpCom;
    private String localidadCom;
    private String provCom;

    public String getPais() {
        return Pais;
    }

    @XmlElement(name = "Pais")
    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    @XmlElement(name = "RazonSocial")
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCondTrib() {
        return condTrib;
    }

    @XmlElement(name = "CondTrib")
    public void setCondTrib(String condTrib) {
        this.condTrib = condTrib;
    }

    public String getCatContr() {
        return catContr;
    }

    @XmlElement(name = "CatContr")
    public void setCatContr(String catContr) {
        this.catContr = catContr;
    }

    public String getNroIIBB() {
        return nroIIBB;
    }

    @XmlElement(name = "NroIIBB")
    public void setNroIIBB(String nroIIBB) {
        this.nroIIBB = nroIIBB;
    }

    public String getCuit() {
        return cuit;
    }

    @XmlElement(name = "CUIT")
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getAliasTar() {
        return aliasTar;
    }

    @XmlElement(name = "AliasTar")
    public void setAliasTar(String aliasTar) {
        this.aliasTar = aliasTar;
    }

    public String getCalleCom() {
        return calleCom;
    }

    @XmlElement(name = "CalleCom")
    public void setCalleCom(String calleCom) {
        this.calleCom = calleCom;
    }

    public String getPuertaCom() {
        return puertaCom;
    }

    @XmlElement(name = "PuertaCom")
    public void setPuertaCom(String puertaCom) {
        this.puertaCom = puertaCom;
    }

    public String getPlodCom() {
        return plodCom;
    }

    @XmlElement(name = "PlodCom")
    public void setPlodCom(String plodCom) {
        this.plodCom = plodCom;
    }

    public String getCpCom() {
        return cpCom;
    }

    @XmlElement(name = "CPCom")
    public void setCpCom(String cpCom) {
        this.cpCom = cpCom;
    }

    public String getLocalidadCom() {
        return localidadCom;
    }

    @XmlElement(name = "LocalidadCom")
    public void setLocalidadCom(String localidadCom) {
        this.localidadCom = localidadCom;
    }

    public String getProvCom() {
        return provCom;
    }

    @XmlElement(name = "ProvCom")
    public void setProvCom(String provCom) {
        this.provCom = provCom;
    }

}
