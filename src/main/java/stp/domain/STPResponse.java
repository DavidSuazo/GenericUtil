package stp.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

/**
 * @author emilio
 * Created on : 6/02/2020, 08:53:10 PM
 *
 */
public class STPResponse {
    @SerializedName(value = "resultado")
    private Result result;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }

    public String toJSON() {
        Gson gsonSer = new GsonBuilder().serializeNulls().create();
        
        return gsonSer.toJson(this);
    } 

    public static STPResponse fromJSON(String json){
        Gson gson = new GsonBuilder().create();

        return gson.fromJson(json, STPResponse.class);        
    }    
}
