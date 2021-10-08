package com.credencial.util.scud.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tecto
 */
public class ClientSCUDResult implements Serializable, JSonable {

    private String identificador;
    private String idClienteUnico;
    private String estatus;
    private List<Errores> errores;
    private DatosGenerales datosGenerales;
    private List<Contacto> contactos;
    private List<Direcciones> direcciones;
    private List<IdentidadesCore> identidadesCore;
    private List<UrlFotosValidacion> urlFotosValidacion;

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ClientSCUDResult.class);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdClienteUnico() {
        return idClienteUnico;
    }

    public void setIdClienteUnico(String idClienteUnico) {
        this.idClienteUnico = idClienteUnico;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public List<Errores> getErrores() {
        return errores;
    }

    public void setErrores(List<Errores> errores) {
        this.errores = errores;
    }

    public DatosGenerales getDatosGenerales() {
        return datosGenerales;
    }

    public void setDatosGenerales(DatosGenerales datosGenerales) {
        this.datosGenerales = datosGenerales;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public List<Direcciones> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direcciones> direcciones) {
        this.direcciones = direcciones;
    }

    public List<IdentidadesCore> getIdentidadesCore() {
        return identidadesCore;
    }

    public void setIdentidadesCore(List<IdentidadesCore> identidadesCore) {
        this.identidadesCore = identidadesCore;
    }

    public List<UrlFotosValidacion> getUrlFotosValidacion() {
        return urlFotosValidacion;
    }

    public void setUrlFotosValidacion(List<UrlFotosValidacion> urlFotosValidacion) {
        this.urlFotosValidacion = urlFotosValidacion;
    }

}
