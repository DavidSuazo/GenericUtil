package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class ConfigComisionRequest implements Serializable, JSonable {

    private int idContext;
    private String commission_Percentage;
    private String multi_commission;
    private String dollar_value;
    private String type_Operation;

    public int getIdContext() {
        return idContext;
    }

    public void setIdContext(int idContext) {
        this.idContext = idContext;
    }

    public String getCommission_Percentage() {
        return commission_Percentage;
    }

    public void setCommission_Percentage(String commission_Percentage) {
        this.commission_Percentage = commission_Percentage;
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

    public String getType_Operation() {
        return type_Operation;
    }

    public void setType_Operation(String type_Operation) {
        this.type_Operation = type_Operation;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, ConfigComisionRequest.class);
    }

    public String toJsonLog() {
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(new NoModuleExclusionStrategy(false))
                .addDeserializationExclusionStrategy(new NoModuleExclusionStrategy(true))
                .create();
        return gson.toJson(this);
    }

}
