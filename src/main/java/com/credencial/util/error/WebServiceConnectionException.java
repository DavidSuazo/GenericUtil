
package com.credencial.util.error;

public class WebServiceConnectionException extends CredencialException {
    
    public WebServiceConnectionException(String message){
        super("WebServiceConnectionException",message);
    }
     public WebServiceConnectionException(String message, String code){
        super("WebServiceConnectionException",message,code);
        this.code = code;
    }
}
