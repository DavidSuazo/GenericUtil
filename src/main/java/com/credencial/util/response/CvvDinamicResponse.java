package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class CvvDinamicResponse  implements Serializable, JSonable{

    private String valueCVC;
    private int tiempoRestante;
    
    public String getValueCVC() {
        return valueCVC;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setValueCVC(String valueCVC) {
        this.valueCVC = valueCVC;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }
    
     @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, CvvDinamicResponse.class);
    }
    
    
    
}
