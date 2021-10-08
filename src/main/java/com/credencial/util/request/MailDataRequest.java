package com.credencial.util.request;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author cj_sr
 */
public class MailDataRequest implements Serializable {

    private String template;
    private int idContext;
    private HashMap<String, String> hashMap;
    private String type;
    private String timeZone;

    /**
     * @return the hashMap
     */
    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    /**
     * @param hashMap the hashMap to set
     */
    public void setHashMap(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the idContext
     */
    public int getIdContext() {
        return idContext;
    }

    /**
     * @param idContext the idContext to set
     */
    public void setIdContext(int idContext) {
        this.idContext = idContext;
    }

    /**
     * @return the template
     */
    public String getTemplate() {
        return template;
    }

    /**
     * @param template the template to set
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * @return the timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone the timeZone to set
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
