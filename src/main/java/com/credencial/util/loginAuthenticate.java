package com.credencial.util;

/**
 *
 * @author David
 */
public class loginAuthenticate {
    
    private String user;
    private String pssword;
    private String application_key;
    private String application_secret;
    private String application_bundle;
    private String private_key_RSA;
    private String tokenSession;
    
    private String requestEncripted;//atributo temporal para pruebas
    

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pssword
     */
    public String getPssword() {
        return pssword;
    }

    /**
     * @param pssword the pssword to set
     */
    public void setPssword(String pssword) {
        this.pssword = pssword;
    }

    /**
     * @return the application_key
     */
    public String getApplication_key() {
        return application_key;
    }

    /**
     * @param application_key the application_key to set
     */
    public void setApplication_key(String application_key) {
        this.application_key = application_key;
    }

    /**
     * @return the application_secret
     */
    public String getApplication_secret() {
        return application_secret;
    }

    /**
     * @param application_secret the application_secret to set
     */
    public void setApplication_secret(String application_secret) {
        this.application_secret = application_secret;
    }

    /**
     * @return the application_bundle
     */
    public String getApplication_bundle() {
        return application_bundle;
    }

    /**
     * @param application_bundle the application_bundle to set
     */
    public void setApplication_bundle(String application_bundle) {
        this.application_bundle = application_bundle;
    }

    /**
     * @return the private_key_RSA
     */
    public String getPrivate_key_RSA() {
        return private_key_RSA;
    }

    /**
     * @param private_key_RSA the private_key_RSA to set
     */
    public void setPrivate_key_RSA(String private_key_RSA) {
        this.private_key_RSA = private_key_RSA;
    }

    /**
     * @return the tokenSession
     */
    public String getTokenSession() {
        return tokenSession;
    }

    /**
     * @param tokenSession the tokenSession to set
     */
    public void setTokenSession(String tokenSession) {
        this.tokenSession = tokenSession;
    }

    public String getRequestEncripted() {
        return requestEncripted;
    }

    public void setRequestEncripted(String requestEncripted) {
        this.requestEncripted = requestEncripted;
    }
    
   
    
}
