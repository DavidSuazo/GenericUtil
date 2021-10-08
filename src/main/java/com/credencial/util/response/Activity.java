package com.credencial.util.response;

/**
 *
 * @author cj_sr
 */
public class Activity {
    
      private String lastUpdate;
    private String lastOperationApproved;
    private String lastOperationDenied;
    private String lastHighNewsletter;
    private String lastLowNewsletter;
    
    
    public Activity() {
    }

    public Activity(String lastUpdate,
            String lastOperationApproved,
            String lastOperationDenied,
            String lastHighNewsletter,
            String lastLowNewsletter) {
        this.lastUpdate = lastUpdate;
        this.lastOperationApproved = lastOperationApproved;
        this.lastOperationDenied = lastOperationDenied;
        this.lastHighNewsletter = lastHighNewsletter;
        this.lastLowNewsletter = lastLowNewsletter;
    }

    public String getLastHighNewsletter() {
        return lastHighNewsletter;
    }

    public String getLastLowNewsletter() {
        return lastLowNewsletter;
    }

    public String getLastOperationApproved() {
        return lastOperationApproved;
    }

    public String getLastOperationDenied() {
        return lastOperationDenied;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastHighNewsletter(String lastHighNewsletter) {
        this.lastHighNewsletter = lastHighNewsletter;
    }

    public void setLastLowNewsletter(String lastLowNewsletter) {
        this.lastLowNewsletter = lastLowNewsletter;
    }

    public void setLastOperationApproved(String lastOperationApproved) {
        this.lastOperationApproved = lastOperationApproved;
    }

    public void setLastOperationDenied(String lastOperationDenied) {
        this.lastOperationDenied = lastOperationDenied;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
  
    
}
