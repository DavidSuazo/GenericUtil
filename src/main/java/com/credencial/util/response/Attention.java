package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Attention {

    private String start;
    private String end;
    private String time;

    public Attention() {
    }

    public Attention(String start, String end, String time) {
        this.start = start;
        this.end = end;
        this.time = time;
    }

    public String getEnd() {
        return end;
    }

    public String getStart() {
        return start;
    }

    public String getTime() {
        return time;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
