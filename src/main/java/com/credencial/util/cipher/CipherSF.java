package com.credencial.util.cipher;

import java.security.InvalidKeyException;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
//import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.apache.commons.codec.binary.Base64;

/**
 * Created on : 22/10/2012, 12:25:48 PM
 * @author ebetancourt
 *  
 * Esta clase se encarga de cifrar xxxx
 */
public class CipherSF {    
   // private final Log logger = LogFactory.getLog(getClass());
    private static final Cipher cipher;
    
    static {
     //   Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
      //  Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        
        try {
            cipher = Cipher.getInstance("AES");
        } catch (Exception ex) {
            throw new RuntimeException("Error during initialization of Cipher \n" + ex.getMessage());
        } 
    }
    
    private SecretKeySpec key;

    public CipherSF() {
        key = null;
    }

    public void setKey(String keyString) {                
        key = new SecretKeySpec(keyString.getBytes(), "AES");        
//        try { System.out.println("AES Max KeyLenght : " + Cipher.getMaxAllowedKeyLength("AES"));
//        } catch (Exception e) { System.out.println(e.getMessage());}        
    }
    
    public String encrypt(String dataToCrypt){
        
        if(!CipherSF.cipherIsInitialized()){ throw new RuntimeException("Cipher has not been instantiated"); }
        
        try   { cipher.init(Cipher.ENCRYPT_MODE, key);} 
        catch (InvalidKeyException ex) { throw new RuntimeException(ex); }
        
        byte[] input = dataToCrypt.getBytes();
        byte[] cipherText = new byte[cipher.getOutputSize(input.length)];
        
        int ctLength;
        try {
            ctLength = cipher.update(input, 0, input.length, cipherText, 0);
            ctLength += cipher.doFinal(cipherText, ctLength);
        } catch (Exception ex) {
            //.error(ex);
            throw new RuntimeException("Error crypting : " + dataToCrypt);
        } 
        
        return Base64.encodeBase64String(cipherText);
    }

    public String decrypt(String dataToDecryp){
        if(!CipherSF.cipherIsInitialized()){ throw new RuntimeException("Cipher has not been instantiated"); }
        
        byte[] cipherText = Base64.decodeBase64(dataToDecryp);
        
        try   { cipher.init(Cipher.DECRYPT_MODE, key);} 
        catch (InvalidKeyException ex) { throw new RuntimeException(ex.getMessage()); }                        
        
        byte[] cipherData = null;        
        try {   cipherData = cipher.doFinal(cipherText);   } 
        catch (Exception ex) {  
        //    logger.error(ex);
            throw new RuntimeException("Error decrypting " + dataToDecryp );   }
                
        return new String(cipherData);        
    }
    
    private static boolean cipherIsInitialized(){
        return (cipher != null);
    }
    
}