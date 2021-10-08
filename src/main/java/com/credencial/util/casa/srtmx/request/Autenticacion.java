package com.credencial.util.casa.srtmx.request;


/**
 *
 * @author David
 */
public class Autenticacion {
    
    public Autenticacion(String usr, String psw ){
    this.Usuario =usr;
    this.Password = psw;
    }
     public Autenticacion(){
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    private String Usuario;
    private String Password;
    
    
}
