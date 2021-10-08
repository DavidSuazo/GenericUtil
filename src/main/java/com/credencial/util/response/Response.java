package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.credencial.util.autorizacion.response.ResponseAutorizar;
import com.credencial.util.buytime.response.ResponseBuyTime;
import com.credencial.util.casa.srtmx.response.CambiarEstadoResponse;
import com.credencial.util.casa.srtmx.response.ConsultarResponse;
import com.credencial.util.casa.srtmx.response.ResetContadorPinERRResponse;
import com.credencial.util.conciliacion.response.ConsCTResponseResult;
import com.credencial.util.conciliacion.response.CtifMVResponseResult;
import com.credencial.util.conciliacion.response.CuotMVResponseResult;
import com.credencial.util.request.Contact;
import com.credencial.util.scud.response.SCUDResponseDefault;
import com.credencial.util.spendpay.DetailResponse;
import com.credencial.util.tecas.core.response.CoreClientResponse;
import com.credencial.util.tecas.core.response.CuentaResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import stp.domain.STPResponse;

/**
 *
 * @author dsuazo
 */
public class Response implements Serializable, JSonable {

    private boolean success;
    private String message;
    private String mensaje;
    private Error error;
    private ResponseAutorizar responseAutorizar;
    private Connection connection;
    private ResponseBuyTime responseBuyTime;
    private ConsultarResponse consultarResponse;
    private CambiarEstadoResponse cambiarEstadoResponse;
    private ResetContadorPinERRResponse resetContadorPinERRResponse;
    private ContextResponse context;
    private UserRegistrationResponse userRegistrationResponse;
    private LoginResponse loginResponse;
    private StatusByCardResponse statusByCardResponse;
    private ChangeStatusCardResponse changeStatusCardResponse;
    private BalanceTransactionsResponse balanceTransactionsResponse;
    private CardToCardResponse cardToCardResponse;
    private ForgotPasswordResponse forgotPasswordResponse;
    private UpdatePasswordResponse updatePasswordResponse;
    private MarcaResponse marcaResponse;
    private ArrayList<Contact> contacts;
    private String contentResponseBase;
    private PayServiceResponse payServiceResponse;
    private LocationResponse locationResponse;
    private SucResponse sucResponse;
    private TermAndCondResponse termAndCondResponse;
    private ConfigContexResponse configContexResponse;
    private PayServiceTopUpResponse payServiceTopUpResponse;
    private ListProductsResponse listProductsResponse;
    private CvvDinamicResponse cvvDinamicResponse;
    private ProvinceResponse provinceResponse;
    private NotificationResponse notificationResponse;
    private CardsResponse cardsResponse;
    private InstitutionResponse institutionResponse;
    private ValidateCardResponse validateCardResponse;
    private RegisterOnboardResponse registerOnboardResponse;
    private STPResponse sTPResponse;
    private InfoUserResponse infoUserResponse;
    private ObtenerPinResponse obtenerPinResponse;
    private ConfigComisionResponse configComisionResponse;
    private RubrosResponse rubrosResponse;
    private EmpresasResponse empresasResponse;
    private RegisterMerchantMTTResponse registerMerchantMTTResponse;
    private ActividadEconomicaResponse actividadEconomicaResponse;
    private ArrayList<UifResponse> uifResponse;
    private IdentityOnboardingResponse identityOnboardingResponse;
    private DetailResponse detailResponse;
    private GiftCardResponse giftCardResponse;
    private GiftCardStatusVirtualBlisterResponse gitCardStatusVirtualBlisterResponse;
    private ListCodesUserResponse listCodesUserResponse;
    private InfoServiceResponse infoServiceResponse;
    private CuotMVResponseResult cuotMVResponseResult;
    private ConsCTResponseResult consCTResponseResult;
    private CtifMVResponseResult ctifMVResponseResult;
    private CoreClientResponse coreClientResponse;
    private CuentaResponse[] cuentaResponseArray;
    private CuentaResponse cuentaResponse;
    private SCUDResponseDefault sCUDResponseDefault;
    private InfoUserResponseFull infoUserResponseFull;

    public Response(boolean isSucces) {
        this.setSuccess(success);
    }

    public Response() {
    }
    
    public void setCuentaResponse(CuentaResponse cuentaResponse) {
        this.cuentaResponse = cuentaResponse;
    }    
    
    public CuentaResponse getCuentaResponse() {
        return cuentaResponse;
    }    

    public PayServiceResponse getPayServiceResponse() {
        return payServiceResponse;
    }

    public void setPayServiceResponse(PayServiceResponse payServiceResponse) {
        this.payServiceResponse = payServiceResponse;
    }

    public LoginResponse getLoginResponse() {
        return loginResponse;
    }

    public void setLoginResponse(LoginResponse loginResponse) {
        this.loginResponse = loginResponse;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Response.class);
    }

    /**
     * @return the responseAutorizar
     */
    public ResponseAutorizar getResponseAutorizar() {
        return responseAutorizar;
    }

    /**
     * @param responseAutorizar the responseAutorizar to set
     */
    public void setResponseAutorizar(ResponseAutorizar responseAutorizar) {
        this.responseAutorizar = responseAutorizar;
    }

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return the responseBuyTime
     */
    public ResponseBuyTime getResponseBuyTime() {
        return responseBuyTime;
    }

    /**
     * @param responseBuyTime the responseBuyTime to set
     */
    public void setResponseBuyTime(ResponseBuyTime responseBuyTime) {
        this.responseBuyTime = responseBuyTime;
    }

    public ConsultarResponse getConsultarResponse() {
        return consultarResponse;
    }

    public void setConsultarResponse(ConsultarResponse consultarResponse) {
        this.consultarResponse = consultarResponse;
    }

    public CambiarEstadoResponse getCambiarEstadoResponse() {
        return cambiarEstadoResponse;
    }

    public void setCambiarEstadoResponse(CambiarEstadoResponse cambiarEstadoResponse) {
        this.cambiarEstadoResponse = cambiarEstadoResponse;
    }

    public ResetContadorPinERRResponse getResetContadorPinERRResponse() {
        return resetContadorPinERRResponse;
    }

    public void setResetContadorPinERRResponse(ResetContadorPinERRResponse resetContadorPinERRResponse) {
        this.resetContadorPinERRResponse = resetContadorPinERRResponse;
    }

    public ContextResponse getContext() {
        return context;
    }

    public void setContext(ContextResponse context) {
        this.context = context;
    }

    public UserRegistrationResponse getUserRegistrationResponse() {
        return userRegistrationResponse;
    }

    public void setUserRegistrationResponse(UserRegistrationResponse userRegistrationResponse) {
        this.userRegistrationResponse = userRegistrationResponse;
    }

    public StatusByCardResponse getStatusByCardResponse() {
        return statusByCardResponse;
    }

    public void setStatusByCardResponse(StatusByCardResponse statusByCardResponse) {
        this.statusByCardResponse = statusByCardResponse;
    }

    public ChangeStatusCardResponse getChangeStatusCardResponse() {
        return changeStatusCardResponse;
    }

    public void setChangeStatusCardResponse(ChangeStatusCardResponse changeStatusCardResponse) {
        this.changeStatusCardResponse = changeStatusCardResponse;
    }

    public BalanceTransactionsResponse getBalanceTransactionsResponse() {
        return balanceTransactionsResponse;
    }

    public void setBalanceTransactionsResponse(BalanceTransactionsResponse balanceTransactionsResponse) {
        this.balanceTransactionsResponse = balanceTransactionsResponse;
    }

    public CardToCardResponse getCardToCardResponse() {
        return cardToCardResponse;
    }

    public void setCardToCardResponse(CardToCardResponse cardToCardResponse) {
        this.cardToCardResponse = cardToCardResponse;
    }

    public ForgotPasswordResponse getForgotPasswordResponse() {
        return forgotPasswordResponse;
    }

    public void setForgotPasswordResponse(ForgotPasswordResponse forgotPasswordResponse) {
        this.forgotPasswordResponse = forgotPasswordResponse;
    }

    public UpdatePasswordResponse getUpdatePasswordResponse() {
        return updatePasswordResponse;
    }

    public void setUpdatePasswordResponse(UpdatePasswordResponse updatePasswordResponse) {
        this.updatePasswordResponse = updatePasswordResponse;
    }

    public MarcaResponse getMarcaResponse() {
        return marcaResponse;
    }

    public void setMarcaResponse(MarcaResponse marcaResponse) {
        this.marcaResponse = marcaResponse;
    }

    public String getContentResponseBase() {
        return contentResponseBase;
    }

    public void setContentResponseBase(String contentResponseBase) {
        this.contentResponseBase = contentResponseBase;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public LocationResponse getLocationResponse() {
        return locationResponse;
    }

    public void setLocationResponse(LocationResponse locationResponse) {
        this.locationResponse = locationResponse;
    }

    public SucResponse getSucResponse() {
        return sucResponse;
    }

    public void setSucResponse(SucResponse sucResponse) {
        this.sucResponse = sucResponse;
    }

    public TermAndCondResponse getTermAndCondResponse() {
        return termAndCondResponse;
    }

    public void setTermAndCondResponse(TermAndCondResponse termAndCondResponse) {
        this.termAndCondResponse = termAndCondResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ConfigContexResponse getConfigContexResponse() {
        return configContexResponse;
    }

    public void setConfigContexResponse(ConfigContexResponse configContexResponse) {
        this.configContexResponse = configContexResponse;
    }

    public PayServiceTopUpResponse getPayServiceTopUpResponse() {
        return payServiceTopUpResponse;
    }

    public void setPayServiceTopUpResponse(PayServiceTopUpResponse payServiceTopUpResponse) {
        this.payServiceTopUpResponse = payServiceTopUpResponse;
    }

    public ListProductsResponse getListProductsResponse() {
        return listProductsResponse;
    }

    public void setListProductsResponse(ListProductsResponse listProductsResponse) {
        this.listProductsResponse = listProductsResponse;
    }

    public CvvDinamicResponse getCvvDinamicResponse() {
        return cvvDinamicResponse;
    }

    public void setCvvDinamicResponse(CvvDinamicResponse cvvDinamicResponse) {
        this.cvvDinamicResponse = cvvDinamicResponse;
    }

    public ProvinceResponse getProvinceResponse() {
        return provinceResponse;
    }

    public void setProvinceResponse(ProvinceResponse provinceResponse) {
        this.provinceResponse = provinceResponse;
    }

    public NotificationResponse getNotificationResponse() {
        return notificationResponse;
    }

    public void setNotificationResponse(NotificationResponse notificationResponse) {
        this.notificationResponse = notificationResponse;
    }

    public CardsResponse getCardsResponse() {
        return cardsResponse;
    }

    public void setCardsResponse(CardsResponse cardsResponse) {
        this.cardsResponse = cardsResponse;
    }

    public InstitutionResponse getInstitutionResponse() {
        return institutionResponse;
    }

    public void setInstitutionResponse(InstitutionResponse institutionResponse) {
        this.institutionResponse = institutionResponse;
    }

    public ValidateCardResponse getValidateCardResponse() {
        return validateCardResponse;
    }

    public void setValidateCardResponse(ValidateCardResponse validateCardResponse) {
        this.validateCardResponse = validateCardResponse;
    }

    public RegisterOnboardResponse getRegisterOnboardResponse() {
        return registerOnboardResponse;
    }

    public void setRegisterOnboardResponse(RegisterOnboardResponse registerOnboardResponse) {
        this.registerOnboardResponse = registerOnboardResponse;
    }

    public STPResponse getsTPResponse() {
        return sTPResponse;
    }

    public void setsTPResponse(STPResponse sTPResponse) {
        this.sTPResponse = sTPResponse;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public InfoUserResponse getInfoUserResponse() {
        return infoUserResponse;
    }

    public void setInfoUserResponse(InfoUserResponse infoUserResponse) {
        this.infoUserResponse = infoUserResponse;
    }

    public ObtenerPinResponse getObtenerPinResponse() {
        return obtenerPinResponse;
    }

    public void setObtenerPinResponse(ObtenerPinResponse obtenerPinResponse) {
        this.obtenerPinResponse = obtenerPinResponse;
    }

    public ConfigComisionResponse getConfigComisionResponse() {
        return configComisionResponse;
    }

    public void setConfigComisionResponse(ConfigComisionResponse configComisionResponse) {
        this.configComisionResponse = configComisionResponse;
    }

    public RubrosResponse getRubrosResponse() {
        return rubrosResponse;
    }

    public void setRubrosResponse(RubrosResponse rubrosResponse) {
        this.rubrosResponse = rubrosResponse;
    }

    public EmpresasResponse getEmpresasResponse() {
        return empresasResponse;
    }

    public void setEmpresasResponse(EmpresasResponse empresasResponse) {
        this.empresasResponse = empresasResponse;
    }

    public RegisterMerchantMTTResponse getRegisterMerchantMTTResponse() {
        return registerMerchantMTTResponse;
    }

    public void setRegisterMerchantMTTResponse(RegisterMerchantMTTResponse registerMerchantMTTResponse) {
        this.registerMerchantMTTResponse = registerMerchantMTTResponse;
    }

    public ActividadEconomicaResponse getActividadEconomicaResponse() {
        return actividadEconomicaResponse;
    }

    public void setActividadEconomicaResponse(ActividadEconomicaResponse actividadEconomicaResponse) {
        this.actividadEconomicaResponse = actividadEconomicaResponse;
    }

    /**
     * @return the uifResponse
     */
    public ArrayList<UifResponse> getUifResponse() {
        return uifResponse;
    }

    /**
     * @param uifResponse the uifResponse to set
     */
    public void setUifResponse(ArrayList<UifResponse> uifResponse) {
        this.uifResponse = uifResponse;
    }

    public IdentityOnboardingResponse getIdentityOnboardingResponse() {
        return identityOnboardingResponse;
    }

    public void setIdentityOnboardingResponse(IdentityOnboardingResponse identityOnboardingResponse) {
        this.identityOnboardingResponse = identityOnboardingResponse;
    }

    /**
     * @return the detailResponse
     */
    public DetailResponse getDetailResponse() {
        return detailResponse;
    }

    /**
     * @param detailResponse the detailResponse to set
     */
    public void setDetailResponse(DetailResponse detailResponse) {
        this.detailResponse = detailResponse;
    }

    public GiftCardResponse getGiftCardResponse() {
        return giftCardResponse;
    }

    public void setGiftCardResponse(GiftCardResponse giftCardResponse) {
        this.giftCardResponse = giftCardResponse;
    }

    public GiftCardStatusVirtualBlisterResponse getGitCardStatusVirtualBlisterResponse() {
        return gitCardStatusVirtualBlisterResponse;
    }

    public void setGitCardStatusVirtualBlisterResponse(GiftCardStatusVirtualBlisterResponse gitCardStatusVirtualBlisterResponse) {
        this.gitCardStatusVirtualBlisterResponse = gitCardStatusVirtualBlisterResponse;
    }

    public ListCodesUserResponse getListCodesUserResponse() {
        return listCodesUserResponse;
    }

    public void setListCodesUserResponse(ListCodesUserResponse listCodesUserResponse) {
        this.listCodesUserResponse = listCodesUserResponse;
    }

    public InfoServiceResponse getInfoServiceResponse() {
        return infoServiceResponse;
    }

    public void setInfoServiceResponse(InfoServiceResponse infoServiceResponse) {
        this.infoServiceResponse = infoServiceResponse;
    }

    public CuotMVResponseResult getCuotMVResponseResult() {
        return cuotMVResponseResult;
    }

    public void setCuotMVResponseResult(CuotMVResponseResult cuotMVResponseResult) {
        this.cuotMVResponseResult = cuotMVResponseResult;
    }

    public ConsCTResponseResult getConsCTResponseResult() {
        return consCTResponseResult;
    }

    public void setConsCTResponseResult(ConsCTResponseResult consCTResponseResult) {
        this.consCTResponseResult = consCTResponseResult;
    }

    public CtifMVResponseResult getCtifMVResponseResult() {
        return ctifMVResponseResult;
    }

    public void setCtifMVResponseResult(CtifMVResponseResult ctifMVResponseResult) {
        this.ctifMVResponseResult = ctifMVResponseResult;
    }

    public CoreClientResponse getCoreClientResponse() {
        return coreClientResponse;
    }

    public void setCoreClientResponse(CoreClientResponse coreClientResponse) {
        this.coreClientResponse = coreClientResponse;
    }

    public CuentaResponse[] getCuentaResponseArray() {
        return cuentaResponseArray;
    }

    public void setCuentaResponse(CuentaResponse[] cuentaResponseArray) {
        this.cuentaResponseArray = cuentaResponseArray;
    }

    public SCUDResponseDefault getsCUDResponseDefault() {
        return sCUDResponseDefault;
    }

    public void setsCUDResponseDefault(SCUDResponseDefault sCUDResponseDefault) {
        this.sCUDResponseDefault = sCUDResponseDefault;
    }

    public InfoUserResponseFull getInfoUserResponseFull() {
        return infoUserResponseFull;
    }

    public void setInfoUserResponseFull(InfoUserResponseFull infoUserResponseFull) {
        this.infoUserResponseFull = infoUserResponseFull;
    }



}
