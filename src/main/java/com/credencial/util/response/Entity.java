package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Entity {

    private String code;
    private String description;

    public Entity() {
    }

    public Entity(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
