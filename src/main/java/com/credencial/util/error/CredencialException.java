package com.credencial.util.error;

public class CredencialException extends Exception {
    protected String message;
    protected String name;
    protected String code;

    public CredencialException(String message) {
        this(CredencialException.class.getName(), message);
    }

    public CredencialException(String name, String message, String code) {
        this(name, message);
        this.code = code;
    }
    

    public CredencialException(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
