package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class Apn {
    private Payload payload;
    private Fcm_options fcm_options;

    /**
     * @return the payload
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * @return the fcm_options
     */
    public Fcm_options getFcm_options() {
        return fcm_options;
    }

    /**
     * @param fcm_options the fcm_options to set
     */
    public void setFcm_options(Fcm_options fcm_options) {
        this.fcm_options = fcm_options;
    }
    
}
