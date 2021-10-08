package com.credencial.util.cipher;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author dsuazo  
 */
public class RSAAsymetricCrypto {

    private static Cipher rsa;
    private String llavePublica;
    private String llavePrivada;

    public String rsa_encript(String encryptedValue) throws IOException, BadPaddingException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException, NoSuchAlgorithmException, IllegalBlockSizeException {
        //Se pueden mostrar las claves para ver cuáles son, aunque esto no es aconsejable
        X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(Base64.decodeBase64(getLlavePublica()));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(pubKeySpec);
        //Ciframos con clave pública el texto plano utilizando RSA
        Cipher cifrador = Cipher.getInstance("RSA");
        cifrador.init(Cipher.ENCRYPT_MODE, publicKey);
        //Realización del cifrado del texto plano
        byte[] bufferCifrado = cifrador.doFinal(encryptedValue.getBytes());

        return Base64.encodeBase64String(bufferCifrado);
    }

    public String rsa_decript(byte[] data) throws InvalidKeyException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException {
        byte[] bufferClaro;
        String decryptedValue;
        java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        Cipher cifrador = Cipher.getInstance("RSA");
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(org.apache.commons.codec.binary.Base64.decodeBase64(getLlavePrivada()));
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = kf.generatePrivate(keySpec);
        //Desencriptación utilizando la clave privada
        cifrador.init(Cipher.DECRYPT_MODE, privateKey);
        //Obtener y mostrar texto descifrado
        bufferClaro = cifrador.doFinal(data);
        // mostrarBytes(bufferClaro);
        // decryptedValue = new String(bufferClaro);       

        return decryptedValue = new String(bufferClaro);

    }

    public static PrivateKey bigIntegerToPrivateKey(BigInteger e, BigInteger m) throws NoSuchAlgorithmException, InvalidKeySpecException {
        RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(m, e);
        KeyFactory fact = KeyFactory.getInstance("RSA");
        PrivateKey privKey = fact.generatePrivate(keySpec);
        return privKey;
    }

    public String rsa_decriptSRT(byte[] data) throws InvalidKeyException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, DecoderException, NoSuchProviderException {
        byte[] bufferClaro;
        String decryptedValue;

        Cipher cifrador = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(org.apache.commons.codec.binary.Base64.decodeBase64(getLlavePrivada()));
        KeyFactory kf = KeyFactory.getInstance("RSA");
        BigInteger data_N = new BigInteger(Hex.decodeHex("DC64A485256DA03FF92C922684B97CFD9C50D21C62A80E12CBFA921FD1AD5A1A97C778484B7F9D5C0B2006A17EEB483B659E65756F02F911432C323E0A0261E1392C32809032433B616981D39049CE2753650CFECAC8376EF62C88118F3B8966B83A5C49A849566221E551CAD167058F5B24DF93DBF4958CAEBB496C17F9F8B5".toCharArray()));
        BigInteger data_E = new BigInteger(Hex.decodeHex("65944577D0BE6C43D016C8EDD3F2A23749DABE5CB2E3FE488F9757CE2E981595782B49B7188523040F649D69C5D3AFA120BF16C83F78414FC184174C1CD4E84348CB4EE670BA85B0E3DB9AFAA2EC4BD18B89A2BC1545908A2166C648745F41E31F44B4BE694F46243E3B926975EF3C18D8686387DC80928FCD3DE33ADD3994E9".toCharArray()));

        PrivateKey privateKey = bigIntegerToPrivateKey(data_N, data_E);
        //Desencriptación utilizando la clave privada
        cifrador.init(Cipher.DECRYPT_MODE, privateKey);
        //Obtener y mostrar texto descifrado
        bufferClaro = cifrador.doFinal(data);
        // mostrarBytes(bufferClaro);
        // decryptedValue = new String(bufferClaro);       

        return decryptedValue = new String(bufferClaro);

    }

    private static PublicKey loadPublicKey(String fileName) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        int numBtyes = fis.available();
        byte[] bytes = new byte[numBtyes];
        fis.read(bytes);
        fis.close();

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        KeySpec keySpec = new X509EncodedKeySpec(bytes);
        PublicKey keyFromBytes = keyFactory.generatePublic(keySpec);
        return keyFromBytes;
    }

    private static PrivateKey loadPrivateKey(String fileName) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        int numBtyes = fis.available();
        byte[] bytes = new byte[numBtyes];
        fis.read(bytes);
        fis.close();
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        KeySpec keySpec = new PKCS8EncodedKeySpec(bytes);
        PrivateKey keyFromBytes = keyFactory.generatePrivate(keySpec);
        return keyFromBytes;
    }

    private static void saveKey(Key key, String fileName) throws Exception {
        byte[] publicKeyBytes = key.getEncoded();
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(publicKeyBytes);
        fos.close();
    }

    /**
     * @return the llavePublica
     */
    public String getLlavePublica() {
        return llavePublica;
    }

    /**
     * @param llavePublica the llavePublica to set
     */
    public void setLlavePublica(String llavePublica) {
        this.llavePublica = llavePublica;
    }

    /**
     * @return the llavePrivada
     */
    public String getLlavePrivada() {
        return llavePrivada;
    }

    /**
     * @param llavePrivada the llavePrivada to set
     */
    public void setLlavePrivada(String llavePrivada) {
        this.llavePrivada = llavePrivada;
    }
}
