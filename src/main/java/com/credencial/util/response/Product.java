package com.credencial.util.response;

import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class Product implements Serializable {

    private String id_producto;
    private String grupo;
    private String id_grupo;
    private String compania;
    private String sku;
    private String descripcion;
    private String importe;
    private String vigencia;
    private String MG_GB_Incluidos;
    private String MG_GB_Redes_Sociales;
    private String tipo;
    private String lastDateModify;
    private String categoriaServicio;
    private String Min_y_SMS_Ilimitados;
    private String imageBase64;
    private String longitud;
    private String long_min;
    private String long_max;
    private String amount_min;
    private String amount_max;
    private String serviceName;
    private int idTipoServicio;
    private int qtyProducts;
    private String comission;
    private Boolean isPin;
    private Boolean acceptBarcode;
    private String productName;
    private String comissionProduct;

    public String getId_producto() {
        return id_producto;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImporte() {
        return importe;
    }

    public String getVigencia() {
        return vigencia;
    }

    public String getMG_GB_Incluidos() {
        return MG_GB_Incluidos;
    }

    public String getMG_GB_Redes_Sociales() {
        return MG_GB_Redes_Sociales;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLastDateModify() {
        return lastDateModify;
    }

    public String getCategoriaServicio() {
        return categoriaServicio;
    }

    public String getMin_y_SMS_Ilimitados() {
        return Min_y_SMS_Ilimitados;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public void setMG_GB_Incluidos(String MG_GB_Incluidos) {
        this.MG_GB_Incluidos = MG_GB_Incluidos;
    }

    public void setMG_GB_Redes_Sociales(String MG_GB_Redes_Sociales) {
        this.MG_GB_Redes_Sociales = MG_GB_Redes_Sociales;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLastDateModify(String lastDateModify) {
        this.lastDateModify = lastDateModify;
    }

    public void setCategoriaServicio(String categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    public void setMin_y_SMS_Ilimitados(String Min_y_SMS_Ilimitados) {
        this.Min_y_SMS_Ilimitados = Min_y_SMS_Ilimitados;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public String getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(String id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLong_min() {
        return long_min;
    }

    public void setLong_min(String long_min) {
        this.long_min = long_min;
    }

    public String getLong_max() {
        return long_max;
    }

    public void setLong_max(String long_max) {
        this.long_max = long_max;
    }

    public String getAmount_min() {
        return amount_min;
    }

    public void setAmount_min(String amount_min) {
        this.amount_min = amount_min;
    }

    public String getAmount_max() {
        return amount_max;
    }

    public void setAmount_max(String amount_max) {
        this.amount_max = amount_max;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public int getQtyProducts() {
        return qtyProducts;
    }

    public void setQtyProducts(int qtyProducts) {
        this.qtyProducts = qtyProducts;
    }

    public String getComission() {
        return comission;
    }

    public void setComission(String comission) {
        this.comission = comission;
    }

    public Boolean getIsPin() {
        return isPin;
    }

    public void setIsPin(Boolean isPin) {
        this.isPin = isPin;
    }

    public Boolean getAcceptBarcode() {
        return acceptBarcode;
    }

    public void setAcceptBarcode(Boolean acceptBarcode) {
        this.acceptBarcode = acceptBarcode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComissionProduct() {
        return comissionProduct;
    }

    public void setComissionProduct(String comissionProduct) {
        this.comissionProduct = comissionProduct;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
