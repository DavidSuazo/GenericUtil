package stp.domain;

import com.google.gson.annotations.SerializedName;

/**
 * @author emilio
 * Created on : 6/02/2020, 07:01:33 PM
 *
 */

public class Result {
    private int id;
    @SerializedName(value = "descripcionError")
    private String description;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
