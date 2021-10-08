package com.credencial.util.response;

import java.util.List;

/**
 *
 * @author cj_sr
 */
public class PayServiceTopUpResponse {

    private String trnstatus;
    private String mensaje;
    private String folioautorizacion;
    private String idventa;
    private String trnfecha;
    private String trnhora;
    private String numero;
    private String importe;
    private String referenciacliente;
    private String comision;
    private String folioReporte;
    private String mensajeTiket;
    private String idCompany;
    private String companyName;
    private String amountType;
    private String idClient;
    private String fullCargaReference;
    private List<Company> company;

    public String getTrnstatus() {
        return trnstatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFolioautorizacion() {
        return folioautorizacion;
    }

    public String getIdventa() {
        return idventa;
    }

    public String getTrnfecha() {
        return trnfecha;
    }

    public String getTrnhora() {
        return trnhora;
    }

    public String getNumero() {
        return numero;
    }

    public String getImporte() {
        return importe;
    }

    public String getReferenciacliente() {
        return referenciacliente;
    }

    public void setTrnstatus(String trnstatus) {
        this.trnstatus = trnstatus;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFolioautorizacion(String folioautorizacion) {
        this.folioautorizacion = folioautorizacion;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public void setTrnfecha(String trnfecha) {
        this.trnfecha = trnfecha;
    }

    public void setTrnhora(String trnhora) {
        this.trnhora = trnhora;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public void setReferenciacliente(String referenciacliente) {
        this.referenciacliente = referenciacliente;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getFolioReporte() {
        return folioReporte;
    }

    public void setFolioReporte(String folioReporte) {
        this.folioReporte = folioReporte;
    }

    public String getMensajeTiket() {
        return mensajeTiket;
    }

    public void setMensajeTiket(String mensajeTiket) {
        this.mensajeTiket = mensajeTiket;
    }

    /**
     * @return the company
     */
    public List<Company> getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(List<Company> company) {
        this.company = company;
    }

    /**
     * @return the idCompany
     */
    public String getIdCompany() {
        return idCompany;
    }

    /**
     * @param idCompany the idCompany to set
     */
    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    /**
     * @return the idClient
     */
    public String getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getFullCargaReference() {
        return fullCargaReference;
    }

    public void setFullCargaReference(String fullCargaReference) {
        this.fullCargaReference = fullCargaReference;
    }

}
