package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "consTCResponse", namespace = "http://services.wss.link.com.ar/")
public class ConsTCResponse {

    private ResponseConsTC1 Response;
    private String xmlns;
    private Tarjetas Tarjetas;

    public ResponseConsTC1 getResponse() {
        return Response;
    }

    @XmlElement(name = "Response")
    public void setResponse(ResponseConsTC1 Response) {
        this.Response = Response;
    }

    public String getXmlns() {
        return xmlns;
    }

    @XmlElement(name = "xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Tarjetas getTarjetas() {
        return Tarjetas;
    }

    @XmlElement(name = "Tarjetas")
    public void setTarjetas(Tarjetas Tarjetas) {
        this.Tarjetas = Tarjetas;
    }

    @Override
    public String toString() {
        return "ClassPojo [Response = " + Response + ", xmlns = " + xmlns + ", Tarjetas = " + Tarjetas + "]";
    }

    /*
    private ConsTCResponse consTCResponse;
    private ResponseConsTC Response;
    private Tarjetas Tarjetas;
    private String xmlns;

    public ConsTCResponse getConsTCResponse() {
        return consTCResponse;
    }

    public void setConsTCResponse(ConsTCResponse consTCResponse) {
        this.consTCResponse = consTCResponse;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Tarjetas getTarjetas() {
        return Tarjetas;
    }

    @XmlElement(name = "Tarjetas")
    public void setTarjetas(Tarjetas Tarjetas) {
        this.Tarjetas = Tarjetas;
    }

    public ResponseConsTC getResponse() {
        return Response;
    }

    @XmlElement(name = "Response")
    public void setResponse(ResponseConsTC Response) {
        this.Response = Response;
    }

    @Override
    public String toString() {
        return "ClassPojo  consTCResponse = " + consTCResponse + "]";
    }
     */
}
