package com.credencial.util.response;

import com.credencial.util.request.MessageRequest;

/**
 *
 * @author tecto
 */
public class SupportPayService {
    private MessageRequest messageRequest;
    private Response response;

    public MessageRequest getMessageRequest() {
        return messageRequest;
    }

    public void setMessageRequest(MessageRequest messageRequest) {
        this.messageRequest = messageRequest;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
    
    
}
