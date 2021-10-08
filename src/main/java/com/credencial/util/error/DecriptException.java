
package com.credencial.util.error;

public class DecriptException extends CredencialException {
    
    public DecriptException(String message){
        super("DecriptException",message);
    }
     public DecriptException(String message, String code){
        super("DecriptException",message,code);
        this.code = code;
    }
}
