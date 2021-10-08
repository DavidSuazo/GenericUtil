package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecto
 */
@XmlRootElement(name = "Response")
public class ResponseConsTC {

    private ResponseConsTC Response;
    private Banco Banco;
    private Usuario Usuario;
    private String Headers;
    private String TimeStamp;
    private String Producto;
    private String Ip;
    private String NroRequerimiento;
    private String CodigoRespuesta;
    private String ErrorCodigo;
    private String ErrorDescripcion;

    public ResponseConsTC getResponse() {
        return Response;
    }

    @XmlElement(name = "Response")
    public void setResponse(ResponseConsTC Response) {
        this.Response = Response;
    }

    public Banco getBanco() {
        return Banco;
    }

    @XmlElement(name = "Banco")
    public void setBanco(Banco Banco) {
        this.Banco = Banco;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    @XmlElement(name = "Usuario")
    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public String getHeaders() {
        return Headers;
    }

    @XmlElement(name = "Headers")
    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    @XmlElement(name = "TimeStamp")
    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public String getProducto() {
        return Producto;
    }

    @XmlElement(name = "Producto")
    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getIp() {
        return Ip;
    }

    @XmlElement(name = "Ip")
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public String getNroRequerimiento() {
        return NroRequerimiento;
    }

    @XmlElement(name = "NroRequerimiento")
    public void setNroRequerimiento(String NroRequerimiento) {
        this.NroRequerimiento = NroRequerimiento;
    }

    public String getCodigoRespuesta() {
        return CodigoRespuesta;
    }

    @XmlElement(name = "CodigoRespuesta")
    public void setCodigoRespuesta(String CodigoRespuesta) {
        this.CodigoRespuesta = CodigoRespuesta;
    }

    public String getErrorCodigo() {
        return ErrorCodigo;
    }

    @XmlElement(name = "ErrorCodigo")
    public void setErrorCodigo(String ErrorCodigo) {
        this.ErrorCodigo = ErrorCodigo;
    }

    public String getErrorDescripcion() {
        return ErrorDescripcion;
    }

    @XmlElement(name = "ErrorDescripcion")
    public void setErrorDescripcion(String ErrorDescripcion) {
        this.ErrorDescripcion = ErrorDescripcion;
    }

}
