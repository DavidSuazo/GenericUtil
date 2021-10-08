package com.credencial.util.response;

/**
 *
 * @author David
 */
public class Connection {

    private String token;
    private String expires;

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the expires
     */
    public String getExpires() {
        return expires;
    }

    /**
     * @param expires the expires to set
     */
    public void setExpires(String expires) {
        this.expires = expires;
    }

}
