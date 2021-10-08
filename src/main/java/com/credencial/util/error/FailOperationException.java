package com.credencial.util.error;

/**
 * @author emilio
 * Created on : 29/01/2020, 12:59:52 PM
 *
 */
public class FailOperationException extends CredencialException {
    private String request;
    private String response;

    public FailOperationException(String message) {
        super(FailOperationException.class.getName(), message);
    }
    public FailOperationException(String name, String message, String code) {
        super(name, message, code);
    }

    public String getRequest() {
        return request;
    }
    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
}
