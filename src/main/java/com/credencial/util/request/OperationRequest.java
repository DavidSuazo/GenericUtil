package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class OperationRequest extends GBMBaseRequest implements Serializable, JSonable {

    private String idOperation;
    private int idOperationType;
    private int idStatus;
    private int returnKey;
    private int idUser;
    private int idError;
    private int idErrorSrt;
    private int counterpartInstitution;
    private String company;
    private String description;
    private String keyTracking;
    private int operatingInstitution;
    private String amount;
    private int paymentType;

    private int orderingAccountType;
    private String orderingAcount;
    private String orderingName;
    private String orderingRfcCurp;

    private String beneficiaryRfcCurp;
    private int beneficiaryAccountType;
    private String beneficiaryName;
    private String beneficiaryAccount;
    private String beneficiaryEmail;

    private String paymentConcept;
    private int numericalReference;
    private String topology;
    private String folioOrigin;
    private String prefContext;
    private String channel;
    private String contextApplication;
    private String currency;
    private int idContext;
    private int benificiaryIdUser;
    private String transactionId;
    private String cbu;
    private String net_amount;
    private String net_commision;
    private String authNumber;
    private String estado;
    private String cardType;
    private String rubro;
    private String denCom;
    private String idQr;
    private String commerceId;
    private String trace;
    private String dateHourTransaction;
    private String datePos;
    private String accountNumber;
    private String deliverySystem;
    private String transaction;
    private String transactionType;
    private String transactionSubType;
    private String productCode;
    private String responseCode;
    private String location;
    private String referenceOperation;
    private String sku;
    private String transactionGUID;
    private String authNumberOnsigna;

    /**
     * @return the rubro
     */
    public String getRubro() {
        return rubro;
    }

    /**
     * @return the denCom
     */
    public String getDenCom() {
        return denCom;
    }

    /**
     * @param rubro the rubro to set
     */
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    /**
     * @param denCom the denCom to set
     */
    public void setDenCom(String denCom) {
        this.denCom = denCom;
    }

    public String getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(String idOperation) {
        this.idOperation = idOperation;
    }

    public int getIdOperationType() {
        return idOperationType;
    }

    public void setIdOperationType(int idOperationType) {
        this.idOperationType = idOperationType;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getReturnKey() {
        return returnKey;
    }

    public void setReturnKey(int returnKey) {
        this.returnKey = returnKey;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdError() {
        return idError;
    }

    public void setIdError(int idError) {
        this.idError = idError;
    }

    public int getCounterpartInstitution() {
        return counterpartInstitution;
    }

    public void setCounterpartInstitution(int counterpartInstitution) {
        this.counterpartInstitution = counterpartInstitution;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getKeyTracking() {
        return keyTracking;
    }

    public void setKeyTracking(String keyTracking) {
        this.keyTracking = keyTracking;
    }

    public int getOperatingInstitution() {
        return operatingInstitution;
    }

    public void setOperatingInstitution(int operatingInstitution) {
        this.operatingInstitution = operatingInstitution;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public int getBeneficiaryAccountType() {
        return beneficiaryAccountType;
    }

    public void setBeneficiaryAccountType(int beneficiaryAccountType) {
        this.beneficiaryAccountType = beneficiaryAccountType;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public String getBeneficiaryEmail() {
        return beneficiaryEmail;
    }

    public void setBeneficiaryEmail(String beneficiaryEmail) {
        this.beneficiaryEmail = beneficiaryEmail;
    }

    public String getPaymentConcept() {
        return paymentConcept;
    }

    public void setPaymentConcept(String paymentConcept) {
        this.paymentConcept = paymentConcept;
    }

    public int getNumericalReference() {
        return numericalReference;
    }

    public void setNumericalReference(int numericalReference) {
        this.numericalReference = numericalReference;
    }

    public String getTopology() {
        return topology;
    }

    public void setTopology(String topology) {
        this.topology = topology;
    }

    public String getFolioOrigin() {
        return folioOrigin;
    }

    public void setFolioOrigin(String folioOrigin) {
        this.folioOrigin = folioOrigin;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, OperationRequest.class);
    }

    public String getPrefContext() {
        return prefContext;
    }

    public void setPrefContext(String prefContext) {
        this.prefContext = prefContext;
    }

    public String getBeneficiaryRfcCurp() {
        return beneficiaryRfcCurp;
    }

    public void setBeneficiaryRfcCurp(String beneficiaryRfcCurp) {
        this.beneficiaryRfcCurp = beneficiaryRfcCurp;
    }

    public int getOrderingAccountType() {
        return orderingAccountType;
    }

    public String getOrderingAcount() {
        return orderingAcount;
    }

    public String getOrderingName() {
        return orderingName;
    }

    public String getOrderingRfcCurp() {
        return orderingRfcCurp;
    }

    public void setOrderingAccountType(int orderingAccountType) {
        this.orderingAccountType = orderingAccountType;
    }

    public void setOrderingAcount(String orderingAcount) {
        this.orderingAcount = orderingAcount;
    }

    public void setOrderingName(String orderingName) {
        this.orderingName = orderingName;
    }

    public void setOrderingRfcCurp(String orderingRfcCurp) {
        this.orderingRfcCurp = orderingRfcCurp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdErrorSrt() {
        return idErrorSrt;
    }

    public void setIdErrorSrt(int idErrorSrt) {
        this.idErrorSrt = idErrorSrt;
    }

    public String getChannel() {
        return channel;
    }

    public String getContextApplication() {
        return contextApplication;
    }

    public String getCurrency() {
        return currency;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setContextApplication(String contextApplication) {
        this.contextApplication = contextApplication;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getIdContext() {
        return idContext;
    }

    public void setIdContext(int idContext) {
        this.idContext = idContext;
    }

    /**
     * @return the benificiaryIdUser
     */
    public int getBenificiaryIdUser() {
        return benificiaryIdUser;
    }

    /**
     * @param benificiaryIdUser the benificiaryIdUser to set
     */
    public void setBenificiaryIdUser(int benificiaryIdUser) {
        this.benificiaryIdUser = benificiaryIdUser;
    }

    /**
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    /**
     * @return the net_amount
     */
    public String getNet_amount() {
        return net_amount;
    }

    /**
     * @param net_amount the net_amount to set
     */
    public void setNet_amount(String net_amount) {
        this.net_amount = net_amount;
    }

    /**
     * @return the net_commision
     */
    public String getNet_commision() {
        return net_commision;
    }

    /**
     * @param net_commision the net_commision to set
     */
    public void setNet_commision(String net_commision) {
        this.net_commision = net_commision;
    }

    /**
     * @return the authNumber
     */
    public String getAuthNumber() {
        return authNumber;
    }

    /**
     * @param authNumber the authNumber to set
     */
    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return the idQr
     */
    public String getIdQr() {
        return idQr;
    }

    /**
     * @param idQr the idQr to set
     */
    public void setIdQr(String idQr) {
        this.idQr = idQr;
    }

    public String getCommerceId() {
        return commerceId;
    }

    public void setCommerceId(String commerceId) {
        this.commerceId = commerceId;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public String getDateHourTransaction() {
        return dateHourTransaction;
    }

    public void setDateHourTransaction(String dateHourTransaction) {
        this.dateHourTransaction = dateHourTransaction;
    }

    public String getDatePos() {
        return datePos;
    }

    public void setDatePos(String datePos) {
        this.datePos = datePos;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDeliverySystem() {
        return deliverySystem;
    }

    public void setDeliverySystem(String deliverySystem) {
        this.deliverySystem = deliverySystem;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionSubType() {
        return transactionSubType;
    }

    public void setTransactionSubType(String transactionSubType) {
        this.transactionSubType = transactionSubType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReferenceOperation() {
        return referenceOperation;
    }

    public void setReferenceOperation(String referenceOperation) {
        this.referenceOperation = referenceOperation;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTransactionGUID() {
        return transactionGUID;
    }

    public void setTransactionGUID(String transactionGUID) {
        this.transactionGUID = transactionGUID;
    }

    public String getAuthNumberOnsigna() {
        return authNumberOnsigna;
    }

    public void setAuthNumberOnsigna(String authNumberOnsigna) {
        this.authNumberOnsigna = authNumberOnsigna;
    }

}
