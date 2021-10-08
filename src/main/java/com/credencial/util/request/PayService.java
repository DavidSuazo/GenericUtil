package com.credencial.util.request;

import static com.credencial.util.Constantes.EQUALS;
import static com.credencial.util.Constantes.SCAPED_PIPE;
import com.credencial.util.JSonable;
import com.credencial.util.error.InvalidParametersException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author cj_sr
 */
public class PayService extends GBMBaseRequest implements Serializable, JSonable {

    private String amount;
    private BigDecimal amountWithFirstComission;
    private BigDecimal amountWithTwoComission;
    private BigDecimal amountPesosArg;
    private String feeAmount;
    private String cvv;
    private String expirationMonth;
    private String expirationYear;
    private String typeService;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;
    private String referenceNumber;
    private String ticketNumber;
    private String countryCode;
    private String currencyCode;
    private String codeService;
    private String pinDriver;
    private String concept;
    private EnumTypeOperation enumTypeOperation;
    private String bank;
    private String sucursal;
    private String beneficiary;
    private String account;
    private int userId;

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, PayService.class);
    }

    public String getPinDriver() {
        return pinDriver;
    }

    public void setPinDriver(String pinDriver) {
        this.pinDriver = pinDriver;
    }

    public EnumTypeOperation getEnumTypeOperation() {
        return enumTypeOperation;
    }

    public void setEnumTypeOperation(EnumTypeOperation enumTypeOperation) {
        this.enumTypeOperation = enumTypeOperation;
    }

    public String getComercio(String paySrt) throws InvalidParametersException {
        if (paySrt != null && !paySrt.isEmpty()) {
            String[] split = paySrt.split(SCAPED_PIPE);
            if (split.length == 3 || split.length == 4) {
                for (String comercio : split) {
                    String[] split1 = comercio.split(EQUALS);
                    if (split1.length == 2) {
                        if (getEnumTypeOperation().name().contains(split1[0])) {
                            return paySrt = split1[1];
                        }
                    }
                }
            }

        }
        throw new InvalidParametersException("OperationType no soportada, verifique!");

    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BigDecimal getAmountWithFirstComission() {
        return amountWithFirstComission;
    }

    public void setAmountWithFirstComission(BigDecimal amountWithFirstComission) {
        this.amountWithFirstComission = amountWithFirstComission;
    }

    public BigDecimal getAmountWithTwoComission() {
        return amountWithTwoComission;
    }

    public void setAmountWithTwoComission(BigDecimal amountWithTwoComission) {
        this.amountWithTwoComission = amountWithTwoComission;
    }

    public BigDecimal getAmountPesosArg() {
        return amountPesosArg;
    }

    public void setAmountPesosArg(BigDecimal amountPesosArg) {
        this.amountPesosArg = amountPesosArg;
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
