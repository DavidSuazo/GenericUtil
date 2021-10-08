package com.credencial.util.error;

/**
 *
 * @author cj_sr
 */
public class InvokerRestException extends CredencialException {
    
    public InvokerRestException(String message) {
        super("InvokerRestException", message);
    }

    public InvokerRestException(String code, String message ) {
        super( code, "InvokerRestException" , message);
        this.code = code;
    }
    public InvokerRestException(String code,  String name ,String message ) {
        super( code,name , message);
        this.code = code;
    }
}
