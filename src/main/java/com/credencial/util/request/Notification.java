package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class Notification {

    private String title;
    private String body;
    private String sound;
    private boolean mutable_content = true;

    public Notification(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isMutable_content() {
        return mutable_content;
    }

    public void setMutable_content(boolean mutable_content) {
        this.mutable_content = mutable_content;
    }

}
