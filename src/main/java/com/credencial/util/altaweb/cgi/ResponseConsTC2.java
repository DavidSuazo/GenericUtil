package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author tecto
 */
public class ResponseConsTC2 {

    private String NroRequerimiento;
    private String Producto;
    private String Ip;
    private String ErrorDescripcion;
    private String CodigoRespuesta;
    private String ErrorCodigo;
    private String TimeStamp;

    public String getNroRequerimiento() {
        return NroRequerimiento;
    }

    @XmlElement(name = "NroRequerimiento")
    public void setNroRequerimiento(String NroRequerimiento) {
        this.NroRequerimiento = NroRequerimiento;
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

    public String getErrorDescripcion() {
        return ErrorDescripcion;
    }

    @XmlElement(name = "ErrorDescripcion")
    public void setErrorDescripcion(String ErrorDescripcion) {
        this.ErrorDescripcion = ErrorDescripcion;
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

    public String getTimeStamp() {
        return TimeStamp;
    }

    @XmlElement(name = "TimeStamp")
    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    @Override
    public String toString() {
        return "ClassPojo [NroRequerimiento = " + NroRequerimiento + ", Producto = " + Producto + ", Ip = " + Ip + ", ErrorDescripcion = " + ErrorDescripcion + ", CodigoRespuesta = " + CodigoRespuesta + ", ErrorCodigo = " + ErrorCodigo + ", TimeStamp = " + TimeStamp + "]";
    }
}
