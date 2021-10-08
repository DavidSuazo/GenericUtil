package com.credencial.util.scud.request;

import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class UrlFotosValidacion implements Serializable {

    private String tipoFoto;
    private String urlFoto;

    public String getTipoFoto() {
        return tipoFoto;
    }

    public void setTipoFoto(String tipoFoto) {
        this.tipoFoto = tipoFoto;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

}
