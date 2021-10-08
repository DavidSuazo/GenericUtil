package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author tecto
 */
public class ConsMVResponse {

    private ResponseConsTC1 Response;
    private String xmlns;
    private PaginadoResponse PaginadoResponse;
    private Consumos[] Consumos;

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

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public PaginadoResponse getPaginadoResponse() {
        return PaginadoResponse;
    }

    @XmlElement(name = "PaginadoResponse")
    public void setPaginadoResponse(PaginadoResponse PaginadoResponse) {
        this.PaginadoResponse = PaginadoResponse;
    }

    public Consumos[] getConsumos() {
        return Consumos;
    }

    @XmlElement(name = "Consumos")
    public void setConsumos(Consumos[] Consumos) {
        this.Consumos = Consumos;
    }

    @Override
    public String toString() {
        return "ClassPojo [Response = " + Response + ", xmlns = " + xmlns + ", PaginadoResponse = " + PaginadoResponse + ", Consumos = " + Consumos + "]";
    }
}
