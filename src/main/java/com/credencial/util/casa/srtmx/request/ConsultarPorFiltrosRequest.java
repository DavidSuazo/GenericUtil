package com.credencial.util.casa.srtmx.request;

/**
 *
 * @author David
 */
public class ConsultarPorFiltrosRequest {
     
    private Autenticacion autenticacion;
    private Originador originador;
    private Filtros filtros;
    private String Pagina;
    private String PideGZ;
    
    

    public Autenticacion getAutenticacion() {
        return autenticacion;
    }

    public void setAutenticacion(Autenticacion autenticacion) {
        this.autenticacion = autenticacion;
    }

    public Originador getOriginador() {
        return originador;
    }

    public void setOriginador(Originador originador) {
        this.originador = originador;
    }

    public Filtros getFiltros() {
        return filtros;
    }

    public void setFiltros(Filtros filtros) {
        this.filtros = filtros;
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
   
    
    
    
    
    
}
