package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.credencial.util.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author cj_sr
 */
public class ListProductsRequest implements JSonable{

//    @SerializedName("Services")
    private List<ServiceRequest> services;
//    @SerializedName("Products")
    private List<ProductRequest> products;
//   @SerializedName("Total")
    private int total;
//    @SerializedName("ResponseCode")
    private int responseCode;
//    @SerializedName("ResponseDescription")
    private String responseDescription;

    /**
     * @return the services
     */
    public List<ServiceRequest> getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(List<ServiceRequest> services) {
        this.services = services;
    }

    /**
     * @return the products
     */
    public List<ProductRequest> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<ProductRequest> products) {
        this.products = products;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode the responseCode to set
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return the responseDescription
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * @param responseDescription the responseDescription to set
     */
    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }
    
    
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat(StringUtils.FORMAT_DATE_YY_MM_DD_SSz).create();
        return gson.fromJson(message, ListProductsRequest.class);
    }
}
