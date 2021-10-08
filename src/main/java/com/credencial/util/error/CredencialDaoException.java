
package com.credencial.util.error;

public class CredencialDaoException extends CredencialException {
    
    public CredencialDaoException(String message){
        super("CredencialDaoException",message);
    }
    
    public CredencialDaoException(String message, String code){
        super("CredencialDaoException",message,code);
    }
}
