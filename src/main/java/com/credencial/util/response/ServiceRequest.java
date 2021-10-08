package com.credencial.util.response;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author cj_sr
 */
public class ServiceRequest {
 
//    @SerializedName("Id")
    private int id;
//    @SerializedName("ServiceName")
    private String serviceName;
//    @SerializedName("UrlLogo")
    private String urlLogo;
//    @SerializedName("IdTipoServicio")
    private int idTipoServicio;
//    @SerializedName("QtyProducts")
    private int qtyProducts;
//    @SerializedName("Comission")
    private double comission;
//    @SerializedName("IsPin")
    private boolean isPin;
//    @SerializedName("AcceptBarcode")
    private boolean acceptBarcode;
//    @SerializedName("idProduct")
    private int idProduct;
//    @SerializedName("productName")
    private String productName;
//    @SerializedName("Sku")
    private String sku;
//    @SerializedName("Amount")
    private double amount;
//    @SerializedName("comissionProduct")
    private double comissionProduct;
//    @SerializedName("description")
    private String description;

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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
     * @return the comissionProduct
     */
    public double getComissionProduct() {
        return comissionProduct;
    }

    /**
     * @param comissionProduct the comissionProduct to set
     */
    public void setComissionProduct(double comissionProduct) {
        this.comissionProduct = comissionProduct;
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
     * @return the serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * @param serviceName the serviceName to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * @return the urlLogo
     */
    public String getUrlLogo() {
        return urlLogo;
    }

    /**
     * @param urlLogo the urlLogo to set
     */
    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    /**
     * @return the idTipoServicio
     */
    public int getIdTipoServicio() {
        return idTipoServicio;
    }

    /**
     * @param idTipoServicio the idTipoServicio to set
     */
    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    /**
     * @return the qtyProducts
     */
    public int getQtyProducts() {
        return qtyProducts;
    }

    /**
     * @param qtyProducts the qtyProducts to set
     */
    public void setQtyProducts(int qtyProducts) {
        this.qtyProducts = qtyProducts;
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
     * @return the isPin
     */
    public boolean isIsPin() {
        return isPin;
    }

    /**
     * @param isPin the isPin to set
     */
    public void setIsPin(boolean isPin) {
        this.isPin = isPin;
    }

    /**
     * @return the acceptBarcode
     */
    public boolean isAcceptBarcode() {
        return acceptBarcode;
    }

    /**
     * @param acceptBarcode the acceptBarcode to set
     */
    public void setAcceptBarcode(boolean acceptBarcode) {
        this.acceptBarcode = acceptBarcode;
    }

}
