package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ConfigComisionResponse implements Serializable, JSonable {

    private boolean isSuccess;
    private String commission_percentage;
    private String multi_commission;
    private String dollar_value;

    public boolean isIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getCommission_percentage() {
        return commission_percentage;
    }

    public void setCommission_percentage(String commission_percentage) {
        this.commission_percentage = commission_percentage;
    }

    public String getMulti_commission() {
        return multi_commission;
    }

    public void setMulti_commission(String multi_commission) {
        this.multi_commission = multi_commission;
    }

    public String getDollar_value() {
        return dollar_value;
    }

    public void setDollar_value(String dollar_value) {
        this.dollar_value = dollar_value;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ConfigComisionResponse.class);
    }

}
