package com.credencial.util.altaweb.cgi;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author tecto
 */
public class PaginadoResponse {

    private String pagina;
    private String RegistrosPagina;
    private String CantPaginas;

    public String getPagina() {
        return pagina;
    }

    @XmlElement(name = "pagina")
    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getRegistrosPagina() {
        return RegistrosPagina;
    }

    @XmlElement(name = "RegistrosPagina")
    public void setRegistrosPagina(String RegistrosPagina) {
        this.RegistrosPagina = RegistrosPagina;
    }

    public String getCantPaginas() {
        return CantPaginas;
    }

    @XmlElement(name = "CantPaginas")
    public void setCantPaginas(String CantPaginas) {
        this.CantPaginas = CantPaginas;
    }

    @Override
    public String toString() {
        return "ClassPojo [pagina = " + pagina + ", RegistrosPagina = " + RegistrosPagina + ", CantPaginas = " + CantPaginas + "]";
    }
}
