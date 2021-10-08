package com.credencial.util.scud.request;

import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class IdentidadesCore implements Serializable {

    private int id;
    private String idClienteUnico;
    private String codigoEmpresa;
    private String codigoCorebank;
    private String identificador;
    private String encodedKey;

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

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getCodigoCorebank() {
        return codigoCorebank;
    }

    public void setCodigoCorebank(String codigoCorebank) {
        this.codigoCorebank = codigoCorebank;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEncodedKey() {
        return encodedKey;
    }

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

}
