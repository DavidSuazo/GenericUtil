package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cj_sr
 */
@XmlRootElement(name = "RegWebResponse")
public class RegWebResponse {

    private Response Response;
    private String xmlns;
    private RegAlta RegAlta;
    private RegCom RegCom;
    private RegMod regmod;
    private RegRep regRep;

    public Response getResponse() {
        return Response;
    }

    @XmlElement(name = "Response")
    public void setResponse(Response Response) {
        this.Response = Response;
    }

    @XmlElement(name = "RegAlta")
    public RegAlta getRegAlta() {
        return RegAlta;
    }

    public void setRegAlta(RegAlta RegAlta) {
        this.RegAlta = RegAlta;
    }

    @XmlElement(name = "RegCom")
    public RegCom getRegCom() {
        return RegCom;
    }

    public void setRegCom(RegCom RegCom) {
        this.RegCom = RegCom;
    }

    @Override
    public String toString() {
        return "ClassPojo [Response = " + Response + ", xmlns =  RegAlta = " + RegAlta + "]";
    }

    public String getXmlns() {
        return xmlns;
    }

    @XmlAttribute(name = "xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public RegMod getRegmod() {
        return regmod;
    }

    @XmlElement(name = "RegMod")
    public void setRegmod(RegMod regmod) {
        this.regmod = regmod;
    }

    public RegRep getRegRep() {
        return regRep;
    }

    @XmlElement(name = "RegRep")
    public void setRegRep(RegRep regRep) {
        this.regRep = regRep;
    }

}
