package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cj_sr
 */
public class Response {

    private Response Response;
    private String ErrorDescripcion;
    private String CodigoRespuesta;
    private String ErrorCodigo;
    private String TimeStamp;
    private Entidad Entidad;

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

    public Entidad getEntidad() {
        return Entidad;
    }

    @XmlElement(name = "Entidad")
    public void setEntidad(Entidad Entidad) {
        this.Entidad = Entidad;
    }

    public Response getResponse() {
        return Response;
    }

    @XmlElement(name = "Response")
    public void setResponse(Response Response) {
        this.Response = Response;
    }
}
