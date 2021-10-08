/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.cipher;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author SMXLAP02DSR
 */
public class AESencrp { 
    private static byte[] keyValue;            

   
    private static Key generateKey() throws Exception {
        System.out.println("Key=" + toHexString(getKeyValue()));
        Key key = new SecretKeySpec(getKeyValue(), "AES");
        return key;
    }

    public static String encryptAES(String Data,String pading) throws Exception {
       Key key = generateKey();
    
        Cipher cipher = Cipher.getInstance(pading);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encrypted = cipher.doFinal(Data.getBytes());
        System.out.println("TEXTO CIFRADO: "
                + Base64.encodeBase64String(encrypted));

        return Base64.encodeBase64String(encrypted);

        
    }

    public static String decryptAES(String encryptedData,String InstancePading) throws Exception {
        Key key = generateKey();             
        Cipher c = Cipher.getInstance(InstancePading);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }

    public static String toHexString(byte[] array) {
        return DatatypeConverter.printHexBinary(array);
    }

    public static byte[] toByteArray(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }

    public static String toEBCDIC(String string) {
        try {
            byte[] bytes = string.getBytes("CP1047");
            for (int i = 0; i < bytes.length; i++) {
                System.out.printf("%s %X%n", string.charAt(i), bytes[i]);
            }
            return "";

        } catch (Exception e) {
            return "";
        }

    }

    /**
     * @return the keyValue
     */
    public static byte[] getKeyValue() {
        return keyValue;
    }

    /**
     * @param aKeyValue the keyValue to set
     */
    public static void setKeyValue(byte[] aKeyValue) {
        System.out.println("com.credencial.util.cipher.AESencrp.setKeyValue()");
        keyValue = aKeyValue;
    }

}
