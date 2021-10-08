package com.credencial.util.error;

/**
 *
 * @author cj_sr
 */
public class RulesRestException extends CredencialException {
    
    public RulesRestException(String message) {
        super("RulesRestException", message);
    }

    public RulesRestException(String code, String message ) {
        super( code, "RulesRestException" , message);
        this.code = code;
    }
    public RulesRestException(String code,  String name ,String message ) {
        super( code,name , message);
        this.code = code;
    }
}
