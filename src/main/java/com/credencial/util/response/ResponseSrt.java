package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ResponseSrt implements Serializable, JSonable {

    private String code;
    private String description;
    private String ticketWS;

    public ResponseSrt() {
    }

    public ResponseSrt(String code, String descrip, String ticketWS) {
        this.code = code;
        this.description = descrip;
        this.ticketWS = ticketWS;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getTicketWS() {
        return ticketWS;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTicketWS(String ticketWS) {
        this.ticketWS = ticketWS;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ResponseSrt.class);
    }

}
