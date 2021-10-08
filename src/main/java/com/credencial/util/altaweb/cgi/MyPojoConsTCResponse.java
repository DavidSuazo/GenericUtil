package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "consTCResponse", namespace = "http://services.wss.link.com.ar/")
public class MyPojoConsTCResponse {

    private ConsTCResponse consTCResponse;

    public ConsTCResponse getConsTCResponse() {
        return consTCResponse;
    }

    public void setConsTCResponse(ConsTCResponse consTCResponse) {
        this.consTCResponse = consTCResponse;
    }

    @Override
    public String toString() {
        return "ClassPojo [consTCResponse = " + consTCResponse + "]";
    }
}
