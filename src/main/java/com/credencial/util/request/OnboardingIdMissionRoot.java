package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class OnboardingIdMissionRoot implements Serializable, JSonable {

    private String Form_Status;
    private String Form_Id;
    private String Product_Id;
    private String Form_Key;
    Form_Data Form_Data;

    // Getter Methods 
    public String getForm_Status() {
        return Form_Status;
    }

    public String getForm_Id() {
        return Form_Id;
    }

    public String getProduct_Id() {
        return Product_Id;
    }

    public String getForm_Key() {
        return Form_Key;
    }

    public Form_Data getForm_Data() {
        return Form_Data;
    }

    // Setter Methods 
    public void setForm_Status(String Form_Status) {
        this.Form_Status = Form_Status;
    }

    public void setForm_Id(String Form_Id) {
        this.Form_Id = Form_Id;
    }

    public void setProduct_Id(String Product_Id) {
        this.Product_Id = Product_Id;
    }

    public void setForm_Key(String Form_Key) {
        this.Form_Key = Form_Key;
    }

    public void setForm_Data(Form_Data Form_Data) {
        this.Form_Data = Form_Data;
    }
    
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, OnboardingIdMissionRoot.class);
    }    
    
}
