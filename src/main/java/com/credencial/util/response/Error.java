package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.credencial.util.casa.srtmx.response.Atencion;
import com.credencial.util.error.CredencialException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

public class Error implements Serializable,JSonable{
    private static final String LEFT_PARENTHESIS = "(";
    private static final String RIGHT_PARENTHESIS = ")";
    private static final String SEPARATOR = " : ";
    private static final String SEMI_COLON = ":";

    private String name;
    private String message;
    private String code;
    private String TicketWS;
    private Atencion atencion;


    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }
    public Error(CredencialException e){
        this.code = e.getCode();
        this.name = e.getName();
        this.message = e.getMessage();
    }
    
    public Error (String name, String message){
     this.name = name;
        this.message = message;
    }
    public Error (String name, String message, String code){
     this.name = name;
        this.message = message;
        this.code = code;
    }

    public Error() {
    }
    /**
     * Get the value of message
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the value of message
     *
     * @param message new value of message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(LEFT_PARENTHESIS);
        sb.append(getName());
        sb.append(SEPARATOR);
        sb.append(getMessage());
        sb.append(RIGHT_PARENTHESIS);
        
        return sb.toString();
    }
    
   
      @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Error.class);
    }

    public String getTicketWS() {
        return TicketWS;
    }

    public void setTicketWS(String TicketWS) {
        this.TicketWS = TicketWS;
    }


}
