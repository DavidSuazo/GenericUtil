package com.credencial.util.scud.request;

import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class Contacto implements Serializable {

    private int id;
    private String idClienteUnico;
    private String tipoContacto;
    private String valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdClienteUnico() {
        return idClienteUnico;
    }

    public void setIdClienteUnico(String idClienteUnico) {
        this.idClienteUnico = idClienteUnico;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
