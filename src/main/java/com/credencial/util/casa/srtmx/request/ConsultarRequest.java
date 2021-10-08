/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.casa.srtmx.request;

import static com.credencial.util.Constantes.PUBLIC_KEY_CASA_SRT;
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
 * @author David
 */
public class ConsultarRequest implements Serializable, JSonable {

    private Autenticacion autenticacion;
    private Originador originador;
    private String tarjeta;
    private String tarjetaEncript;

    public Autenticacion getAutenticacion() {
        return new Autenticacion();
    }

    public void setAutenticacion(Autenticacion autenticacion) {
        this.autenticacion = autenticacion;
    }

    public Originador getOriginador() {
        return originador;
    }

    public void setOriginador(Originador originador) {
        this.originador = originador;
    }

    public String getTarjeta() {      
        return tarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.tarjeta = Tarjeta;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ConsultarRequest.class);
    }

    public String getTarjetaEncript() {
          try {
            RSAAsymetricCrypto aAsymetricCrypto = new RSAAsymetricCrypto();
            aAsymetricCrypto.setLlavePublica(PUBLIC_KEY_CASA_SRT);
            this.tarjetaEncript = aAsymetricCrypto.rsa_encript(tarjeta);
        } catch (IOException ex) {
            Logger.getLogger(ConsultarRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(ConsultarRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(ConsultarRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(ConsultarRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(ConsultarRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ConsultarRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(ConsultarRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tarjetaEncript;
    }

    public void setTarjetaEncript(String TarjetaEncript) {
        this.tarjetaEncript = TarjetaEncript;
    }

}
