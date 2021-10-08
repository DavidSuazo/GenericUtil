
package com.credencial.util.error;

public class InvalidParametersException extends CredencialException {
    
    public InvalidParametersException(String message){
        super("InvalidaParametersException",message);
    }
     public InvalidParametersException(String message, String code){
        super("InvalidParametersException",message,code);
        this.code = code;
    }
}
