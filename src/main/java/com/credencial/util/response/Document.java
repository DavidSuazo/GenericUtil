package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Document {
    
    private String type;
    private String iden;
    
    public Document(String type, String iden) {
        this.type = type;
        this.iden = iden;
    }

    public Document() {
    }

    public String getIden() {
        return iden;
    }

    public String getType() {
        return type;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
