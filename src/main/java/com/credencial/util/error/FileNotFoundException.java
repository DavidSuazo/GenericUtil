package com.credencial.util.error;

/**
 *
 * @author cj_sr
 */
public class FileNotFoundException extends CredencialException {
    
    public FileNotFoundException(String message) {
        super("FileNotFoundException", message);
    }

    public FileNotFoundException(String code, String message ) {
        super( code, "FileNotFoundException" , message);
        this.code = code;
    }
    public FileNotFoundException(String code,  String name ,String message ) {
        super( code,name , message);
        this.code = code;
    }
}
