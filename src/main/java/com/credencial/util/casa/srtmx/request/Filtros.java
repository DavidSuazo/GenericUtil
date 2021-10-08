/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.casa.srtmx.request;

/**
 *
 * @author David
 */
public class Filtros {

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public String getPagina() {
        return Pagina;
    }

    public void setPagina(String Pagina) {
        this.Pagina = Pagina;
    }

    public String getPideGZ() {
        return PideGZ;
    }

    public void setPideGZ(String PideGZ) {
        this.PideGZ = PideGZ;
    }
    
    private Documento documento;
    private String Denominacion;
    private Productos productos;
    private String Pagina;
    private String PideGZ;
    
    
    
    
}
