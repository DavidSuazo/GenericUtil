package com.credencial.util.request;

import static com.credencial.util.Constantes.PUBLIC_KEY_PIN;
import com.credencial.util.JSonable;
import com.credencial.util.cipher.RSAAsymetricCrypto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author cj_sr
 */
public class PIN_AtmRequest extends GBMBaseRequest implements Serializable, JSonable {

    private String pin;
    private String newPin;
    private String expDate;
    private String cvv;

    public String getPin() {
        return pin;
    }

    public String getNewPin() {
        return newPin;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, PIN_AtmRequest.class);
    }
    
    public String getEncriptPin(String pin) {
        String returnPassword = "";
        try {
            RSAAsymetricCrypto aAsymetricCrypto = new RSAAsymetricCrypto();
            aAsymetricCrypto.setLlavePublica(PUBLIC_KEY_PIN);
            returnPassword = aAsymetricCrypto.rsa_encript(pin);
        } catch (IOException ex) {
            Logger.getLogger(StatusByCardRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(StatusByCardRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(StatusByCardRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(StatusByCardRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(StatusByCardRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(StatusByCardRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(StatusByCardRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returnPassword;
    }

}
