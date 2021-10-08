package com.credencial.util;

import com.credencial.util.error.CredencialException;
import com.credencial.util.request.PayBillPaymentRequest;
import com.credencial.util.response.Response;

/**
 *
 * @author cj_sr
 */
public interface InvokerTopUpServices {
    
    public Response execute(PayBillPaymentRequest payServiceTopUpRequest, String credential) throws CredencialException;
    
    
}
