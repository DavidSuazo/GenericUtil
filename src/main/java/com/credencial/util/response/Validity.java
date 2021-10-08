package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Validity {

    public Validity() {
    }

    public Validity(String current, String previous) {
        this.current = current;
        this.previous = previous;
    }

    public String getCurrent() {
        return current;
    }

    public String getPrevious() {
        return previous;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    private String current;
    private String previous;

}
