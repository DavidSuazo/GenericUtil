
package com.credencial.util.error;

public class JsonParseCredencialException extends CredencialException {
    
    public JsonParseCredencialException(String message){
        super("JsonParseException",message);
    }
      public JsonParseCredencialException(String message, String code){
        super("JsonParseCredencialException",message,code);
        this.code = code;
    }
}
