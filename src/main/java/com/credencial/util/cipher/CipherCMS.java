package com.credencial.util.cipher;

import com.credencial.util.error.DecriptException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.LoggerFactory;

/**
 *
 * @author David
 */
public class CipherCMS {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CipherCMS.class);

    static RSAAsymetricCrypto aAsymetricCrypto;
    static AESencrp aESencrp;

    public static String decriptRSAKey(String privateRSA, String request_key) throws DecriptException {
        logger.info("== decriptRSAKey() ==");

        try {
            aAsymetricCrypto = new RSAAsymetricCrypto();

            aAsymetricCrypto.setLlavePrivada(privateRSA);

            byte[] dataB = Base64.decodeBase64(request_key);
            return aAsymetricCrypto.rsa_decript(dataB);
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
            throw new DecriptException("Error en la desencripcion del campo KEY RSA, reportar con el CAT!");
        }

    }

    public static String decripAESData(String keyAES, String requestData) throws DecriptException {
        logger.info("==decripAESData()==");

        String paddign = "AES";
        String paddign2 = "AES/ECB/PKCS5Padding";

        String decript = null;
        try {
            aESencrp = new AESencrp();

            AESencrp.setKeyValue(keyAES.getBytes());

            decript = AESencrp.decryptAES(requestData, paddign);
            logger.info("paddign =>" + paddign);

        } catch (BadPaddingException e) {
            e.printStackTrace();
            try {
                e.printStackTrace();
                decript = AESencrp.decryptAES(requestData, paddign2);
                logger.info("paddign2 =>" + paddign2);
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new DecriptException("Error al decifrar con la clave AES  (" + keyAES + "), verifique padding/campo data o reporté con el CAT!");

            }

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CipherCMS.class.getName()).log(Level.SEVERE, null, ex);
            throw new DecriptException("Error UnsupportedEncodingException ,reporte con el CAT!");
        } catch (Exception ex) {
            Logger.getLogger(CipherCMS.class.getName()).log(Level.SEVERE, null, ex);
            throw new DecriptException("Error en la desencripcion del campo DATA AES, reportar con el CAT!");
        }
        return decript;
    }

}
