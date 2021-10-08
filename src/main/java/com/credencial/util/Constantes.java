package com.credencial.util;

/**
 *
 * @author David
 */
public class Constantes {

    public static final String TT_CONSULTA_SALDO_SIN_MOV = "129";
    public static final String TT_CONSULTA_SALDO_CON_MOV = "129";
    public static final String TT_ASSIGN_PIN = "513";
    public static final String TT_TRANS_CARD_TO_CARD = "65";
    public static final String TT_TRANS_REVERSO_CARD_TO_CARD = "63";
    public static final String TT_TRANS_DISCHARGE = "33";
    public static final String TT_TRANS_CHARGE = "35";
    public static final String TT_COMPRA = "1";
    public static final String CHANNEL_PAY_SERVICE = "OnsignaWS";
    public static final String MODE_ENTRY = "1";
    public static final String TT_COMPRA_REVERSE = "3";
    public static final String TT_CAMBIO_NIP = "257";
    public static final String SUB_TIPO_MOV_0 = "0";
    public static final String SUB_TIPO_MOV_1 = "1";//con movimeintos
    public static final String SUB_TIPO_MOV_2 = "2";//sin movimeints
    public static final String CURRENCY_CODE_PESOS = "484";
    public static final String B_INFO_USER_V = "V";//SOLO VALIDAR USUARIO Y TRAER DATOS DEL CONTEXTO
    public static final String B_INFO_USER_F = "F";//LOGIN Y ACTUALIZA PUSH MESSAGE
    public static final String URL_WSDL_CREDENCIAL = "URL_WSDL_CREDENCIAL";
    public static final String SUPER_TARJETA = "SUPER_TARJETA";

    public static final String URL_WEB_SERVICES_TELECASETAS = "URL_WEB_SERVICES_TELECASETAS";
    public static final String URL_ALTA_WEB = "URL_ALTA_WEB";
    public static final String EMPTY_STRING = "";
    public static final String APPROVED_01 = "01";
    public static final String STR_NAN = "NaN";
    public static final String AMOUNT_SYMBOL = "$";
    public static final String PERCENTAGE_SYMBOL = "%";
    public static final String BEARER = "Bearer ";
    public static final String TYPE_OPERATION_VALIDATION_APLICATION = "VA";
    public static final String TYPE_OPERATION_VALIDATION_TOKEN = "VT";
    public static final String APPLICATION_JSON = "application/json";
    public static final String SCAPED_PIPE = "\\|";
    public static final String SIMPLE_PIPE = "|";
    public static final String EQUALS = "=";
    public static final String WHITES_SPACE = "\\s+";
    public static final String WHITE_SPACE = " ";
    public static final String SCRIPT = "_";
    public static final String EXTENSION_JPG = ".jpg";
    public static final String TWO_POINTS = ":";
    public static final String UTF8 = "UTF-8";
    public static final String SP = "|SP";


    /*
    Constantes WebServices BuyTime
     */
    public static final String WS_ABONAR = "abonar.do";
    public static final String WS_CONFIRMA_TRANSACCION = "confirmaTransaccion.do";
    public static final String WS_GET_LISTA_PRODUCTO = "getListaProducto.d";
    public static final String WS_IDENTIFY_ME = "identifyMe.do";
    public static final String WS_GET_SALDO = "getSaldo.do";
    public static final String WS_GET_UNREAD_MESSAGES = "getUnreadMessages.do";
    public static final String WS_NOTIFICAR_DEPOSITO = "notificarDeposito.do";
    public static final String WS_SEND_TICKET = "sendComment.do";
    public static final String COD_DISPOSITIVO_BUY_TIME = "COD_DISPOSITIVO_BUY_TIME";
    public static final String ID_DISTRIBUIDOR_BUY_TIME = "ID_DISTRIBUIDOR_BUY_TIME";
    public static final String PASSWORD_BUY_TIME = "PASSWORD_BUY_TIME";
    public static final String REQUEST_METHOD = "REQUEST_METHOD";

    //MAP PARA PASO DE PARAMETROS AL CONECTOR
    public static final String P_MAIL = "P_MAIL";
    public static final String P_UPDATE_MAIL = "P_UPDATE_MAIL";
    public static final String P_STATUS_CONFIG = "P_STATUS_CONFIG";
    public static final String P_MAIL_CONTACT = "P_MAIL_CONTACT";
    public static final String P_ORIGINATOR = "P_ORIGINATOR";
    public static final String P_PASSWORD = "P_PASSWORD";
    public static final String P_NEW_PASSWORD = "P_NEW_PASSWORD";
    public static final String P_USER = "P_USER";
    public static final String P_ID_USER = "P_ID_USER";
    public static final String P_ID_CONTACT = "P_ID_CONTACT";
    public static final String P_OPERATION = "P_OPERATION";
    public static final String P_DNI = "P_DNI";
    public static final String P_CURP = "P_CURP";
    public static final String P_CARD_NUMBER = "P_CARD_NUMBER";
    public static final String P_LAST_CARD_NUMBER = "P_LAST_CARD_NUMBER";
    public static final String P_GET_CARD_REPLACED_FLAG = "P_GET_CARD_REPLACED_FLAG";
    public static final String P_SYNONYMUS = "P_SYNONYMUS";
    public static final String P_NEW_PIN = "P_NEW_PIN";
    public static final String P_PIN = "P_PIN";
    public static final String P_TYPE_CVV = "P_TYPE_CVV";// D = dinamic ||  B=MAGNETIC STRIPE
    public static final String P_CVV = "P_CVV";
    public static final String P_EXPIRATION_MONTH = "P_EXPIRATION_MONTH";
    public static final String P_EXPIRATION_YEAR = "P_EXPIRATION_YEAR";
    public static final String P_TELEPHONE = "P_TELEPHONE";
    public static final String P_TERMINAL = "P_TERMINAL";
    public static final String P_PUSH_TOKEN = "P_PUSH_TOKEN";
    public static final String P_LATITUDE = "P_LATITUDE";
    public static final String P_LONGITUDE = "P_LONGITUDE";
    public static final String P_TYPE_REGISTER_USER = "P_TYPE_REGISTER_USER";//(1-  Ya tengo tarjeta comun , 2.- Ya tengo tarjeta pero hay que modificar el alias)
    public static final String P_DATE_TRANSACTION = "P_DATE_TRANSACTION";
    public static final String P_HOUR_TRANSACTION = "P_HOUR_TRANSACTION";
    public static final String P_TRANSACTION_SECUENCE = "P_TRANSACTION_SECUENCE";
    public static final String P_NEW_STATE = "P_NEW_STATE";
    public static final String P_DESTINATION_CARD = "P_DESTINATION_CARD";
    public static final String P_CONCEPT = "P_CONCEPT";
    public static final String P_COMMERCE = "P_COMMERCE";
    public static final String P_AMOUNT = "P_AMOUNT";
    public static final String P_MAIL_DESTINY = "P_MAIL_DESTINY";
    public static final String P_REFERENCE = "P_REFERENCE";
    public static final String P_REFERENCE_NUMBER = "P_REFERENCE_NUMBER";
    public static final String P_ACTIVATION_TOKEN = "P_ACTIVATION_TOKEN";
    public static final String P_TYPE_TRANSFER = "P_TYPE_TRANSFER";
    public static final String P_INSTITUTION_NAME = "P_INSTITUTION_NAME";
    public static final String P_INSTITUTION_ID = "P_INSTITUTION_ID";
    public static final String P_ORDENING_NAME = "P_ORDENING_NAME";
    public static final String P_ORDENING_RFC_CURP = "P_ORDENING_RFC_CURP";
    public static final String P_BENEFICIARY_NAME = "P_BENEFICIARY_NAME";
    public static final String P_BENEFICIARY_RFC_CURP = "P_BENEFICIARY_RFC_CURP";
    public static final String P_COUNTERPART_INTITUTION = "P_COUNTERPART_INTITUTION";
    public static final String P_COMISSION_PERCENTAGE = "P_COMISSION_PERCENTAGE";
    public static final String P_MULTI_COMISSION = "P_MULTI_COMISSION";
    public static final String P_DOLLAR_VALUE = "P_DOLLAR_VALUE";
    public static final String P_BILL_ID = "P_BILL_ID";

    /*REGISTRO ONBOARDING*/
    public static final String P_ID_ONBOARD = "P_ID_ONBOARD";
    public static final String P_TELEPHONE_FIX = "P_TELEPHONE_FIX";
    public static final String P_GENERO = "P_GENERO";
    public static final String P_CATEGO = "P_CATEGO";
    public static final String P_DOCUMENT_NUMBER = "P_DOCUMENT_NUMBER";
    public static final String P_BIRTH_DATE = "P_BIRTH_DATE";
    public static final String P_EXP_DATE_DOCUMENT = "P_EXP_DATE_DOCUMENT";
    public static final String P_ADDRES = "P_ADDRES";
    public static final String P_COUNTRY = "P_COUNTRY";
    public static final String P_OFLDENT = "P_OFLDENT";
    public static final String P_ISSUE_DATE = "P_ISSUE_DATE";
    public static final String P_TRAMIT_NUMBER = "P_TRAMIT_NUMBER";
    public static final String P_NATIONALITY = "P_NATIONALITY";
    public static final String P_PEP = "P_PEP";
    public static final String P_UIF = "P_UIF";
    public static final String P_UIF_DESCRIPTION = "P_UIF_DESCRIPTION";
    public static final String P_HOME_PHONE = "P_HOME_PHONE";
    public static final String P_PREFIJO_NACIONAL = "P_PREFIJO_NACIONAL";
    public static final String P_PREFIJO_INTERNACIONAL = "P_PREFIJO_INTERNACIONAL";
    public static final String P_PREFIJO = "P_PREFIJO";
    public static final String P_PHONE_MOVIL = "P_PHONE_MOVIL";
    public static final String P_OCUPATION = "P_OCUPATION";
    public static final String P_INCOME_AMOUNT = "P_INCOME_AMOUNT";
    public static final String P_TYPE_DOCUMENT = "P_TYPE_DOCUMENT";
    public static final String P_TYPE_PERSON = "P_TYPE_PERSON";
    public static final String P_CHECK_NOSIS = "P_CHECK_NOSIS";
    public static final String P_RUBRO = "P_RUBRO";
    public static final String P_IS_PHISYCAL_CARD = "P_IS_PHISYCAL_CARD";
    public static final String P_CBU = "P_CBU";
    public static final String P_JURIDICO_CUIT = "P_JURIDICO_CUIT";
    public static final String P_JURIDICO_RAZON_SOCIAL = "P_JURIDICO_RAZON_SOCIAL";
    public static final String P_NATURALEZA_JURIDICA = "P_NATURALEZA_JURIDICA";
    public static final String P_ACTIVIDAD_PRINCIPAL = "P_ACTIVIDAD_PRINCIPAL";
    public static final String P_FECHA_INSCRIPCION_REGISTRAL = "P_FECHA_INSCRIPCION_REGISTRAL";
    public static final String P_NUMERO_INSCRIPCION_REGISTRAL = "P_NUMERO_INSCRIPCION_REGISTRAL";
    public static final String P_IVA_CONDITION = "P_IVA_CONDITION";
    public static final String P_SUJETO_OBLIGADO = "P_SUJETO_OBLIGADO";
    public static final String P_PERSONA_SUPERVISADA = "P_PERSONA_SUPERVISADA";
    public static final String P_JURIDICO_EMAIL = "P_JURIDICO_EMAIL";
    public static final String P_JURIDICO_CALLE = "P_JURIDICO_CALLE";
    public static final String P_JURIDICO_NUMERO = "P_JURIDICO_NUMERO";
    public static final String P_JURIDICO_LOCALIDAD = "P_JURIDICO_LOCALIDAD";
    public static final String P_JURIDICO_CODIGO_POSTAL = "P_JURIDICO_CODIGO_POSTAL";
    public static final String P_JURIDICO_PROVINCIA = "P_JURIDICO_PROVINCIA";
    public static final String P_TELEFONO_SEDE_SOCIAL = "P_TELEFONO_SEDE_SOCIAL";
    public static final String P_REPRESENTANTE_LEGAL = "P_REPRESENTANTE_LEGAL";
    public static final String P_APODERADO = "P_APODERADO";

    public static final String P_CIVIL_STATUS = "P_CIVIL_STATUS";
    public static final String P_SECTOR = "P_SECTOR";
    public static final String P_COUNT = "P_COUNT";
    public static final String P_CHANNEL = "P_CHANNEL";
    public static final String P_CODE_ADD = "P_CODE_ADD";
    public static final String P_STREAT = "P_STREAT";
    public static final String P_REAL_STREAT = "P_REAL_STREAT";
    public static final String P_NUMBER_ADD = "P_NUMBER_ADD";
    public static final String P_DPTO = "P_DPTO";
    public static final String P_NUMBER_DPTO = "P_NUMBER_DPTO";
    public static final String P_FLOOR = "P_FLOOR";
    public static final String P_LOCATION = "P_LOCATION";
    public static final String P_ID_LOCATION = "P_ID_LOCATION";
    public static final String P_PROVICE = "P_PROVICE";
    public static final String P_ID_PROVICE = "P_ID_PROVICE";
    public static final String P_POSTAL_CODE = "P_POSTAL_CODE";
    public static final String P_PHONE_NUMBER = "P_PHONE_NUMBER";
    public static final String P_PENC = "P_PENC";
    public static final String P_TYC = "P_TYC";

    public static final String P_BACK_IMAGE_64 = "P_BACK_IMAGE_64";
    public static final String P_FRONT_IMAGE_64 = "P_FRONT_IMAGE_64";
    public static final String P_SELFIE_FRONT_IMAGE_64 = "P_SELFIE_FRONT_IMAGE_64";
    public static final String P_SELFIE_IMAGE_64 = "P_SELFIE_IMAGE_64";
    public static final String P_SELFIE_LIFE_IMAGE_64 = "P_SELFIE_LIFE_IMAGE_64";
    public static final String P_FILE_STATUTO_64 = "P_FILE_STATUTO_64";

    public static final String P_NAME_SELFIE_LIFE = "P_NAME_SELFIE_LIFE";

    public static final String P_IMAGE_64_FRONT = "P_IMAGE_64_FRONT";
    public static final String P_IMAGE_64_BACK = "P_IMAGE_64_BACK";
    public static final String P_IMAGE_64_SELFIE_FRONT = "P_IMAGE_64_SELFIE_FRONT";
    public static final String P_IMAGE_64_SELFIE = "P_IMAGE_64_SELFIE";
    public static final String P_IMAGE_64_DOC_ADDRES = "P_IMAGE_64_DOC_ADDRES";
    public static final String P_CUIT = "P_CUIT";
    public static final String P_KEY_UNBOARD = "P_KEY_UNBOARD";

    public static final String P_ID_SUCURSAL = "P_ID_SUCURSAL";
    public static final String P_SCORE = "P_SCORE";
    public static final String P_SOCRE_CODE = "P_SOCRE_CODE";
    public static final String P_SCORE_MESSAGE = "P_SCORE_MESSAGE";
    public static final String P_VU_J_RESPONSE = "P_VU_J_RESPONSE";
    public static final String P_IMEI = "P_IMEI";
    public static final String P_LOCATION_BIRTH = "P_LOCATION_BIRTH";

    /*cAMBIO DE MARCAS DE LA TARJETA*/
    public static final String P_IS_CHANGE = "P_IS_CHANGE";
    public static final String P_V_CHANGE = "V";
    public static final String P_F_CHANGE = "F";
    public static final String P_EXTERIOR = "P_EXTERIOR";
    public static final String P_ATM = "P_ATM";
    public static final String P_POS = "P_POS";
    public static final String P_ECOMERCE = "P_ECOMERCE";
    public static final String P_TELEFONICA = "P_TELEFONICA";
    public static final String P_NOT_PERMITED = "N";
    public static final String P_YES = "S";
    public static final String P_DISABLE = "0";
    public static final String P_ENABLE = "1";

    public static final String P_TYPE_SERVICE = "P_TYPE_SERVICE";
    public static final String P_CODE_SERVICE = "P_CODE_SERVICE";
    public static final String P_NAME = "P_NAME";
    public static final String P_FIRST_NAME = "P_FIRST_NAME";
    public static final String P_LAST_NAME = "P_LAST_NAME";
    public static final String P_FULL_NAME = "P_FULL_NAME";
    public static final String P_ADDRESS = "P_ADDRESS";
    public static final String P_CITY = "P_CITY";
    public static final String P_ZIP_CODE = "P_ZIP_CODE";
    public static final String P_PRIMARY_ACCOUNT_NUMBER = "P_PRIMARY_ACCOUNT_NUMBER";
    public static final String P_COUNTRY_CODE = "P_COUNTRY_CODE";
    public static final String P_CURRENCY_CODE = "P_CURRENCY_CODE";
    public static final String PIN_DRIVER = "PIN_DRIVER";
    public static final String QR_ID = "QR_ID";
    public static final String PAY_ID = "PAY_ID";
    public static final String P_BANK = "P_BANK";
    public static final String P_SUCURSAL = "P_SUCURSAL";
    public static final String P_ACCOUNT = "P_ACCOUNT";
    public static final String P_PRODUCT_CODE = "P_PRODUCT_CODE";
    public static final String P_AFFINITY = "P_AFFINITY";
    public static final String P_FOURT_LINE = "P_FOURT_LINE";
    public static final String FIELD_1 = "FIELD_1";
    public static final String FIELD_2 = "FIELD_2";
    public static final String FIELD_3 = "FIELD_3";
    public static final String FIELD_4 = "FIELD_4";

    public static final String DA_CODE_SEND = "DA_CODE_SEND";
    public static final String DA_HOUR = "DA_HOUR";
    public static final String DA_STREET = "DA_STREET";
    public static final String DA_NUMBER_STREET = "DA_NUMBER_STREET";
    public static final String DA_DEPARTMENT = "DA_DEPARTMENT";
    public static final String DA_CODE_PRODUCT = "DA_CODE_PRODUCT";
    public static final String DA_PROVINCE = "DA_PROVINCE";
    public static final String DA_CODE_PROVINCE = "DA_CODE_PROVINCE";
    public static final String DA_CITY = "DA_CITY";
    public static final String DA_CODE_POSTAL = "DA_CODE_POSTAL";
    public static final String AUTH_NUM = "AUTH_NUM";
    public static final String PATH = "PATH";
    public static final String TYPE_SUPPORT = "TYPE_SUPPORT";
    public static final String LIKE = "LIKE";
    public static final String PARAMETERS = "PARAMETERS";
    public static final String CARD_CLABE = "CARD_CLABE";

    public static final String SKU = "SKU";
    public static final String IS_TELCEL = "IS_TELCEL";
    public static final String P_CAJERO = "P_CAJERO";
    public static final String P_CAJA = "P_CAJA";
    public static final String P_COMISION = "P_COMISION";
    public static final String P_REFERENCE_CLIENTE = "P_REFERENCE_CLIENTE";
    public static final String P_REFERENCE_1 = "P_REFERENCE_1";
    public static final String P_REFERENCE_2 = "P_REFERENCE_2";
    public static final String P_REFERENCE_3 = "P_REFERENCE_3";

    /*REGISTRO DE CONTACTOS*/
    public static final String P_NAME_ALIAS = "P_NAME_ALIAS";
    public static final String P_TYPE_REGISTER = "P_TYPE_REGISTER";
    public static final String P_TYPE_ACCOUNT = "P_TYPE_ACCOUNT";

    //credenciales para encriptar hacia el GMB
    public static final String P_APLICATION_BUNDLE = "P_APLICATION_BUNDLE";
    public static final String P_PUBLIC_KEY = "P_PUBLIC_KEY";
    public static final String P_TOKEN_SESSION = "P_TOKEN_SESSION";
    public static final String P_TRANSACTION_SECUENCE_2 = "P_TRANSACTION_SECUENCE_2";
    public static final String P_BENEFI_ID_USER = "P_BENEFI_ID_USER";

    /*
    Constantes WSDL CASA SRT
     */
    public static final String PUBLIC_KEY_CASA_SRT = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDcZKSFJW2gP/kskiaEuXz9nFDSHGKoDhLL+pIf0a1aGpfHeEhLf51cCyAGoX7rSDtlnmV1bwL5EUMsMj4KAmHhOSwygJAyQzthaYHTkEnOJ1NlDP7KyDdu9iyIEY87iWa4OlxJqElWYiHlUcrRZwWPWyTfk9v0lYyuu0lsF/n4tQIDAQAB";
    public static final String PUBLIC_KEY_PIN = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDTXQVjsjNBdN+1b/9sNPOu8TlV\n"
            + "MKw8JBtoMazifoJ53emJW4dYpg0fVVRF6v0GojSR5XJUJivKcBnLVLp3tvDopBxb\n"
            + "G832pR7148wqrUpZtzqOpvkYPgvbUklvUPrF/Y0iEInCEQByYgf468PGg+VQWtBQ\n"
            + "oULvr+W+sqH+7kjU5QIDAQAB";
    public static final String PRIVATE_KEY = "MIICXAIBAAKBgQCc0qiZfsdyj2yJEzVdr1txjpEdjJ6q6yCOebj+xvybYjBbgQjUhiHad7YVFkERsRGAUjn/N+A1sbYIu6EGU/Mjm/8CwoTJ3w8u1KBd5nfU7/gd/Wg3O67bSLut8SBneSvm95cgYjI6H8AsLQ3g688EiRdVTp7PqCZ6CpqURkJCVwIDAQABAoGAcR5/ISFS6q7MAmBJqUc5NcM5p8/sD6vE8yCYMacFRWvhJ8/+t5X9S2H4hGNmEkXgMuidDxyV7QVAIjJ9Z1wcz9ytmR6NZFe7jcyVObV0hbMm1hadGTWIup8pAULq6B/Gg9ygsm7D9fzuNjB7gLjWeY9y3vp68tD5pmxl2uCeugECQQDNIk00qZO9oxMn5vky3u+qM5ytgsgSE85nFqFvO4f/P09v3sV9W0Nbek/+r9319EZp6EgnREDTFOOU2BkvedlXAkEAw7Wd6lC1fPgq/RO7D9oZ3N/tW1Z91ExFt1Yqoihlkq4CNjt3Qcwqw/fy4Ob7IiJ+ctDw6SdEfD5ZUKLMrJQ/AQJAQ/gQotlpZZVqHHeQrIVn3fpZ+LfzuOGtK0U5WlTcW/vLQ2MKBt49dEsTxGzbW8qDpkXb2n7oB8jNG516wttZ4wJAV3O/heXcw2QNqZr4euPlrKovYSIsBgKzIHKTiHRutvWkrWEzMCawcXNJh7APRjiNsnalQDo4wyAFPyAQP4nbAQJBAKekRQyTUs//A/s13G5wvAbhvMZ07tza4G2ymq7XfUzsCwNC3J0xp0j/oGjBgQPa8Y6CYOHRto0lAMEyDUHfnaM=";
    public static final String USUARIO_SRT = "USUARIO_SRT";
    public static final String PASSWORD_SRT = "PASSWORD_SRT";
    public static final String USUARIO_SRT_MARCAS = "USUARIO_SRT_MARCAS";
    public static final String PASSWORD_SRT_MARCAS = "PASSWORD_SRT_MARCAS";

    public static final String URL_AVANTA_V1 = "URL_AVANTA_V1";
    public static final String CRED_AVANTA_V1 = "CRED_AVANTA_V1";
    public static final String URL_AVANTA_V2 = "URL_AVANTA_V2";
    public static final String CRED_AVANTA_V2 = "CRED_AVANTA_V2";
    public static final String URL_WS_AVANTA = "URL_WS_AVANTA";
    public static final String URL_SPENDMEX = "URL_SPENDMEX";
    public static final String USER_PSW_SPENDMEX = "USER_PSW_SPENDMEX";
    public static final String USER_PSW_SPENDMEX_GIFTCARD = "USER_PSW_SPENDMEX_GIFTCARD";
    public static final String ACCESS_KEY_SPENDMEX_GIFTCARD = "ACCESS_KEY_SPENDMEX_GIFTCARD";
    public static final String SECRET_KEY_SPENDMEX_GIFTCARD = "SECRET_KEY_SPENDMEX_GIFTCARD";
    public static final String PRODUCT_CODE_SPENDMEX_GIFTCARD = "PRODUCT_CODE_SPENDMEX_GIFTCARD";
    public static final String WS_TRANSFER = "WS_TRANSFER";

    public static final String URL_STP = "URL_STP";
    public static final String NAME_CERT_STP = "NAME_CERT_STP";
    public static final String PASSW_CERT_STP = "PASSW_CERT_STP";

    public static final String DG_NAME = "Nombre";
    public static final String DG_LAST_NAME1 = "Apellido Paterno";
    public static final String DG_LAST_NAME2 = "Apellido Materno";
    public static final String DG_LAST_NAME_ALL = "Apellidos";
    public static final String DG_CURP = "CURP";
    public static final String DG_RFC = "RFC";
    public static final String DG_BIRTH_DATE = "Fecha de Nacimiento";
    public static final String DG_GENDER = "Género";
    public static final String DG_SEX = "Sexo";
    public static final String DG_DNI = "Número INE/IFE";
    public static final String DG_BUSSINES_NAME = "Razón Social";
    public static final String DG_TELEPHONE = "Teléfono";
    public static final String DG_STATE = "Estado";
    public static final String DG_MUNC = "Municipio";
    public static final String DG_LOCALITY_2 = "Selecciona Colonia";
    public static final String DG_LOCALITY_1 = "Colonia";
    public static final String DG_CP = "Código Postal";
    public static final String DG_STREET = "Calle";
    public static final String DG_STREET_NUMBER = "Número Calle";
    public static final String DG_FLOOR = "Piso";
    public static final String DG_DEPARTMENT = "Departamento";
    public static final String DG_SCORE = "Nivel de Comparación";
    public static final String DG_EXP1 = "expediente1";
    public static final String DG_EXP2 = "expediente2";
    public static final String DG_EXP3 = "expediente3";
    public static final String ZERO = "0";
    public static final String IS_SAVING_CARD = "IS_SAVING_CARD";
    public static final String P_TYPE_OPERATION = "P_TYPE_OPERATION";
    public static final String P_ID_RUBRO = "P_ID_RUBRO";

    public static final String BUNDLE_AFFINITAS_MX = "AFFINITAS";
    public static final String BUNDLE_ONSIGNA_MX = "ONSIGNA";
    public static final String BUNDLE_BIVO_MX = "Bivo";

    public static final String FULLCARGA_ERROR_CODE_DEFAULT = "MSG%s";
    public static final String FULLCARGA_ERROR_CODE_MSG0207 = "MSG0207";
    public static final String FULLCARGA_ERROR_CODE_MSG0203 = "MSG0203";
    public static final String FULLCARGA_ERROR_CODE_MSG0204 = "MSG0204";
    public static final String FULLCARGA_ERROR_CODE_MSG0205 = "MSG0205";
    public static final String FULLCARGA_ERROR_CODE_MSG0206 = "MSG0206";

    public static final String FULLCARGA_ERROR_DESCRIPTION_MSGDEFAULT = "Operación no habilitada en este momento-reintente luego";
    public static final String FULLCARGA_ERROR_DESCRIPTION_MSG0207 = "Importe fuera del rango permitido";
    public static final String FULLCARGA_ERROR_DESCRIPTION_MSG0203 = "La referencia no existe";
    public static final String FULLCARGA_ERROR_DESCRIPTION_MSG0204 = "El teléfono es incorrecto";
    public static final String FULLCARGA_ERROR_DESCRIPTION_MSG0205 = "Los datos del cliente no son correctos";
    public static final String FULLCARGA_ERROR_DESCRIPTION_MSG0206 = "$empresa$ no puede operar en este momento";

    public final static String LETTER_A_ACCENTUATED = "Á";
    public final static String LETTER_A = "&Aacute;";
    public final static String LETTER_E_ACCENTUATED = "É";
    public final static String LETTER_E = "&Eacute;";
    public final static String LETTER_I_ACCENTUATED = "Í";
    public final static String LETTER_I = "&Iacute;";
    public final static String LETTER_O_ACCENTUATED = "Ó";
    public final static String LETTER_O = "&Oacute;";
    public final static String LETTER_U_ACCENTUATED = "Ú";
    public final static String LETTER_U = "&Uacute;";

    public final static String LETTER_N_ = "Ñ";
    public final static String LETTER_N = "&Ntilde;";

    public final static String LETTER_U_DIERESIS_CAPITAL = "Ü";
    public final static String LETTER_U_DIERESIS_LOWER = "&Uuml;";

    public final static String POINT = ".";
    public final static String SPECIAL_CHARACTERS_REG_EXPRESSION = "[^a-zA-Z0-9]";
    public final static String SPACE = " ";

    //Pago TIC
    public final static String IS_COMMERCE = "IS_COMMERCE";
    public final static String IS_JURIDICO = "IS_JURIDICO";
    public final static String COMMERCE_DNI = "COMMERCE_DNI";
    public final static String COMMERCE_NUMBER = "COMMERCE_NUMBER";
    public final static String RAZON_SOCIAL = "RAZON_SOCIAL";
    public final static String COMMERCE_RAZON_SOCIAL = "COMMERCE_RAZON_SOCIAL";
    public final static String COMMERCE_STREET = "COMMERCE_STREET";
    public final static String COMMERCE_FLOOR = "COMMERCE_FLOOR";
    public final static String COMMERCE_DEPARTMENT = "COMMERCE_DEPARTMENT";
    public final static String COMMERCE_DOOR = "COMMERCE_DOOR";
    public final static String COMMERCE_PLOD = "COMMERCE_PLOD";
    public final static String COMMERCE_POSTAL_CODE = "COMMERCE_POSTAL_CODE";
    public final static String COMMERCE_LOCATION = "COMMERCE_LOCATION";
    public final static String COMMERCE_PROVINCE = "COMMERCE_PROVINCE";
    public final static String CONDITION_TRIBUTARY = "CONDITION_TRIBUTARY";
    public final static String CONDITION_TRIBUTARY_COMMERCE = "CONDITION_TRIBUTARY_COMMERCE";
    public final static String CATEGORY_TAXPAYER = "CATEGORY_TAXPAYER";
    public final static String NUMBER_INCOME = "NUMBER_INCOME";
    public final static String ORIGIN_FOUNDS = "ORIGIN_FOUNDS";
    public final static String ORIGIN_FOUNDS_DESCRIPTION = "ORIGIN_FOUNDS_DESCRIPTION";
    public final static String ORIGIN_FOUNDS_LEGAL = "ORIGIN_FOUNDS_LEGAL";
    public final static String ORIGIN_FOUNDS_DESCRIPTION_LEGAL = "ORIGIN_FOUNDS_DESCRIPTION_LEGAL";
    public final static String UIF_LEGAL = "UIF_LEGAL";
    public final static String UIF_DESCRIPTION_LEGAL = "UIF_DESCRIPTION_LEGAL";
    public final static String FORM_ID = "FORM_ID";
    public final static String FORM_KEY = "FORM_KEY";
    public final static String SIMPLE_LETTER_A = "A";
    public final static String SIMPLE_LETTER_M = "M";
    public final static String SIMPLE_LETTER_P = "P";

    public final static String P_DEN_COM = "P_DEN_COM";
    public final static String P_CARD_TYPE = "P_CARD_TYPE";
    public final static String P_MOV_ID = "P_MOV_ID";
    public final static String P_NUMBER_PLAN = "P_NUMBER_PLAN";
    public final static String P_ID_PLAN = "P_ID_PLAN";
    public final static String MASK_ZEROS = "******";

    public static final String P_OS = "P_OS";
    public static final String P_SYSTEM_OPERATIVE_NAME = "P_SYSTEM_OPERATIVE";
    public static final String P_SYSTEM_OPERATIVE_VERSION = "P_SYSTEM_OPERATIVE_VERSION";
    public static final String P_MANUFACTURE = "P_MANUFACTURE";
    public static final String P_MODEL = "P_MODEL";

    public static final String P_NAME_APP = "P_NAME_APP";
    public static final String P_VERSION_APP = "P_VERSION_APP";
    public static final String P_ENVIROMENT = "P_ENVIROMENT";
    public static final String P_VERSION_CONNECTOR = "P_VERSION_CONNECTOR";

    public static final String VERSION_CONNECTOR = "3.0.1";

}
