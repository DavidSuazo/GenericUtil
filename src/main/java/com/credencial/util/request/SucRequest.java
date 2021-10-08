package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class SucRequest {
    
    private String idContext;
    private String codProv;
    private String codLoc;
    private String cp;

    public String getIdContext() {
        return idContext;
    }

    public void setIdContext(String idContext) {
        this.idContext = idContext;
    }

    public String getCodProv() {
        return codProv;
    }

    public void setCodProv(String codProv) {
        this.codProv = codProv;
    }

    public String getCodLoc() {
        return codLoc;
    }

    public void setCodLoc(String codLoc) {
        this.codLoc = codLoc;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
}
