package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class EventLogResponse {
    
    private boolean success;
    private Error error;
    private int idEvent;
    private int idDetailEvent;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getIdDetailEvent() {
        return idDetailEvent;
    }

    public void setIdDetailEvent(int idDetailEvent) {
        this.idDetailEvent = idDetailEvent;
    }
    
}
