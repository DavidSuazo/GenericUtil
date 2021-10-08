package com.credencial.util.error;

import com.credencial.util.response.Response;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.slf4j.LoggerFactory;

/**
 *
 * @author cj_sr
 */
public class UtilErrorMessage {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UtilErrorMessage.class);
    private static StringWriter stack;
    private static Response response;

    public static Response buildErrorException(Exception e) {
        logger.info("== buildErrorException() ==");
        stack = new StringWriter();
        response = new Response();
        e.printStackTrace(new PrintWriter(stack));
        e.printStackTrace();
        logger.info(stack.toString());
        response.setSuccess(false);
        response.setError(new com.credencial.util.response.Error(new GBMGeneralException("Error no soportado, reporte al Administrador", "-1")));

        return response;
    }

    public static Response buildErrorExceptionTmp(Exception e) {
        logger.info("== buildErrorException() ==");
        response = new Response();
        stack = new StringWriter();
        e.printStackTrace(new PrintWriter(stack));
        e.printStackTrace();
        logger.error(stack.toString());
        response.setSuccess(false);
        response.setError(new com.credencial.util.response.Error(new GBMGeneralException(e.getMessage(), "-1")));

        return response;
    }

    public static Response buildErrorGBM(CredencialException e) {
        logger.info("== buildErrorGBM() ==");
        response = new Response();
        response.setSuccess(false);
        String codeError = "99";
        if (e.getCode() != null) {
            codeError = e.getCode();
        }
        response.setError(new com.credencial.util.response.Error(e.getName(), e.getMessage(), codeError));

        if (e.getMessage().contains("Su solicitud")) {
            logger.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            logger.info(e.getMessage());
            logger.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }

        return response;
    }

    public com.credencial.util.receiver.response.Response buildErrorAldebaran(CredencialException e) {
        logger.info("== buildErrorAldebaran() ==");
        com.credencial.util.receiver.response.Response aldebaran = new com.credencial.util.receiver.response.Response();
        aldebaran.setSuccess(false);
        String codeError = "99";
        if (e.getCode() != null) {
            codeError = e.getCode();
        }
        aldebaran.setCode(-1);
        aldebaran.setMessage("Fail message");

        return aldebaran;
    }

    public static Response buildErrorResponse(String message) {
        logger.info("== buildErrorResponse() ==");
        response = new Response();
        response.setError(new com.credencial.util.response.Error(new GBMGeneralException(message, "-1")));
        return response;

    }
}
