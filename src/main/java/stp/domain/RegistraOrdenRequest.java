package stp.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author emilio
 * Created on : 11/02/2020, 01:59:54 PM
 *
 */
public class RegistraOrdenRequest {
    private String institucionContraparte;
    private String empresa;
    private String fechaOperacion;
    private String folioOrigen;
    private String claveRastreo;
    private String institucionOperante;
    private String monto;
    private String tipoPago;

    private String tipoCuentaOrdenante;
    private String nombreOrdenante;
    private String cuentaOrdenante;
    private String rfcCurpOrdenante;

    private String tipoCuentaBeneficiario;
    private String nombreBeneficiario;
    private String cuentaBeneficiario;
    private String rfcCurpBeneficiario;
    private String emailBeneficiario;

    private String tipoCuentaBeneficiario2;
    private String nombreBeneficiario2;
    private String cuentaBeneficiario2;
    private String rfcCurpBeneficiario2;

    private String conceptoPago;
    private String conceptoPago2;

    private String claveCatUsuario1;
    private String claveCatUsuario2;

    private String clavePago;
    private String referenciaCobranza;
    private String referenciaNumerica;
    private String tipoOperacion;
    private String topologia;
    private String usuario;
    private String medioEntrega;
    private String prioridad;

    private String firma;

    public String getInstitucionContraparte() {
        return institucionContraparte;
    }
    public void setInstitucionContraparte(String institucionContraparte) {
        this.institucionContraparte = institucionContraparte;
    }

    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFechaOperacion() {
        return fechaOperacion;
    }
    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getFolioOrigen() {
        return folioOrigen;
    }
    public void setFolioOrigen(String folioOrigen) {
        this.folioOrigen = folioOrigen;
    }

    public String getClaveRastreo() {
        return claveRastreo;
    }
    public void setClaveRastreo(String claveRastreo) {
        this.claveRastreo = claveRastreo;
    }

    public String getInstitucionOperante() {
        return institucionOperante;
    }
    public void setInstitucionOperante(String institucionOperante) {
        this.institucionOperante = institucionOperante;
    }

    public String getMonto() {
        return monto;
    }
    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getTipoPago() {
        return tipoPago;
    }
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoCuentaOrdenante() {
        return tipoCuentaOrdenante;
    }
    public void setTipoCuentaOrdenante(String tipoCuentaOrdenante) {
        this.tipoCuentaOrdenante = tipoCuentaOrdenante;
    }

    public String getNombreOrdenante() {
        return nombreOrdenante;
    }
    public void setNombreOrdenante(String nombreOrdenante) {
        this.nombreOrdenante = nombreOrdenante;
    }

    public String getCuentaOrdenante() {
        return cuentaOrdenante;
    }
    public void setCuentaOrdenante(String cuentaOrdenante) {
        this.cuentaOrdenante = cuentaOrdenante;
    }

    public String getRfcCurpOrdenante() {
        return rfcCurpOrdenante;
    }
    public void setRfcCurpOrdenante(String rfcCurpOrdenante) {
        this.rfcCurpOrdenante = rfcCurpOrdenante;
    }

    public String getTipoCuentaBeneficiario() {
        return tipoCuentaBeneficiario;
    }
    public void setTipoCuentaBeneficiario(String tipoCuentaBeneficiario) {
        this.tipoCuentaBeneficiario = tipoCuentaBeneficiario;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }
    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getCuentaBeneficiario() {
        return cuentaBeneficiario;
    }
    public void setCuentaBeneficiario(String cuentaBeneficiario) {
        this.cuentaBeneficiario = cuentaBeneficiario;
    }

    public String getRfcCurpBeneficiario() {
        return rfcCurpBeneficiario;
    }
    public void setRfcCurpBeneficiario(String rfcCurpBeneficiario) {
        this.rfcCurpBeneficiario = rfcCurpBeneficiario;
    }

    public String getEmailBeneficiario() {
        return emailBeneficiario;
    }
    public void setEmailBeneficiario(String emailBeneficiario) {
        this.emailBeneficiario = emailBeneficiario;
    }

    public String getTipoCuentaBeneficiario2() {
        return tipoCuentaBeneficiario2;
    }
    public void setTipoCuentaBeneficiario2(String tipoCuentaBeneficiario2) {
        this.tipoCuentaBeneficiario2 = tipoCuentaBeneficiario2;
    }

    public String getNombreBeneficiario2() {
        return nombreBeneficiario2;
    }
    public void setNombreBeneficiario2(String nombreBeneficiario2) {
        this.nombreBeneficiario2 = nombreBeneficiario2;
    }

    public String getCuentaBeneficiario2() {
        return cuentaBeneficiario2;
    }
    public void setCuentaBeneficiario2(String cuentaBeneficiario2) {
        this.cuentaBeneficiario2 = cuentaBeneficiario2;
    }

    public String getRfcCurpBeneficiario2() {
        return rfcCurpBeneficiario2;
    }
    public void setRfcCurpBeneficiario2(String rfcCurpBeneficiario2) {
        this.rfcCurpBeneficiario2 = rfcCurpBeneficiario2;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }
    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public String getConceptoPago2() {
        return conceptoPago2;
    }
    public void setConceptoPago2(String conceptoPago2) {
        this.conceptoPago2 = conceptoPago2;
    }

    public String getClaveCatUsuario1() {
        return claveCatUsuario1;
    }
    public void setClaveCatUsuario1(String claveCatUsuario1) {
        this.claveCatUsuario1 = claveCatUsuario1;
    }

    public String getClaveCatUsuario2() {
        return claveCatUsuario2;
    }
    public void setClaveCatUsuario2(String claveCatUsuario2) {
        this.claveCatUsuario2 = claveCatUsuario2;
    }

    public String getClavePago() {
        return clavePago;
    }
    public void setClavePago(String clavePago) {
        this.clavePago = clavePago;
    }

    public String getReferenciaCobranza() {
        return referenciaCobranza;
    }
    public void setReferenciaCobranza(String referenciaCobranza) {
        this.referenciaCobranza = referenciaCobranza;
    }

    public String getReferenciaNumerica() {
        return referenciaNumerica;
    }
    public void setReferenciaNumerica(String referenciaNumerica) {
        this.referenciaNumerica = referenciaNumerica;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }
    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getTopologia() {
        return topologia;
    }
    public void setTopologia(String topologia) {
        this.topologia = topologia;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMedioEntrega() {
        return medioEntrega;
    }
    public void setMedioEntrega(String medioEntrega) {
        this.medioEntrega = medioEntrega;
    }

    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFirma() {
        return firma;
    }
    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        
        return gson.toJson(this);
    }
    public static RegistraOrdenRequest fromJSON(String message) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        
        return gson.fromJson(message, RegistraOrdenRequest.class);
    }
}
