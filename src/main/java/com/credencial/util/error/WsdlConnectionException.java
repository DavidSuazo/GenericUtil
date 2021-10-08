
package com.credencial.util.error;

public class WsdlConnectionException extends CredencialException {
    
    public WsdlConnectionException(String message){
        super("WsdlConnectionException",message);
    }
     public WsdlConnectionException(String message, String code){
        super("WsdlConnectionException",message,code);
        this.code = code;
    }
}
