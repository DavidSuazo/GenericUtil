package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class PayBillPaymentRequest extends GBMBaseRequest implements Serializable, JSonable {

    private int idUser;
    private String grupo;
    private String sku;
    private String referenciaCliente;
    private String reference1;
    private String reference2;
    private String reference3;
    private String comision;
    private Double amount;
    private String caja;
    private String sucursal;
    private String cajero;
    private String type;
    private String number;
    private String referenceNumber;
    private boolean isTelcel;
    private EnumTypeOperation typeOperation;
    private String transactionGuid;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getSku() {
        return sku;
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public String getReference1() {
        return reference1;
    }

    public String getReference2() {
        return reference2;
    }

    public String getReference3() {
        return reference3;
    }

    public String getComision() {
        return comision;
    }

    public String getCaja() {
        return caja;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getCajero() {
        return cajero;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        this.referenciaCliente = referenciaCliente;
    }

    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    public void setReference3(String reference3) {
        this.reference3 = reference3;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, PayBillPaymentRequest.class);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public boolean isIsTelcel() {
        return isTelcel;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setIsTelcel(boolean isTelcel) {
        this.isTelcel = isTelcel;
    }

    public EnumTypeOperation getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(EnumTypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTransactionGuid() {
        return transactionGuid;
    }

    public void setTransactionGuid(String transactionGuid) {
        this.transactionGuid = transactionGuid;
    }

}
