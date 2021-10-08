package com.credencial.util;

import java.util.HashMap;

public class ErrorConsts {
    public static final String GENERIC_ERRORNAME = "MTT_ERROR";
    public static final String PARAM_INVALID_USER = "PARAM_INVALID_USER";
    public static final String PARAM_INVALID_OPERATOR = "PARAM_INVALID_OPERATOR";
    public static final String PARAM_USER_AND_OPERATOR_MISMATCH = "PARAM_USER_AND_OPERATOR_MISMATCH";
    public static final String SWITCH_ERROR_GENERIC = "SWITCH_ERROR_GENERIC";
    public static final String SWITCH_ERROR_RETAIN_CARD = "SWITCH_ERROR_RETAIN_CARD";
    public static final String NETWORK_ERROR = "NETWORK_ERROR";
    public static final String DBERROR = "DBERROR";
    public static final String DB_ACCESS_ERROR = "DB_ACCESS_ERROR";
    /*Errores GBM   */
     public static final String Err1300 = "Servicio Onsigna no disponible, intente mas tarde.";
     public static final String Err6000 = "Servicio Onsigna no disponible, intente mas tarde.";
     public static final String ErrDg6000 = "Servicio Digipro no disponible, intente mas tarde.";
     /*public static final String Err1300 = "1300 : Servicio Onsigna no disponible, intente mas tarde.";
     public static final String Err6000 = "6000 : Servicio Onsigna no disponible, intente mas tarde.";*/
     public static final String ErrConfigParameters = "Error en la inicializacion de parametros WS Onsigna, consulte al CAT!";
    
    
    private static final HashMap<String, String> errorMnemonicByErrorCode;
    
    static {
        errorMnemonicByErrorCode = new HashMap<>();
        
        errorMnemonicByErrorCode.put("1001", PARAM_INVALID_USER);
        errorMnemonicByErrorCode.put("1002", PARAM_INVALID_OPERATOR);
        errorMnemonicByErrorCode.put("1003", PARAM_USER_AND_OPERATOR_MISMATCH);
        errorMnemonicByErrorCode.put("1100", DBERROR);
        errorMnemonicByErrorCode.put("1101", DB_ACCESS_ERROR);
        errorMnemonicByErrorCode.put("1200", SWITCH_ERROR_GENERIC);
        errorMnemonicByErrorCode.put("1201", SWITCH_ERROR_RETAIN_CARD);
        errorMnemonicByErrorCode.put("1300", NETWORK_ERROR);
    }
    
    public static String getMnemonicByErrorCode(String errorCode){
        return errorMnemonicByErrorCode.containsKey(errorCode) ? 
                errorMnemonicByErrorCode.get(errorCode) :
                GENERIC_ERRORNAME;
    }
    
    
    public static final String PARSING_ERROR_MESSAGE = "Error durante el procesamiento de la respuesta de MTT";
}
