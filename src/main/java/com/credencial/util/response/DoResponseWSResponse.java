package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class DoResponseWSResponse implements Serializable, JSonable {

    private boolean success;
    private Error error;
    private String message;
    private DoResponse doResponse;
    private ListProductsRequest listProductsRequest;

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @return the error
     */
    public Error getError() {
        return error;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the doResponse
     */
    public DoResponse getDoResponse() {
        return doResponse;
    }

    /**
     * @return the listProductsRequest
     */
    public ListProductsRequest getListProductsRequest() {
        return listProductsRequest;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @param error the error to set
     */
    public void setError(Error error) {
        this.error = error;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @param doResponse the doResponse to set
     */
    public void setDoResponse(DoResponse doResponse) {
        this.doResponse = doResponse;
    }

    /**
     * @param listProductsRequest the listProductsRequest to set
     */
    public void setListProductsRequest(ListProductsRequest listProductsRequest) {
        this.listProductsRequest = listProductsRequest;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, DoResponseWSResponse.class);
    }
}
