package com.credencial.util.request;

import static com.credencial.util.Constantes.EQUALS;
import static com.credencial.util.Constantes.SCAPED_PIPE;
import com.credencial.util.JSonable;
import com.credencial.util.error.InvalidParametersException;
import com.credencial.util.response.ContextResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class CardToCardRequest extends GBMBaseRequest implements Serializable, JSonable {

    private String destinationCard;
    private String amount;
    private String currencyCode;
    private String entryMode;
    private String concept;
    private String reference;
    private String notifyDestiny;
    private int typeTransfer;
    private int typeBenefAcount;
    private int orderingAccountType;  

    private String ordeningName;
    private String ordeningRfcCurp;
    private String beneficiaryName;
    private String beneficiaryRfcCurp;
    private String counterPartInstitution;
    private String idUser;
    private String idOperation;
    private int numericalReference;
    private String keyTracking;
    private ContextResponse context;
    private int benificiaryIdUser;
    private String transactionId;    
    private String orderingCBU;
    private String idQr;
    private String cardType;
    private String rubro;
    private String denCom;

    public String getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getDestinationCard() {
        return destinationCard;
    }

    public String getEntryMode() {
        return entryMode;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setDestinationCard(String destinationCard) {
        this.destinationCard = destinationCard;
    }

    public void setEntryMode(String entryMode) {
        this.entryMode = entryMode;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CardToCardRequest.class);
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getNotifyDestiny() {
        return notifyDestiny;
    }

    public String getReference() {
        return reference;
    }

    public void setNotifyDestiny(String notifyDestiny) {
        this.notifyDestiny = notifyDestiny;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getTypeTransfer() {
        return typeTransfer;
    }

    public void setTypeTransfer(int typeTransfer) {
        this.typeTransfer = typeTransfer;
    }

    public String getOrdeningName() {
        return ordeningName;
    }

    public void setOrdeningName(String ordeningName) {
        this.ordeningName = ordeningName;
    }

    public String getOrdeningRfcCurp() {
        return ordeningRfcCurp;
    }

    public void setOrdeningRfcCurp(String ordeningRfcCurp) {
        this.ordeningRfcCurp = ordeningRfcCurp;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryRfcCurp() {
        return beneficiaryRfcCurp;
    }

    public void setBeneficiaryRfcCurp(String beneficiaryRfcCurp) {
        this.beneficiaryRfcCurp = beneficiaryRfcCurp;
    }

    public String getCounterPartInstitution() {
        return counterPartInstitution;
    }

    public void setCounterPartInstitution(String counterPartInstitution) {
        this.counterPartInstitution = counterPartInstitution;
    }

    public ContextResponse getContext() {
        return context;
    }

    public void setContext(ContextResponse context) {
        this.context = context;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(String idOperation) {
        this.idOperation = idOperation;
    }

    public int getNumericalReference() {
        return numericalReference;
    }

    public String getKeyTracking() {
        return keyTracking;
    }

    public void setNumericalReference(int numericalReference) {
        this.numericalReference = numericalReference;
    }

    public void setKeyTracking(String keyTracking) {
        this.keyTracking = keyTracking;
    }

    public int getOrderingAccountType() {
        return orderingAccountType;
    }

    public void setOrderingAccountType(int orderingAccountType) {
        this.orderingAccountType = orderingAccountType;
    }

    public int getTypeBenefAcount() {
        return typeBenefAcount;
    }

    public void setTypeBenefAcount(int typeBenefAcount) {
        this.typeBenefAcount = typeBenefAcount;
    }
     public String getComercio(String paySrt) throws InvalidParametersException {
        if (paySrt != null && !paySrt.isEmpty()) {
            String[] split = paySrt.split(SCAPED_PIPE);
            if (split.length == 3) {
                for (String comercio : split) {
                    String[] split1 = comercio.split(EQUALS);
                    if (split1.length == 2) {
                        if ("PAY_SERVICE".contains(split1[0])) {
                            return paySrt = split1[1];
                        }
                    }
                }
            }

        }
        throw new InvalidParametersException("OperationType no soportada, verifique!");

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

    /**
     * @return the rubro
     */
    public String getRubro() {
        return rubro;
    }

    /**
     * @param rubro the rubro to set
     */
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
     /**
     * @return the orderingCBU
     */
    public String getOrderingCBU() {
        return orderingCBU;
    }

    /**
     * @param orderingCBU the orderingCBU to set
     */
    public void setOrderingCBU(String orderingCBU) {
        this.orderingCBU = orderingCBU;
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
     * @return the denCom
     */
    public String getDenCom() {
        return denCom;
    }

    /**
     * @param denCom the denCom to set
     */
    public void setDenCom(String denCom) {
        this.denCom = denCom;
    }

    

}
