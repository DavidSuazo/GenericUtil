package com.credencial.util.request;


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
 * @author cj_sr
 */
public class MarcaRequest extends GBMBaseRequest implements Serializable, JSonable{
    
    private AuthenticationSRT authenticationSRT;
    private Originator originator;
    private String cardEncripted;
    private Marca marca;
    private boolean isChange;


    public String getCardEncripted() {
               try {
            RSAAsymetricCrypto aAsymetricCrypto = new RSAAsymetricCrypto();
            aAsymetricCrypto.setLlavePublica(PUBLIC_KEY_CASA_SRT);
            this.cardEncripted = aAsymetricCrypto.rsa_encript(getCardNumber());
        } catch (IOException ex) {
            Logger.getLogger(MarcaRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(MarcaRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(MarcaRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(MarcaRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(MarcaRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MarcaRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(MarcaRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
               return  cardEncripted;
    }

  

    public Originator getOriginator() {
        return originator;
    }

    public void setCardEncripted(String cardEncripted) {
        this.cardEncripted = cardEncripted;
    }


    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
 
     
      @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, MarcaRequest.class);
    }

    public AuthenticationSRT getAuthenticationSRT() {
        return authenticationSRT;
    }

    public void setAuthenticationSRT(AuthenticationSRT authenticationSRT) {
        this.authenticationSRT = authenticationSRT;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public boolean isIsChange() {
        return isChange;
    }

    public void setIsChange(boolean isChange) {
        this.isChange = isChange;
    }
     
     
     
    
}
