
package com.credencial.util.error;

public class CredenciaResponse_SP_Exception extends CredencialException {
    
    public CredenciaResponse_SP_Exception(String message){
        super("CredenciaResponse_SP_Exception",message);
    }
    public CredenciaResponse_SP_Exception(String message, String code){
        super("CredenciaResponse_SP_Exception",message,code);
        this.code = code;
    }
}
