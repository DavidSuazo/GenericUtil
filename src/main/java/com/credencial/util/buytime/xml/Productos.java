/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credencial.util.buytime.xml;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author David
 */
@XmlRootElement(name = "PRODUCTOS")
public class Productos implements Serializable, JSonable {
    
     private List<Producto> producto;

    public List<Producto> getProducto() {
        return producto;
    }

  
    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toJson() {
       Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Productos.class);
    }
    
}
