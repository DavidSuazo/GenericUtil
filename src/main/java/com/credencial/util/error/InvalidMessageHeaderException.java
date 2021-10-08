
package com.credencial.util.error;

public class InvalidMessageHeaderException extends CredencialException {
    
    public InvalidMessageHeaderException(String message){
        super("InvalidMessageHeaderException",message);
    }
     public InvalidMessageHeaderException(String message, String code){
        super("InvalidMessageHeaderException",message,code);
        this.code = code;
    }
}
