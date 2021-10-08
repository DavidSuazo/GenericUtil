package com.credencial.util.tecas.core.response;

/**
 *
 * @author tecto
 */
public class CuentaResponse2 {

    private String encodedKey;
    private String numeroCuenta;
    private String numeroCliente;
    private String nombreCliente;
    private int saldo;
    private int saldoDisponible;
    private int saldoBloqueado;
    private String sucursal;
    private String fechaCreacion;
    private String ultimaFechaModificacion;
    private String id;
    private String tipoProducto;
    private String tipoTitularCuenta;
    private String idTitularCuenta;
    private String estadoCuenta;
    private String idTipoProducto;
    private String tipoCuenta;
    private String fechaAprovacion;
    private String fechaActivacion;
    private String ultimaFechaCalculoIntereses;
    private String ultimaFechaTransaccionCuenta;
    private String codigoMoneda;
    private String saldoCierre;
    private ControlesInternos controlesInternos;
    private ConfiguracionSobregiro configuracionSobregiro;
    private ConfiguraInteres configuraInteres;
    private Saldos saldos;
    private CantidadesAcumuladas cantidadesAcumuladas;
    private String retenciones;
    private String creditoId;
    private CamposAdicionales camposAdicionales;

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    public String getEncodedKey() {
        return this.encodedKey;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNumeroCliente() {
        return this.numeroCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public int getSaldoDisponible() {
        return this.saldoDisponible;
    }

    public void setSaldoBloqueado(int saldoBloqueado) {
        this.saldoBloqueado = saldoBloqueado;
    }

    public int getSaldoBloqueado() {
        return this.saldoBloqueado;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getSucursal() {
        return this.sucursal;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setUltimaFechaModificacion(String ultimaFechaModificacion) {
        this.ultimaFechaModificacion = ultimaFechaModificacion;
    }

    public String getUltimaFechaModificacion() {
        return this.ultimaFechaModificacion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return this.tipoProducto;
    }

    public void setTipoTitularCuenta(String tipoTitularCuenta) {
        this.tipoTitularCuenta = tipoTitularCuenta;
    }

    public String getTipoTitularCuenta() {
        return this.tipoTitularCuenta;
    }

    public void setIdTitularCuenta(String idTitularCuenta) {
        this.idTitularCuenta = idTitularCuenta;
    }

    public String getIdTitularCuenta() {
        return this.idTitularCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public String getEstadoCuenta() {
        return this.estadoCuenta;
    }

    public void setIdTipoProducto(String idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getIdTipoProducto() {
        return this.idTipoProducto;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setFechaAprovacion(String fechaAprovacion) {
        this.fechaAprovacion = fechaAprovacion;
    }

    public String getFechaAprovacion() {
        return this.fechaAprovacion;
    }

    public void setFechaActivacion(String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public String getFechaActivacion() {
        return this.fechaActivacion;
    }

    public void setUltimaFechaCalculoIntereses(String ultimaFechaCalculoIntereses) {
        this.ultimaFechaCalculoIntereses = ultimaFechaCalculoIntereses;
    }

    public String getUltimaFechaCalculoIntereses() {
        return this.ultimaFechaCalculoIntereses;
    }

    public void setUltimaFechaTransaccionCuenta(String ultimaFechaTransaccionCuenta) {
        this.ultimaFechaTransaccionCuenta = ultimaFechaTransaccionCuenta;
    }

    public String getUltimaFechaTransaccionCuenta() {
        return this.ultimaFechaTransaccionCuenta;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getCodigoMoneda() {
        return this.codigoMoneda;
    }

    public void setSaldoCierre(String saldoCierre) {
        this.saldoCierre = saldoCierre;
    }

    public String getSaldoCierre() {
        return this.saldoCierre;
    }

    public void setControlesInternos(ControlesInternos controlesInternos) {
        this.controlesInternos = controlesInternos;
    }

    public ControlesInternos getControlesInternos() {
        return this.controlesInternos;
    }

    public void setConfiguracionSobregiro(ConfiguracionSobregiro configuracionSobregiro) {
        this.configuracionSobregiro = configuracionSobregiro;
    }

    public ConfiguracionSobregiro getConfiguracionSobregiro() {
        return this.configuracionSobregiro;
    }

    public void setConfiguraInteres(ConfiguraInteres configuraInteres) {
        this.configuraInteres = configuraInteres;
    }

    public ConfiguraInteres getConfiguraInteres() {
        return this.configuraInteres;
    }

    public void setSaldos(Saldos saldos) {
        this.saldos = saldos;
    }

    public Saldos getSaldos() {
        return this.saldos;
    }

    public void setCantidadesAcumuladas(CantidadesAcumuladas cantidadesAcumuladas) {
        this.cantidadesAcumuladas = cantidadesAcumuladas;
    }

    public CantidadesAcumuladas getCantidadesAcumuladas() {
        return this.cantidadesAcumuladas;
    }

    public void setRetenciones(String retenciones) {
        this.retenciones = retenciones;
    }

    public String getRetenciones() {
        return this.retenciones;
    }

    public void setCreditoId(String creditoId) {
        this.creditoId = creditoId;
    }

    public String getCreditoId() {
        return this.creditoId;
    }

    public void setCamposAdicionales(CamposAdicionales camposAdicionales) {
        this.camposAdicionales = camposAdicionales;
    }

    public CamposAdicionales getCamposAdicionales() {
        return this.camposAdicionales;
    }

}
