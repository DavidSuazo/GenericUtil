package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class Result {
    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public String message_id;

    public Result(String message_id) {
        this.message_id = message_id;
    }


}