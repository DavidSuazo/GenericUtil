package com.credencial.util.response;

import com.credencial.util.Constantes;
import static com.credencial.util.Constantes.SCAPED_PIPE;
import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ContextResponse implements Serializable, JSonable {

    private String aplicationBundle;
    private String rsaPrivate;
    private String rsaPublic;
    private Connection connection;
    private String applicationKye;
    private String applicationSecret;
    private int idContext;
    private String timeZone;
    private int idUser;
    private String applicant;
    private String currencyCode;
    private String definitionProduct;
    private String regAlv;
    private String identityNumber;
    private String affinityGroup;
    private String defaultSecuence;
    private String channel;
    private String stpInstitution;
    private String stpOperatingInstitution;
    private String stpPrefix;
    private String feeTransacction;
    private String payConfigSRT;
    private String configBillPayment;
    private String contextAltaWeb;
    private String merchantID;
    private String commissionPercentage;
    private String multiCommission;
    private String dollarValue;
    private String usr;
    private String penc;
    public static final String PRODUCT_PREPAGO = "PREP";
    public static final String PRODUCT_PREPAGO_AMUCS = "PREP2";
    public static final String PRODUCT_PREPAGO2 = "PREP2";
    public static final String PRODUCT_AHORRO = "AHR";
    private String cbuComission;
    private Boolean isMPOS;
    private String giftCardCommerceName;
    private Double giftCardComission;
    private String onsignaEntity;
    private String onsignaUser;
    private String onsignaPassword;
    private int catalogVersion;

    public String getRegAlv() {
        return regAlv;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getAffinityGroup() {
        return affinityGroup;
    }

    public String getDefaultSecuence() {
        return defaultSecuence;
    }

    public String getChannel() {
        return channel;
    }

    public void setRegAlv(String regAlv) {
        this.regAlv = regAlv;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setAffinityGroup(String affinityGroup) {
        this.affinityGroup = affinityGroup;
    }

    public void setDefaultSecuence(String defaultSecuence) {
        this.defaultSecuence = defaultSecuence;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public ContextResponse() {
    }

    public ContextResponse(String aplicationBundle, String rsaPrivate, String rsaPublic, String applicationKey,
            String applicationSecret, String tokenSession, String expires) {
        this.aplicationBundle = aplicationBundle;
        this.rsaPrivate = rsaPrivate;
        this.rsaPublic = rsaPublic;
        this.applicationKye = applicationKey;
        this.applicationSecret = applicationSecret;
        this.connection = new Connection();
        this.connection.setExpires(expires);
        this.connection.setToken(tokenSession);
    }

    public String getApplicant() {
        return applicant;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getDefinitionProduct() {
        return definitionProduct;
    }

    public String getDefinitionProduct(String keyProduct) {
        if (definitionProduct != null && !definitionProduct.equals(Constantes.EMPTY_STRING)) {
            String[] products = definitionProduct.split(SCAPED_PIPE);
            for (String product : products) {
                if (keyProduct != null && !keyProduct.equals(Constantes.EMPTY_STRING) && product.contains(keyProduct)) {
                    return product.substring(product.indexOf("=") + 1);
                }
            }
        }
        return "N/A";
    }

    public int getIdUser() {
        return idUser;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setDefinitionProduct(String definitionProduct) {
        this.definitionProduct = definitionProduct;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getAplicationBundle() {
        return aplicationBundle;
    }

    public void setAplicationBundle(String aplicationBundle) {
        this.aplicationBundle = aplicationBundle;
    }

    public String getRsaPrivate() {
        return rsaPrivate;
    }

    public void setRsaPrivate(String rsaPrivate) {
        this.rsaPrivate = rsaPrivate;
    }

    public String getRsaPublic() {
        return rsaPublic;
    }

    public void setRsaPublic(String rsaPublic) {
        this.rsaPublic = rsaPublic;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getApplicationKye() {
        return applicationKye;
    }

    public void setApplicationKye(String applicationKye) {
        this.applicationKye = applicationKye;
    }

    public String getApplicationSecret() {
        return applicationSecret;
    }

    public void setApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
    }

    public int getIdContext() {
        return idContext;
    }

    public void setIdContext(int idContext) {
        this.idContext = idContext;
    }

    public String getFeeTransacction() {
        return feeTransacction;
    }

    public void setFeeTransacction(String feeTransacction) {
        this.feeTransacction = feeTransacction;
    }

    public String getStpInstitution() {
        return stpInstitution;
    }

    public String getStpOperatingInstitution() {
        return stpOperatingInstitution;
    }

    public String getStpPrefix() {
        return stpPrefix;
    }

    public void setStpInstitution(String stpInstitution) {
        this.stpInstitution = stpInstitution;
    }

    public void setStpOperatingInstitution(String stpOperatingInstitution) {
        this.stpOperatingInstitution = stpOperatingInstitution;
    }

    public void setStpPrefix(String stpPrefix) {
        this.stpPrefix = stpPrefix;
    }

    public String getPayConfigSRT() {
        return payConfigSRT;
    }

    public void setPayConfigSRT(String payConfigSRT) {
        this.payConfigSRT = payConfigSRT;
    }

    public String getConfigBillPayment() {
        return configBillPayment;
    }

    public void setConfigBillPayment(String configBillPayment) {
        this.configBillPayment = configBillPayment;
    }

    public String getContextAltaWeb() {
        return contextAltaWeb;
    }

    public void setContextAltaWeb(String contextAltaWeb) {
        this.contextAltaWeb = contextAltaWeb;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(String commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public String getMultiCommission() {
        return multiCommission;
    }

    public void setMultiCommission(String multiCommission) {
        this.multiCommission = multiCommission;
    }

    public String getDollarValue() {
        return dollarValue;
    }

    public void setDollarValue(String dollarValue) {
        this.dollarValue = dollarValue;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPenc() {
        return penc;
    }

    public void setPenc(String penc) {
        this.penc = penc;
    }

    public String getCbuComission() {
        return cbuComission;
    }

    public void setCbuComission(String cbuComission) {
        this.cbuComission = cbuComission;
    }

    public Boolean getIsMPOS() {
        return isMPOS;
    }

    public void setIsMPOS(Boolean isMPOS) {
        this.isMPOS = isMPOS;
    }

    public String getGiftCardCommerceName() {
        return giftCardCommerceName;
    }

    public void setGiftCardCommerceName(String giftCardCommerceName) {
        this.giftCardCommerceName = giftCardCommerceName;
    }

    public Double getGiftCardComission() {
        return giftCardComission;
    }

    public void setGiftCardComission(Double giftCardComission) {
        this.giftCardComission = giftCardComission;
    }

    public String getOnsignaEntity() {
        return onsignaEntity;
    }

    public void setOnsignaEntity(String onsignaEntity) {
        this.onsignaEntity = onsignaEntity;
    }

    public String getOnsignaUser() {
        return onsignaUser;
    }

    public void setOnsignaUser(String onsignaUser) {
        this.onsignaUser = onsignaUser;
    }

    public String getOnsignaPassword() {
        return onsignaPassword;
    }

    public void setOnsignaPassword(String onsignaPassword) {
        this.onsignaPassword = onsignaPassword;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ContextResponse.class);
    }

    public int getCatalogVersion() {
        return catalogVersion;
    }

    public void setCatalogVersion(int catalogVersion) {
        this.catalogVersion = catalogVersion;
    }

}
