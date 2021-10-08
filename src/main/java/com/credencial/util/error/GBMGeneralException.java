
package com.credencial.util.error;

public class GBMGeneralException extends CredencialException {
    
    public GBMGeneralException(String message){
        super("GBMGeneralException",message);
    }
    public GBMGeneralException(String message, String code){
        super("GBMGeneralException",message,code);
        this.code = code;
    }
}
