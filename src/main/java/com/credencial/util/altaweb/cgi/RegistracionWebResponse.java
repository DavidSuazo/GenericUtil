package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cj_sr
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "RegistracionWebResponse", namespace="http://services.wss.credregweb.com.ar/" )
public class RegistracionWebResponse {

    private RegWebResponse RegWebResponse;
    private String xmlns;

    public RegWebResponse getRegWebResponse() {
        return RegWebResponse;
    }

    @XmlElement(name = "RegWebResponse")
    public void setRegWebResponse(RegWebResponse RegWebResponse) {
        this.RegWebResponse = RegWebResponse;
    }

    @Override
    public String toString() {
        return "ClassPojo  RegWebResponse = " + RegWebResponse + "]";
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
}
