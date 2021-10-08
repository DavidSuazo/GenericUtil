
package com.credencial.util.error;

public class InvalidMessageFromRequesAutorizar extends CredencialException {
    
    public InvalidMessageFromRequesAutorizar(String message){
        super("InvalidMessageFromRequesAutorizar",message);
    }
    
     public InvalidMessageFromRequesAutorizar(String message, String code){
        super("InvalidMessageFromRequesAutorizar",message,code);
        this.code = code;
    }
}
