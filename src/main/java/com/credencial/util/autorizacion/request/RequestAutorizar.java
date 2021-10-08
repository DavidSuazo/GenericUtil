package com.credencial.util.autorizacion.request;

import com.credencial.util.JSonable;
import com.credencial.util.buytime.request.RequestBuyTime;
import com.credencial.util.casa.srtmx.request.CambiarEstadoRequest;
import com.credencial.util.casa.srtmx.request.ConsultarRequest;
import com.credencial.util.casa.srtmx.request.ResetContadorPinERRRequest;
import com.credencial.util.loginAuthenticate;
import com.credencial.util.RequestRegistrerTerminal;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

public class RequestAutorizar implements Serializable, JSonable {

    private String nameService;
    private String application_bundle;
    private boolean returnMovimientos;
    private String urlWSDL;
    private String datosPrivados;
    private String canal;
    private String tipoTransaccion;
    private String secuenciaTransaccion;
    private String fechaTransaccion;
    private String horaTransaccion;
    private String comercio;
    private String terminal;
    private String modoIngreso;
    private String tarjeta;
    private String nroCuenta;
    private String fechaExpiracion;
    private String codigoSeguridad;
    private String trackI;
    private String trackII;
    private String pin;
    private String tipoCuenta;
    private String codigoMoneda;
    private String importe;
    private String plan;
    private String cuotas;
    private String ticket;
    private String fechaDiferimiento;
    private String importeAdicional;
    private String codigoAutorizacion;
    private String codigoAutorizacionOriginal;
    private String fechaTransaccionOriginal;
    private String horaTransaccionOriginal;
    private String ticketOriginal;
    private String secuenciaOriginal;
    private String idTransaccionOriginal;
    private String idTransaccionExterno;
    private String idTransaccionExternoOriginal;
    private String nuevoPIN;
    private String tarjetaDestino;
    private String cuentaDestino;
    private String tipoCodificacion;
    private String datosAdicionales;
    private String subTipoTransaccion;
    private String feeTransaccion;
    private String feeCompensacion;
    private String feeProcesamientoTransaccion;
    private String feeProcesamientoCompensacion;
    private String institucionAdquirente;
    private String institucionReenvio;
    private String tipoComercio;
    private String nombreComercio;
    private String retrieval;
    private String importeMonedaCompensacion;
    private String importeMonedaLiquidacion;
    private String codigoMonedaCompensacion;
    private String codigoMonedaLiquidacion;
    private String codigoPaisAdquirente;
    private String codigoSeguridadBanda;
    private String abonos;
    private String cargos;
    private loginAuthenticate authenticate;
    private RequestBuyTime buyTime;
    private CambiarEstadoRequest cambiarEstadoRequest;
    private ConsultarRequest consultarRequest;
    private ResetContadorPinERRRequest resetContadorPinERRRequest;
    private RequestRegistrerTerminal registrerTerminal;
    private boolean bTransaction;
    private String identityNumber;
    private String dni;
    private Double importeNetoA_dispersar;
    private int userId;

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

    public ResetContadorPinERRRequest getResetContadorPinERRRequest() {
        return resetContadorPinERRRequest;
    }

    public void setResetContadorPinERRRequest(ResetContadorPinERRRequest resetContadorPinERRRequest) {
        this.resetContadorPinERRRequest = resetContadorPinERRRequest;
    }

    /**
     * @return the nameService
     */
    public String getNameService() {
        return nameService;
    }

    /**
     * @param nameService the nameService to set
     */
    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    /**
     * @return the datosPrivados
     */
    public String getDatosPrivados() {
        return datosPrivados;
    }

    /**
     * @param datosPrivados the datosPrivados to set
     */
    public void setDatosPrivados(String datosPrivados) {
        this.datosPrivados = datosPrivados;
    }

    /**
     * @return the canal
     */
    public String getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(String canal) {
        this.canal = canal;
    }

    /**
     * @return the tipoTransaccion
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * @param tipoTransaccion the tipoTransaccion to set
     */
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    /**
     * @return the secuenciaTransaccion
     */
    public String getSecuenciaTransaccion() {
        return secuenciaTransaccion;
    }

    /**
     * @param secuenciaTransaccion the secuenciaTransaccion to set
     */
    public void setSecuenciaTransaccion(String secuenciaTransaccion) {
        this.secuenciaTransaccion = secuenciaTransaccion;
    }

    /**
     * @return the fechaTransaccion
     */
    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * @param fechaTransaccion the fechaTransaccion to set
     */
    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    /**
     * @return the horaTransaccion
     */
    public String getHoraTransaccion() {
        return horaTransaccion;
    }

    /**
     * @param horaTransaccion the horaTransaccion to set
     */
    public void setHoraTransaccion(String horaTransaccion) {
        this.horaTransaccion = horaTransaccion;
    }

    /**
     * @return the comercio
     */
    public String getComercio() {
        return comercio;
    }

    /**
     * @param comercio the comercio to set
     */
    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    /**
     * @return the terminal
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * @param terminal the terminal to set
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     * @return the modoIngreso
     */
    public String getModoIngreso() {
        return modoIngreso;
    }

    /**
     * @param modoIngreso the modoIngreso to set
     */
    public void setModoIngreso(String modoIngreso) {
        this.modoIngreso = modoIngreso;
    }

    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @return the nroCuenta
     */
    public String getNroCuenta() {
        return nroCuenta;
    }

    /**
     * @param nroCuenta the nroCuenta to set
     */
    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    /**
     * @return the fechaExpiracion
     */
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * @param fechaExpiracion the fechaExpiracion to set
     */
    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    /**
     * @return the codigoSeguridad
     */
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /**
     * @param codigoSeguridad the codigoSeguridad to set
     */
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    /**
     * @return the trackI
     */
    public String getTrackI() {
        return trackI;
    }

    /**
     * @param trackI the trackI to set
     */
    public void setTrackI(String trackI) {
        this.trackI = trackI;
    }

    /**
     * @return the trackII
     */
    public String getTrackII() {
        return trackII;
    }

    /**
     * @param trackII the trackII to set
     */
    public void setTrackII(String trackII) {
        this.trackII = trackII;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the tipoCuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * @return the codigoMoneda
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * @param codigoMoneda the codigoMoneda to set
     */
    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    /**
     * @return the importe
     */
    public String getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(String importe) {
        this.importe = importe;
    }

    /**
     * @return the plan
     */
    public String getPlan() {
        return plan;
    }

    /**
     * @param plan the plan to set
     */
    public void setPlan(String plan) {
        this.plan = plan;
    }

    /**
     * @return the cuotas
     */
    public String getCuotas() {
        return cuotas;
    }

    /**
     * @param cuotas the cuotas to set
     */
    public void setCuotas(String cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * @return the ticket
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the fechaDiferimiento
     */
    public String getFechaDiferimiento() {
        return fechaDiferimiento;
    }

    /**
     * @param fechaDiferimiento the fechaDiferimiento to set
     */
    public void setFechaDiferimiento(String fechaDiferimiento) {
        this.fechaDiferimiento = fechaDiferimiento;
    }

    /**
     * @return the importeAdicional
     */
    public String getImporteAdicional() {
        return importeAdicional;
    }

    /**
     * @param importeAdicional the importeAdicional to set
     */
    public void setImporteAdicional(String importeAdicional) {
        this.importeAdicional = importeAdicional;
    }

    /**
     * @return the codigoAutorizacion
     */
    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    /**
     * @param codigoAutorizacion the codigoAutorizacion to set
     */
    public void setCodigoAutorizacion(String codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    /**
     * @return the codigoAutorizacionOriginal
     */
    public String getCodigoAutorizacionOriginal() {
        return codigoAutorizacionOriginal;
    }

    /**
     * @param codigoAutorizacionOriginal the codigoAutorizacionOriginal to set
     */
    public void setCodigoAutorizacionOriginal(String codigoAutorizacionOriginal) {
        this.codigoAutorizacionOriginal = codigoAutorizacionOriginal;
    }

    /**
     * @return the fechaTransaccionOriginal
     */
    public String getFechaTransaccionOriginal() {
        return fechaTransaccionOriginal;
    }

    /**
     * @param fechaTransaccionOriginal the fechaTransaccionOriginal to set
     */
    public void setFechaTransaccionOriginal(String fechaTransaccionOriginal) {
        this.fechaTransaccionOriginal = fechaTransaccionOriginal;
    }

    /**
     * @return the horaTransaccionOriginal
     */
    public String getHoraTransaccionOriginal() {
        return horaTransaccionOriginal;
    }

    /**
     * @param horaTransaccionOriginal the horaTransaccionOriginal to set
     */
    public void setHoraTransaccionOriginal(String horaTransaccionOriginal) {
        this.horaTransaccionOriginal = horaTransaccionOriginal;
    }

    /**
     * @return the ticketOriginal
     */
    public String getTicketOriginal() {
        return ticketOriginal;
    }

    /**
     * @param ticketOriginal the ticketOriginal to set
     */
    public void setTicketOriginal(String ticketOriginal) {
        this.ticketOriginal = ticketOriginal;
    }

    /**
     * @return the secuenciaOriginal
     */
    public String getSecuenciaOriginal() {
        return secuenciaOriginal;
    }

    /**
     * @param secuenciaOriginal the secuenciaOriginal to set
     */
    public void setSecuenciaOriginal(String secuenciaOriginal) {
        this.secuenciaOriginal = secuenciaOriginal;
    }

    /**
     * @return the idTransaccionOriginal
     */
    public String getIdTransaccionOriginal() {
        return idTransaccionOriginal;
    }

    /**
     * @param idTransaccionOriginal the idTransaccionOriginal to set
     */
    public void setIdTransaccionOriginal(String idTransaccionOriginal) {
        this.idTransaccionOriginal = idTransaccionOriginal;
    }

    /**
     * @return the idTransaccionExterno
     */
    public String getIdTransaccionExterno() {
        return idTransaccionExterno;
    }

    /**
     * @param idTransaccionExterno the idTransaccionExterno to set
     */
    public void setIdTransaccionExterno(String idTransaccionExterno) {
        this.idTransaccionExterno = idTransaccionExterno;
    }

    /**
     * @return the idTransaccionExternoOriginal
     */
    public String getIdTransaccionExternoOriginal() {
        return idTransaccionExternoOriginal;
    }

    /**
     * @param idTransaccionExternoOriginal the idTransaccionExternoOriginal to
     * set
     */
    public void setIdTransaccionExternoOriginal(String idTransaccionExternoOriginal) {
        this.idTransaccionExternoOriginal = idTransaccionExternoOriginal;
    }

    /**
     * @return the nuevoPIN
     */
    public String getNuevoPIN() {
        return nuevoPIN;
    }

    /**
     * @param nuevoPIN the nuevoPIN to set
     */
    public void setNuevoPIN(String nuevoPIN) {
        this.nuevoPIN = nuevoPIN;
    }

    /**
     * @return the tarjetaDestino
     */
    public String getTarjetaDestino() {
        return tarjetaDestino;
    }

    /**
     * @param tarjetaDestino the tarjetaDestino to set
     */
    public void setTarjetaDestino(String tarjetaDestino) {
        this.tarjetaDestino = tarjetaDestino;
    }

    /**
     * @return the cuentaDestino
     */
    public String getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     * @param cuentaDestino the cuentaDestino to set
     */
    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    /**
     * @return the tipoCodificacion
     */
    public String getTipoCodificacion() {
        return tipoCodificacion;
    }

    /**
     * @param tipoCodificacion the tipoCodificacion to set
     */
    public void setTipoCodificacion(String tipoCodificacion) {
        this.tipoCodificacion = tipoCodificacion;
    }

    /**
     * @return the datosAdicionales
     */
    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    /**
     * @param datosAdicionales the datosAdicionales to set
     */
    public void setDatosAdicionales(String datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    /**
     * @return the subTipoTransaccion
     */
    public String getSubTipoTransaccion() {
        return subTipoTransaccion;
    }

    /**
     * @param subTipoTransaccion the subTipoTransaccion to set
     */
    public void setSubTipoTransaccion(String subTipoTransaccion) {
        this.subTipoTransaccion = subTipoTransaccion;
    }

    /**
     * @return the feeTransaccion
     */
    public String getFeeTransaccion() {
        return feeTransaccion;
    }

    /**
     * @param feeTransaccion the feeTransaccion to set
     */
    public void setFeeTransaccion(String feeTransaccion) {
        this.feeTransaccion = feeTransaccion;
    }

    /**
     * @return the feeCompensacion
     */
    public String getFeeCompensacion() {
        return feeCompensacion;
    }

    /**
     * @param feeCompensacion the feeCompensacion to set
     */
    public void setFeeCompensacion(String feeCompensacion) {
        this.feeCompensacion = feeCompensacion;
    }

    /**
     * @return the feeProcesamientoTransaccion
     */
    public String getFeeProcesamientoTransaccion() {
        return feeProcesamientoTransaccion;
    }

    /**
     * @param feeProcesamientoTransaccion the feeProcesamientoTransaccion to set
     */
    public void setFeeProcesamientoTransaccion(String feeProcesamientoTransaccion) {
        this.feeProcesamientoTransaccion = feeProcesamientoTransaccion;
    }

    /**
     * @return the feeProcesamientoCompensacion
     */
    public String getFeeProcesamientoCompensacion() {
        return feeProcesamientoCompensacion;
    }

    /**
     * @param feeProcesamientoCompensacion the feeProcesamientoCompensacion to
     * set
     */
    public void setFeeProcesamientoCompensacion(String feeProcesamientoCompensacion) {
        this.feeProcesamientoCompensacion = feeProcesamientoCompensacion;
    }

    /**
     * @return the institucionAdquirente
     */
    public String getInstitucionAdquirente() {
        return institucionAdquirente;
    }

    /**
     * @param institucionAdquirente the institucionAdquirente to set
     */
    public void setInstitucionAdquirente(String institucionAdquirente) {
        this.institucionAdquirente = institucionAdquirente;
    }

    /**
     * @return the institucionReenvio
     */
    public String getInstitucionReenvio() {
        return institucionReenvio;
    }

    /**
     * @param institucionReenvio the institucionReenvio to set
     */
    public void setInstitucionReenvio(String institucionReenvio) {
        this.institucionReenvio = institucionReenvio;
    }

    /**
     * @return the tipoComercio
     */
    public String getTipoComercio() {
        return tipoComercio;
    }

    /**
     * @param tipoComercio the tipoComercio to set
     */
    public void setTipoComercio(String tipoComercio) {
        this.tipoComercio = tipoComercio;
    }

    /**
     * @return the nombreComercio
     */
    public String getNombreComercio() {
        return nombreComercio;
    }

    /**
     * @param nombreComercio the nombreComercio to set
     */
    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    /**
     * @return the retrieval
     */
    public String getRetrieval() {
        return retrieval;
    }

    /**
     * @param retrieval the retrieval to set
     */
    public void setRetrieval(String retrieval) {
        this.retrieval = retrieval;
    }

    /**
     * @return the importeMonedaCompensacion
     */
    public String getImporteMonedaCompensacion() {
        return importeMonedaCompensacion;
    }

    /**
     * @param importeMonedaCompensacion the importeMonedaCompensacion to set
     */
    public void setImporteMonedaCompensacion(String importeMonedaCompensacion) {
        this.importeMonedaCompensacion = importeMonedaCompensacion;
    }

    /**
     * @return the importeMonedaLiquidacion
     */
    public String getImporteMonedaLiquidacion() {
        return importeMonedaLiquidacion;
    }

    /**
     * @param importeMonedaLiquidacion the importeMonedaLiquidacion to set
     */
    public void setImporteMonedaLiquidacion(String importeMonedaLiquidacion) {
        this.importeMonedaLiquidacion = importeMonedaLiquidacion;
    }

    /**
     * @return the codigoMonedaCompensacion
     */
    public String getCodigoMonedaCompensacion() {
        return codigoMonedaCompensacion;
    }

    /**
     * @param codigoMonedaCompensacion the codigoMonedaCompensacion to set
     */
    public void setCodigoMonedaCompensacion(String codigoMonedaCompensacion) {
        this.codigoMonedaCompensacion = codigoMonedaCompensacion;
    }

    /**
     * @return the codigoMonedaLiquidacion
     */
    public String getCodigoMonedaLiquidacion() {
        return codigoMonedaLiquidacion;
    }

    /**
     * @param codigoMonedaLiquidacion the codigoMonedaLiquidacion to set
     */
    public void setCodigoMonedaLiquidacion(String codigoMonedaLiquidacion) {
        this.codigoMonedaLiquidacion = codigoMonedaLiquidacion;
    }

    /**
     * @return the codigoPaisAdquirente
     */
    public String getCodigoPaisAdquirente() {
        return codigoPaisAdquirente;
    }

    /**
     * @param codigoPaisAdquirente the codigoPaisAdquirente to set
     */
    public void setCodigoPaisAdquirente(String codigoPaisAdquirente) {
        this.codigoPaisAdquirente = codigoPaisAdquirente;
    }

    /**
     * @return the codigoSeguridadBanda
     */
    public String getCodigoSeguridadBanda() {
        return codigoSeguridadBanda;
    }

    /**
     * @param codigoSeguridadBanda the codigoSeguridadBanda to set
     */
    public void setCodigoSeguridadBanda(String codigoSeguridadBanda) {
        this.codigoSeguridadBanda = codigoSeguridadBanda;
    }

    /**
     * @return the abonos
     */
    public String getAbonos() {
        return abonos;
    }

    /**
     * @param abonos the abonos to set
     */
    public void setAbonos(String abonos) {
        this.abonos = abonos;
    }

    /**
     * @return the cargos
     */
    public String getCargos() {
        return cargos;
    }

    /**
     * @param cargos the cargos to set
     */
    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, RequestAutorizar.class);
    }

    /**
     * @return the returnMovimientos
     */
    public boolean isReturnMovimientos() {
        return returnMovimientos;
    }

    /**
     * @param returnMovimientos the returnMovimientos to set
     */
    public void setReturnMovimientos(boolean returnMovimientos) {
        this.returnMovimientos = returnMovimientos;
    }

    /**
     * @return the urlWSDL
     */
    public String getUrlWSDL() {
        return urlWSDL;
    }

    /**
     * @param urlWSDL the urlWSDL to set
     */
    public void setUrlWSDL(String urlWSDL) {
        this.urlWSDL = urlWSDL;
    }

    /**
     * @return the authenticate
     */
    public loginAuthenticate getAuthenticate() {
        return authenticate;
    }

    /**
     * @param authenticate the authenticate to set
     */
    public void setAuthenticate(loginAuthenticate authenticate) {
        this.authenticate = authenticate;
    }

    /**
     * @return the application_bundle
     */
    public String getApplication_bundle() {
        return application_bundle;
    }

    /**
     * @param application_bundle the application_bundle to set
     */
    public void setApplication_bundle(String application_bundle) {
        this.application_bundle = application_bundle;
    }

    /**
     * @return the buyTime
     */
    public RequestBuyTime getBuyTime() {
        return buyTime;
    }

    /**
     * @param buyTime the buyTime to set
     */
    public void setBuyTime(RequestBuyTime buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * @return the registrerTerminal
     */
    public RequestRegistrerTerminal getRegistrerTerminal() {
        return registrerTerminal;
    }

    /**
     * @param registrerTerminal the registrerTerminal to set
     */
    public void setRegistrerTerminal(RequestRegistrerTerminal registrerTerminal) {
        this.registrerTerminal = registrerTerminal;
    }

    public boolean isbTransaction() {
        return bTransaction;
    }

    public void setbTransaction(boolean bTransaction) {
        this.bTransaction = bTransaction;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the importeNetoA_dispersar
     */
    public Double getImporteNetoA_dispersar() {
        return importeNetoA_dispersar;
    }

    /**
     * @param importeNetoA_dispersar the importeNetoA_dispersar to set
     */
    public void setImporteNetoA_dispersar(Double importeNetoA_dispersar) {
        this.importeNetoA_dispersar = importeNetoA_dispersar;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

}
