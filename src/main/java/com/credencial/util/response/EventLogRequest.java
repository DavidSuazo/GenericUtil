package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class EventLogRequest {

    public static final String E_CARD_TO_CARD = "cardToCard";
    public static final String E_TRANSFER = "transfer";
    public static final String E_PAY_AFFINITAS = "payAffinitas";
    public static final String E_SUPPORT_PAY_AFFINITAS = "supportPayAffinitas";
    public static final String E_LOGIN = "login";
    public static final String E_REGISTER_PERSON_AVANTA = "registerPersonAvanta";
    public static final String E_REGISTER_DIGITAL_FOLDER_AVANTA = "registerDigitalFolderAvanta";
    public static final String E_REGISTER_ACOUNT_AVANTA = "registerAcountAvanta";
    public static final String E_REGISTER_IN_GBM = "registerGMB";
    public static final String E_REGISTER_BASIC_IN_GBM = "registerBasicUser";
    public static final String E_REGISTER_BASIC = "registerBasic";
    public static final String E_REGISTER_ONBOARDING = "registerOnboarding";
    public static final String E_APPLY_FOR_CARD_LEVEL_2 = "applyForCardLevel2";
    public static final String E_REGISTER_ONBOARDING_TMP = "registerOnboardingTmp";
    public static final String E_ONBOARDING = "onboarding";
    public static final String E_UPDATE_PHOTOS_CHANGE_STATUS = "updatePhotosChangeStatus";
    public static final String E_REGISTER_ONBOARDING_SUPPORT = "registerOnboardingSupport";
    public static final String E_STATUS_BY_CARD = "statusByCard";
    public static final String E_SEND_TOKEN_MAIL = "sendTokenMail";
    public static final String E_SEND_VOUCHER_PAY = "sendVoucherPay";
    public static final String E_STATUS_MARCA = "statusMarca";
    public static final String E_GET_CONTACTS = "contacts";
    public static final String E_GET_LIST_PRODUCT = "listProduct";
    public static final String E_GET_LIST_PRODUCT_ONSIGNA = "getListProductsOnsigna";
    public static final String E_GET_RUBROS = "getRubros";
    public static final String E_GET_EMPRESAS = "getEmpresas";
    public static final String E_GET_ACTIVIDADES_ECONOMICAS = "getActividadesEconomicasArg";
    public static final String E_REGISTER_CONTACT = "registerContact";
    public static final String E_UPDATE_PASSWORD = "updatePassword";
    public static final String E_GET_INFO_QR= "getInfoQr";
    public static final String E_FORGOT_PASSWORD = "forgotPassword";
    public static final String E_BALANCE = "balanceWhitOut";
    public static final String E_SEND_FORGOT_PASSWORD = "sendVoucherForgonPassword";
    public static final String E_AUTHENTICATE = "authenticate";
    public static final String E_AUTORIZAR = "autorizar";
    public static final String E_CHANGE_NIP = "changeNip";
    public static final String E_ASSIGN_NIP = "assignNip";
    public static final String E_CHANGE_STATUS_BY_CARD = "changeStatusByCard";
    public static final String E_CONFIRM_TRANSACTIONS = "confirmTransaction";
    public static final String E_SUCURSALES = "sucursales";
    public static final String E_REGISTER_CONTEXT = "registerContext";
    public static final String E_RESET_PIN_ERROR = "resetPinError";
    public static final String E_T_Y_C = "t_y_c";
    public static final String E_UPDATE_CONFIG = "updateConfig";
    public static final String E_LIST_SERVICES_PAYMENT = "listServicesPayment";
    public static final String E_EXECUTE_PAY_SERVICES = "executePayServices";
    public static final String E_SERVICE_INFO = "serviceInfo";
    public static final String E_RECHARGE_TAE = "rechargeTAE";
    public static final String E_GENERATE_CVV = "generateCvv";
    public static final String PAY_SERVICE_TOP_UP = "payServiceTopUp";
    public static final String E_GET_LOCATION = "locations";
    public static final String E_GET_INSTITUTION = "institutions";
    public static final String APPLY_FOR_CARD = "applyForCard";
    public static final String APPLY_FOR_PHYSICAL_CARD = "applyForCardPhysical";
    public static final String CARD_REPLACEMENT = "cardReplacement";
    public static final String VALIDATE_CARD = "validateCard";
    public static final String E_GET_PROVINCES = "provinces";
    public static final String E_SEND_TOKEN = "sendToken";
    public static final String E_GET_CARDS = "getCards";
    public static final String E_GET_CARDS_CUSTOM = "getCardsCustom";
    public static final String E_STATUS_CONFIG = "statusConfig";
    public static final String E_UPDATE_DATA_USER = "updateDataUser";
    public static final String E_GET_PIN_CARD = "getPinCard";
    public static final String E_UPDATE_CONFIG_COMISION = "updateConfigComision";
    public static final String E_REGISTER_PHOTOS_WEB = "registerPhotosWeb";
    public static final String E_APPLY_FOR_GIFT_CARD = "applyForGiftCard";
    public static final String E_GET_STATUS_CODE_GIFT_CARD = "getStatusCodeGiftCard";
    public static final String E_GET_CUOT_MV = "getCuotMV";
    public static final String E_GET_CONS_CT = "getConsCT";

    public static final int INSERT_EVENT = 1; //Registrar evento
    public static final int INSERT_DETAIL_EVENT = 2; //Registra detalle del evento
    public static final int UPDATE_EVENT = 3; //Actualiza evento
    public static final int UPDATE_DETAIL_EVENT = 4; //ctualiza detalle del evento

    private int type_operation;
    private int idEventLog;
    private int idEventDetailLog;
    private String event;
    private String emailUser;
    private String codeResp;
    private String messageResp;
    private String request;
    private String response;
    private String endPoint;
    private String field1;
    private String field2;
    private String field3;

    //buildEventLogRequest para REGISTRAR Evento
    public static EventLogRequest buildRegisterEvent(String event, String emailUser, String request) {
        EventLogRequest eventLogRequest = new EventLogRequest();
        eventLogRequest.setType_operation(INSERT_EVENT);
        eventLogRequest.setEvent(event);
        eventLogRequest.setEmailUser(emailUser);
        eventLogRequest.setRequest(request);

        return eventLogRequest;
    }

    //buildEventLogRequest para REGISTRAR DETALLE del Evento
    public static EventLogRequest buildRegisterDetailEvent(int idEventLog, String event, String request, String endPoint) {
        EventLogRequest eventLogRequest = new EventLogRequest();
        eventLogRequest.setIdEventLog(idEventLog);
        eventLogRequest.setType_operation(INSERT_DETAIL_EVENT);
        eventLogRequest.setEvent(event);
        eventLogRequest.setRequest(request);
        eventLogRequest.setEndPoint(endPoint);
        return eventLogRequest;
    }
    //buildEventLogRequest para ACTUALIZAR  del Evento

    public static EventLogRequest buildUpdateRegisterEvent(int idEventLog, String response, String codeResp, String messageResp) {
        EventLogRequest eventLogRequest = new EventLogRequest();
        eventLogRequest.setIdEventLog(idEventLog);
        eventLogRequest.setType_operation(UPDATE_EVENT);
        eventLogRequest.setResponse(response);
        eventLogRequest.setCodeResp(codeResp);
        eventLogRequest.setMessageResp(messageResp);
        return eventLogRequest;
    }

    //buildEventLogRequest para ACTUALIZAR DETALLE  del Evento
    public static EventLogRequest buildUpdateDetailRegister(int idEventLog, int idEventDetailLog, String response, String codeResp, String messageResp) {
        EventLogRequest eventLogRequest = new EventLogRequest();
        eventLogRequest.setIdEventLog(idEventLog);
        eventLogRequest.setIdEventDetailLog(idEventDetailLog);
        eventLogRequest.setType_operation(UPDATE_DETAIL_EVENT);
        eventLogRequest.setResponse(response);
        eventLogRequest.setCodeResp(codeResp);
        eventLogRequest.setMessageResp(messageResp);
        return eventLogRequest;
    }

    public int getType_operation() {
        return type_operation;
    }

    public int getIdEventLog() {
        return idEventLog;
    }

    public int getIdEventDetailLog() {
        return idEventDetailLog;
    }

    public String getEvent() {
        return event;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getCodeResp() {
        return codeResp;
    }

    public String getMessageResp() {
        return messageResp;
    }

    public String getRequest() {
        return request;
    }

    public String getResponse() {
        return response;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public void setType_operation(int type_operation) {
        this.type_operation = type_operation;
    }

    public void setIdEventLog(int idEventLog) {
        this.idEventLog = idEventLog;
    }

    public void setIdEventDetailLog(int idEventDetailLog) {
        this.idEventDetailLog = idEventDetailLog;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setCodeResp(String codeResp) {
        this.codeResp = codeResp;
    }

    public void setMessageResp(String messageResp) {
        this.messageResp = messageResp;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

}
