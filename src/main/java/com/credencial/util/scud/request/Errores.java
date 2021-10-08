package com.credencial.util.scud.request;

import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class Errores implements Serializable {

    private String documentoValidacion;
    private String tipo;
    private String codigo;
    private String mensaje;
    private String razon;

    public String getDocumentoValidacion() {
        return documentoValidacion;
    }

    public void setDocumentoValidacion(String documentoValidacion) {
        this.documentoValidacion = documentoValidacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

}
