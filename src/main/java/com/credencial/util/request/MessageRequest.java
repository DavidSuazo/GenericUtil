package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.credencial.util.conciliacion.request.ConciliacionRequest;
import com.credencial.util.loginAuthenticate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

public class MessageRequest implements Serializable, JSonable {

    private String nameService;
    private String urlWSDL;
    private loginAuthenticate authenticate;
    private ContextRegistrationRequest contextRegistrationRequest;
    private UserRegistrationRequest userRegistrationRequest;
    private LoginRequest loginRequest;
    private StatusByCardRequest statusByCardRequest;
    private ChangeStatusCardRequest changeStatusCardRequest;
    private BalanceTransactionsRequest balanceTransactionsRequest;
    private CardToCardRequest cardToCardRequest;
    private ForgotPasswordRequest forgotPasswordRequest;
    private UpdatePasswordRequest updatePasswordRequest;
    private MarcaRequest marcaRequest;
    //private RequestServices requestServices;
    private Contact contact;
    private PayService payService;
    private Voucher voucher;
    private RegisterOnboardRequest registerOnboardRequest;
    private LocationsRequest locationsRequest;
    private SucRequest sucRequest;
    private UpdatePinDriverRequest updatePinDriverRequest;
    private CvvDinamicRequest cvvDinamicRequest;
    private PayBillPaymentRequest billPaymentRequest;
    private ProvincesRequest provincesRequest;
    private PIN_AtmRequest atmRequest;
    private ApplyForCardRequest appyForCardRequest;
    private InstitutionRequest institutionRequest;
    private ValidateCardRequest validateCardRequest;
    private OperationRequest operationRequest;
    private GetCardsRequest cardsRequest;
    private StatusConfigRequest statusConfigRequest;
    private GetPinCard getPinCard;
    private ConfigComisionRequest configComisionRequest;
    private RubroRequest rubrosRequest;
    private EmpresaRequest empresaRequest;
    private RegisterPhotosWebRequest registerPhotosWebRequest;
    private InfoQRRequest infoQRRequest;
    private ConciliacionRequest conciliacionRequest;
    private DeviceEntity device;
    private AppInfo appInfo;

    public PayService getPayService() {
        return payService;
    }

    public void setPayService(PayService payService) {
        this.payService = payService;
    }

    public ContextRegistrationRequest getContextRegistrationRequest() {
        return contextRegistrationRequest;
    }

    public UserRegistrationRequest getUserRegistrationRequest() {
        return userRegistrationRequest;
    }

    public void setContextRegistrationRequest(ContextRegistrationRequest contextRegistrationRequest) {
        this.contextRegistrationRequest = contextRegistrationRequest;
    }

    public void setUserRegistrationRequest(UserRegistrationRequest userRegistrationRequest) {
        this.userRegistrationRequest = userRegistrationRequest;
    }

    public loginAuthenticate getAuthenticate() {
        return authenticate;
    }

    public String getNameService() {
        return nameService;
    }

    public String getUrlWSDL() {
        return urlWSDL;
    }

    public void setAuthenticate(loginAuthenticate authenticate) {
        this.authenticate = authenticate;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public void setUrlWSDL(String urlWSDL) {
        this.urlWSDL = urlWSDL;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, MessageRequest.class);
    }

    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

    public void setLoginRequest(LoginRequest loginRequest) {
        this.loginRequest = loginRequest;
    }

    public StatusByCardRequest getStatusByCardRequest() {
        return statusByCardRequest;
    }

    public void setStatusByCardRequest(StatusByCardRequest statusByCardRequest) {
        this.statusByCardRequest = statusByCardRequest;
    }

    public ChangeStatusCardRequest getChangeStatusCardRequest() {
        return changeStatusCardRequest;
    }

    public void setChangeStatusCardRequest(ChangeStatusCardRequest changeStatusCardRequest) {
        this.changeStatusCardRequest = changeStatusCardRequest;
    }

    public BalanceTransactionsRequest getBalanceTransactionsRequest() {
        return balanceTransactionsRequest;
    }

    public void setBalanceTransactionsRequest(BalanceTransactionsRequest balanceTransactionsRequest) {
        this.balanceTransactionsRequest = balanceTransactionsRequest;
    }

    public CardToCardRequest getCardToCardRequest() {
        return cardToCardRequest;
    }

    public void setCardToCardRequest(CardToCardRequest cardToCardRequest) {
        this.cardToCardRequest = cardToCardRequest;
    }

    public ForgotPasswordRequest getForgotPasswordRequest() {
        return forgotPasswordRequest;
    }

    public void setForgotPasswordRequest(ForgotPasswordRequest forgotPasswordRequest) {
        this.forgotPasswordRequest = forgotPasswordRequest;
    }

    public MarcaRequest getMarcaRequest() {
        return marcaRequest;
    }

    public void setMarcaRequest(MarcaRequest marcaRequest) {
        this.marcaRequest = marcaRequest;
    }

    public UpdatePasswordRequest getUpdatePasswordRequest() {
        return updatePasswordRequest;
    }

    public void setUpdatePasswordRequest(UpdatePasswordRequest updatePasswordRequest) {
        this.updatePasswordRequest = updatePasswordRequest;
    }

    /*public RequestServices getRequestServices() {
        return requestServices;
    }

    public void setRequestServices(RequestServices requestServices) {
        this.requestServices = requestServices;
    }*/

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public RegisterOnboardRequest getRegisterOnboardRequest() {
        return registerOnboardRequest;
    }

    public void setRegisterOnboardRequest(RegisterOnboardRequest registerOnboardRequest) {
        this.registerOnboardRequest = registerOnboardRequest;
    }

    public SucRequest getSucRequest() {
        return sucRequest;
    }

    public void setSucRequest(SucRequest sucRequest) {
        this.sucRequest = sucRequest;
    }

    public UpdatePinDriverRequest getUpdatePinDriverRequest() {
        return updatePinDriverRequest;
    }

    public void setUpdatePinDriverRequest(UpdatePinDriverRequest updatePinDriverRequest) {
        this.updatePinDriverRequest = updatePinDriverRequest;
    }

    public LocationsRequest getLocationsRequest() {
        return locationsRequest;
    }

    public void setLocationsRequest(LocationsRequest locationsRequest) {
        this.locationsRequest = locationsRequest;
    }

    public CvvDinamicRequest getCvvDinamicRequest() {
        return cvvDinamicRequest;
    }

    public void setCvvDinamicRequest(CvvDinamicRequest cvvDinamicRequest) {
        this.cvvDinamicRequest = cvvDinamicRequest;
    }

    public ProvincesRequest getProvincesRequest() {
        return provincesRequest;
    }

    public void setProvincesRequest(ProvincesRequest provincesRequest) {
        this.provincesRequest = provincesRequest;
    }

    public PIN_AtmRequest getAtmRequest() {
        return atmRequest;
    }

    public void setAtmRequest(PIN_AtmRequest atmRequest) {
        this.atmRequest = atmRequest;
    }

    public ApplyForCardRequest getAppyForCardRequest() {
        return appyForCardRequest;
    }

    public void setAppyForCardRequest(ApplyForCardRequest appyForCardRequest) {
        this.appyForCardRequest = appyForCardRequest;
    }

    public InstitutionRequest getInstitutionRequest() {
        return institutionRequest;
    }

    public void setInstitutionRequest(InstitutionRequest institutionRequest) {
        this.institutionRequest = institutionRequest;
    }

    public ValidateCardRequest getValidateCardRequest() {
        return validateCardRequest;
    }

    public void setValidateCardRequest(ValidateCardRequest validateCardRequest) {
        this.validateCardRequest = validateCardRequest;
    }

    public OperationRequest getOperationRequest() {
        return operationRequest;
    }

    public void setOperationRequest(OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }

    public GetCardsRequest getCardsRequest() {
        return cardsRequest;
    }

    public void setCardsRequest(GetCardsRequest cardsRequest) {
        this.cardsRequest = cardsRequest;
    }

    public StatusConfigRequest getStatusConfigRequest() {
        return statusConfigRequest;
    }

    public void setStatusConfigRequest(StatusConfigRequest statusConfigRequest) {
        this.statusConfigRequest = statusConfigRequest;
    }

    public PayBillPaymentRequest getBillPaymentRequest() {
        return billPaymentRequest;
    }

    public void setBillPaymentRequest(PayBillPaymentRequest billPaymentRequest) {
        this.billPaymentRequest = billPaymentRequest;
    }

    public GetPinCard getGetPinCard() {
        return getPinCard;
    }

    public void setGetPinCard(GetPinCard getPinCard) {
        this.getPinCard = getPinCard;
    }

    public ConfigComisionRequest getConfigComisionRequest() {
        return configComisionRequest;
    }

    public void setConfigComisionRequest(ConfigComisionRequest configComisionRequest) {
        this.configComisionRequest = configComisionRequest;
    }

    public RubroRequest getRubrosRequest() {
        return rubrosRequest;
    }

    public void setRubrosRequest(RubroRequest rubrosRequest) {
        this.rubrosRequest = rubrosRequest;
    }

    public EmpresaRequest getEmpresaRequest() {
        return empresaRequest;
    }

    public void setEmpresaRequest(EmpresaRequest empresaRequest) {
        this.empresaRequest = empresaRequest;
    }

    public RegisterPhotosWebRequest getRegisterPhotosWebRequest() {
        return registerPhotosWebRequest;
    }

    public void setRegisterPhotosWebRequest(RegisterPhotosWebRequest registerPhotosWebRequest) {
        this.registerPhotosWebRequest = registerPhotosWebRequest;
    }

    /**
     * @return the infoQRRequest
     */
    public InfoQRRequest getInfoQRRequest() {
        return infoQRRequest;
    }

    /**
     * @param infoQRRequest the infoQRRequest to set
     */
    public void setInfoQRRequest(InfoQRRequest infoQRRequest) {
        this.infoQRRequest = infoQRRequest;
    }

    public ConciliacionRequest getConciliacionRequest() {
        return conciliacionRequest;
    }

    public void setConciliacionRequest(ConciliacionRequest conciliacionRequest) {
        this.conciliacionRequest = conciliacionRequest;
    }

    public DeviceEntity getDevice() {
        return device;
    }

    public void setDevice(DeviceEntity device) {
        this.device = device;
    }

    public AppInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

}
