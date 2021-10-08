package com.credencial.util.autorizacion.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.List;

public class ResponseAutorizar implements Serializable, JSonable {

    private Integer codigoError;
    private String mensajeError;
    private String datosPrivados;
    private String codigoRespuesta;
    private String tipoCodificacion;
    private String datosAdicionales;
    private String mensajeRespuesta;
    private String categoriaRespuesta;
    private String accionRespuesta;
    private String codigoAutorizacion;
    private String idTransaccion;
    private String idTransaccionExterno;
    private String disponibleConsumos;
    private String disponibleCuotas;
    private String disponibleAdelantos;
    private String disponiblePrestamos;
    private String saldoPosterior;
    private String saldo;
    private String saldoPosteriorCuentaDestino;
    private String saldoCuentaDestino;
    private String saldoEnDolares;
    private String pagoMinimo;
    private String deudaAlDia;
    private String fechaVencimientoUltimaLiquidacion;
    private List<Movimiento> movimientos;
    private Double importeNetoA_dispersar;
    private Double commision_net;

    public ResponseAutorizar() {
        setCodigoError(-1);
        setMensajeError("Transaccion Respondida");
        setMensajeRespuesta("OK");
        setCodigoAutorizacion("570017");
    }

    /**
     * @param aCodigoError the codigoError to set
     */
    public void setCodigoError(Integer aCodigoError) {
        codigoError = aCodigoError;
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
     * @return the codigoRespuesta
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * @param codigoRespuesta the codigoRespuesta to set
     */
    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    /**
     * @return the categoriaRespuesta
     */
    public String getCategoriaRespuesta() {
        return categoriaRespuesta;
    }

    /**
     * @param categoriaRespuesta the categoriaRespuesta to set
     */
    public void setCategoriaRespuesta(String categoriaRespuesta) {
        this.categoriaRespuesta = categoriaRespuesta;
    }

    /**
     * @return the accionRespuesta
     */
    public String getAccionRespuesta() {
        return accionRespuesta;
    }

    /**
     * @param accionRespuesta the accionRespuesta to set
     */
    public void setAccionRespuesta(String accionRespuesta) {
        this.accionRespuesta = accionRespuesta;
    }

    /**
     * @return the idTransaccion
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * @param idTransaccion the idTransaccion to set
     */
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
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
     * @return the disponibleConsumos
     */
    public String getDisponibleConsumos() {
        return disponibleConsumos;
    }

    /**
     * @param disponibleConsumos the disponibleConsumos to set
     */
    public void setDisponibleConsumos(String disponibleConsumos) {
        this.disponibleConsumos = disponibleConsumos;
    }

    /**
     * @return the disponibleCuotas
     */
    public String getDisponibleCuotas() {
        return disponibleCuotas;
    }

    /**
     * @param disponibleCuotas the disponibleCuotas to set
     */
    public void setDisponibleCuotas(String disponibleCuotas) {
        this.disponibleCuotas = disponibleCuotas;
    }

    /**
     * @return the disponibleAdelantos
     */
    public String getDisponibleAdelantos() {
        return disponibleAdelantos;
    }

    /**
     * @param disponibleAdelantos the disponibleAdelantos to set
     */
    public void setDisponibleAdelantos(String disponibleAdelantos) {
        this.disponibleAdelantos = disponibleAdelantos;
    }

    /**
     * @return the disponiblePrestamos
     */
    public String getDisponiblePrestamos() {
        return disponiblePrestamos;
    }

    /**
     * @param disponiblePrestamos the disponiblePrestamos to set
     */
    public void setDisponiblePrestamos(String disponiblePrestamos) {
        this.disponiblePrestamos = disponiblePrestamos;
    }

    /**
     * @return the saldoPosterior
     */
    public String getSaldoPosterior() {
        return saldoPosterior;
    }

    /**
     * @param saldoPosterior the saldoPosterior to set
     */
    public void setSaldoPosterior(String saldoPosterior) {
        this.saldoPosterior = saldoPosterior;
    }

    /**
     * @return the saldo
     */
    public String getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the saldoPosteriorCuentaDestino
     */
    public String getSaldoPosteriorCuentaDestino() {
        return saldoPosteriorCuentaDestino;
    }

    /**
     * @param saldoPosteriorCuentaDestino the saldoPosteriorCuentaDestino to set
     */
    public void setSaldoPosteriorCuentaDestino(String saldoPosteriorCuentaDestino) {
        this.saldoPosteriorCuentaDestino = saldoPosteriorCuentaDestino;
    }

    /**
     * @return the saldoCuentaDestino
     */
    public String getSaldoCuentaDestino() {
        return saldoCuentaDestino;
    }

    /**
     * @param saldoCuentaDestino the saldoCuentaDestino to set
     */
    public void setSaldoCuentaDestino(String saldoCuentaDestino) {
        this.saldoCuentaDestino = saldoCuentaDestino;
    }

    /**
     * @return the saldoEnDolares
     */
    public String getSaldoEnDolares() {
        return saldoEnDolares;
    }

    /**
     * @param saldoEnDolares the saldoEnDolares to set
     */
    public void setSaldoEnDolares(String saldoEnDolares) {
        this.saldoEnDolares = saldoEnDolares;
    }

    /**
     * @return the pagoMinimo
     */
    public String getPagoMinimo() {
        return pagoMinimo;
    }

    /**
     * @param pagoMinimo the pagoMinimo to set
     */
    public void setPagoMinimo(String pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    /**
     * @return the deudaAlDia
     */
    public String getDeudaAlDia() {
        return deudaAlDia;
    }

    /**
     * @param deudaAlDia the deudaAlDia to set
     */
    public void setDeudaAlDia(String deudaAlDia) {
        this.deudaAlDia = deudaAlDia;
    }

    /**
     * @return the fechaVencimientoUltimaLiquidacion
     */
    public String getFechaVencimientoUltimaLiquidacion() {
        return fechaVencimientoUltimaLiquidacion;
    }

    /**
     * @param fechaVencimientoUltimaLiquidacion the
     * fechaVencimientoUltimaLiquidacion to set
     */
    public void setFechaVencimientoUltimaLiquidacion(String fechaVencimientoUltimaLiquidacion) {
        this.fechaVencimientoUltimaLiquidacion = fechaVencimientoUltimaLiquidacion;
    }

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.setCodigoError((Integer) codigoError);
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeErro) {
        this.mensajeError = mensajeErro;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setCodigoAutorizacion(String codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ResponseAutorizar.class);
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
     * @return the commision_net
     */
    public Double getCommision_net() {
        return commision_net;
    }

    /**
     * @param commision_net the commision_net to set
     */
    public void setCommision_net(Double commision_net) {
        this.commision_net = commision_net;
    }

}
