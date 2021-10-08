package com.credencial.uti.ws.cred;

import com.credencial.util.JSonable;
import com.credencial.util.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author cj_sr
 */
public class CredResponse implements JSonable {

    private String status;
    private int http_code;
    private int code;
    private String description;
    private int status_code;
    private String status_message;
    private Data data;

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the http_code
     */
    public int getHttp_code() {
        return http_code;
    }

    /**
     * @param http_code the http_code to set
     */
    public void setHttp_code(int http_code) {
        this.http_code = http_code;
    }

    /**
     * @return the status_code
     */
    public int getStatus_code() {
        return status_code;
    }

    /**
     * @param status_code the status_code to set
     */
    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    /**
     * @return the status_message
     */
    public String getStatus_message() {
        return status_message;
    }

    /**
     * @param status_message the status_message to set
     */
    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.fromJson(message, CredResponse.class);
    }

    /**
     * @return the data
     */
    public Data getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
