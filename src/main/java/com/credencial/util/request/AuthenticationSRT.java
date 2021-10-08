package com.credencial.util.request;


/**
 *
 * @author cj_sr
 */
public class AuthenticationSRT {

    private String user;
    private String password;

    public AuthenticationSRT(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public AuthenticationSRT() {

    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
