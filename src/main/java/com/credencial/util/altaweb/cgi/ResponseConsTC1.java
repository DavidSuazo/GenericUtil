package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author tecto
 */
public class ResponseConsTC1 {

    private Banco Banco;
    private Usuario Usuario;
    private String Headers;
    private ResponseConsTC2 Response;

    public ResponseConsTC2 getResponse() {
        return Response;
    }

    @XmlElement(name = "Response")
    public void setResponse(ResponseConsTC2 Response) {
        this.Response = Response;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    @XmlElement(name = "Usuario")
    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Banco getBanco() {
        return Banco;
    }

    @XmlElement(name = "Banco")
    public void setBanco(Banco Banco) {
        this.Banco = Banco;
    }

    public String getHeaders() {
        return Headers;
    }

    @XmlElement(name = "Headers")
    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    @Override
    public String toString() {
        return "ClassPojo [Response = " + Response + ", Usuario = " + Usuario + ", Banco = " + Banco + ", Headers = " + Headers + "]";
    }
}
