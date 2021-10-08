package com.credencial.util.response;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author cj_sr
 */
public class ProductRequest {
  
//    @SerializedName("Id")
    private int id;
//    @SerializedName("ProductName")
    private String productName;
//    @SerializedName("Sku")
    private String sku;
//    @SerializedName("Amount")
    private double amount;
//    @SerializedName("Comission")
    private double comission;
//    @SerializedName("Description")
    private String description;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the comission
     */
    public double getComission() {
        return comission;
    }

    /**
     * @param comission the comission to set
     */
    public void setComission(double comission) {
        this.comission = comission;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
