package com.credencial.util.casa.srtmx.request;

/**
 *
 * @author David
 */
public class RequestEstadoTarjeta {

    private CambiarEstadoRequest cambiarEstadoRequest;
    private ConsultarRequest consultarRequest;
    private ConsultarPorCuentaRequest consultarPorCuentaRequest;
    private ConsultarPorFiltrosRequest consultarPorFiltrosRequest;
    private ResetContadorPinERRRequest resetContadorPinERRRequest;
    
    public CambiarEstadoRequest getCambiarEstadoRequest() {
        return cambiarEstadoRequest;
    }

    public void setCambiarEstadoRequest(CambiarEstadoRequest cambiarEstadoRequest) {
        this.cambiarEstadoRequest = cambiarEstadoRequest;
    }

    public ConsultarRequest getConsultarRequest() {
        return consultarRequest;
    }

    public void setConsultarRequest(ConsultarRequest consultarRequest) {
        this.consultarRequest = consultarRequest;
    }

    public ConsultarPorCuentaRequest getConsultarPorCuentaRequest() {
        return consultarPorCuentaRequest;
    }

    public void setConsultarPorCuentaRequest(ConsultarPorCuentaRequest consultarPorCuentaRequest) {
        this.consultarPorCuentaRequest = consultarPorCuentaRequest;
    }

    public ConsultarPorFiltrosRequest getConsultarPorFiltrosRequest() {
        return consultarPorFiltrosRequest;
    }

    public void setConsultarPorFiltrosRequest(ConsultarPorFiltrosRequest consultarPorFiltrosRequest) {
        this.consultarPorFiltrosRequest = consultarPorFiltrosRequest;
    }

    public ResetContadorPinERRRequest getResetContadorPinERRRequest() {
        return resetContadorPinERRRequest;
    }

    public void setResetContadorPinERRRequest(ResetContadorPinERRRequest resetContadorPinERRRequest) {
        this.resetContadorPinERRRequest = resetContadorPinERRRequest;
    }
    
    
}
