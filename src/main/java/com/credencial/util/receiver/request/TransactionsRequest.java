package com.credencial.util.receiver.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;


public class TransactionsRequest implements Serializable, JSonable {

    private String id_comercio;
    private String nombre_comercio;
    private String fecha_hora;
    private String fecha_pos;
    private String hora_pos;
    private String rubro;
    private String trace;
    private String codigo_autorizacion;
    private String importe;
    private String codigo_moneda;
    private String importe_liquidacion;
    private String codigo_moneda_liquidacion;
    private String numero_cuenta;
    private String sistema_envio;
    private String transaccion;
    private String tipo_transaccion;
    private String sub_tipo_transaccion;
    private String tarjeta;
    private String tarjeta_ofuscada;
    private String tipo_cambio;
    private String alias;
    private String codigo_producto;
    private String codigo_respuesta;
    private String locacion;
    private String pais;
    private String canal;

    /**
     * @return the id_comercio
     */
    public String getId_comercio() {
        return id_comercio;
    }

    /**
     * @return the nombre_comercio
     */
    public String getNombre_comercio() {
        return nombre_comercio;
    }

    /**
     * @return the fecha_hora
     */
    public String getFecha_hora() {
        return fecha_hora;
    }

    /**
     * @return the fecha_pos
     */
    public String getFecha_pos() {
        return fecha_pos;
    }

    /**
     * @return the hora_pos
     */
    public String getHora_pos() {
        return hora_pos;
    }

    /**
     * @return the rubro
     */
    public String getRubro() {
        return rubro;
    }

    /**
     * @return the trace
     */
    public String getTrace() {
        return trace;
    }

    /**
     * @return the codigo_autorizacion
     */
    public String getCodigo_autorizacion() {
        return codigo_autorizacion;
    }

    /**
     * @return the importe
     */
    public String getImporte() {
        return importe;
    }

    /**
     * @return the codigo_moneda
     */
    public String getCodigo_moneda() {
        return codigo_moneda;
    }

    /**
     * @return the importe_liquidacion
     */
    public String getImporte_liquidacion() {
        return importe_liquidacion;
    }

    /**
     * @return the codigo_moneda_liquidacion
     */
    public String getCodigo_moneda_liquidacion() {
        return codigo_moneda_liquidacion;
    }

    /**
     * @return the numero_cuenta
     */
    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    /**
     * @return the sistema_envio
     */
    public String getSistema_envio() {
        return sistema_envio;
    }

    /**
     * @return the transaccion
     */
    public String getTransaccion() {
        return transaccion;
    }

    /**
     * @return the tipo_transaccion
     */
    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    /**
     * @return the sub_tipo_transaccion
     */
    public String getSub_tipo_transaccion() {
        return sub_tipo_transaccion;
    }

    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @return the tarjeta_ofuscada
     */
    public String getTarjeta_ofuscada() {
        return tarjeta_ofuscada;
    }

    /**
     * @return the tipo_cambio
     */
    public String getTipo_cambio() {
        return tipo_cambio;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @return the codigo_producto
     */
    public String getCodigo_producto() {
        return codigo_producto;
    }

    /**
     * @return the codigo_respuesta
     */
    public String getCodigo_respuesta() {
        return codigo_respuesta;
    }

    /**
     * @return the locacion
     */
    public String getLocacion() {
        return locacion;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @return the canal
     */
    public String getCanal() {
        return canal;
    }

    /**
     * @param id_comercio the id_comercio to set
     */
    public void setId_comercio(String id_comercio) {
        this.id_comercio = id_comercio;
    }

    /**
     * @param nombre_comercio the nombre_comercio to set
     */
    public void setNombre_comercio(String nombre_comercio) {
        this.nombre_comercio = nombre_comercio;
    }

    /**
     * @param fecha_hora the fecha_hora to set
     */
    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    /**
     * @param fecha_pos the fecha_pos to set
     */
    public void setFecha_pos(String fecha_pos) {
        this.fecha_pos = fecha_pos;
    }

    /**
     * @param hora_pos the hora_pos to set
     */
    public void setHora_pos(String hora_pos) {
        this.hora_pos = hora_pos;
    }

    /**
     * @param rubro the rubro to set
     */
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    /**
     * @param trace the trace to set
     */
    public void setTrace(String trace) {
        this.trace = trace;
    }

    /**
     * @param codigo_autorizacion the codigo_autorizacion to set
     */
    public void setCodigo_autorizacion(String codigo_autorizacion) {
        this.codigo_autorizacion = codigo_autorizacion;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(String importe) {
        this.importe = importe;
    }

    /**
     * @param codigo_moneda the codigo_moneda to set
     */
    public void setCodigo_moneda(String codigo_moneda) {
        this.codigo_moneda = codigo_moneda;
    }

    /**
     * @param importe_liquidacion the importe_liquidacion to set
     */
    public void setImporte_liquidacion(String importe_liquidacion) {
        this.importe_liquidacion = importe_liquidacion;
    }

    /**
     * @param codigo_moneda_liquidacion the codigo_moneda_liquidacion to set
     */
    public void setCodigo_moneda_liquidacion(String codigo_moneda_liquidacion) {
        this.codigo_moneda_liquidacion = codigo_moneda_liquidacion;
    }

    /**
     * @param numero_cuenta the numero_cuenta to set
     */
    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    /**
     * @param sistema_envio the sistema_envio to set
     */
    public void setSistema_envio(String sistema_envio) {
        this.sistema_envio = sistema_envio;
    }

    /**
     * @param transaccion the transaccion to set
     */
    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    /**
     * @param tipo_transaccion the tipo_transaccion to set
     */
    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    /**
     * @param sub_tipo_transaccion the sub_tipo_transaccion to set
     */
    public void setSub_tipo_transaccion(String sub_tipo_transaccion) {
        this.sub_tipo_transaccion = sub_tipo_transaccion;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @param tarjeta_ofuscada the tarjeta_ofuscada to set
     */
    public void setTarjeta_ofuscada(String tarjeta_ofuscada) {
        this.tarjeta_ofuscada = tarjeta_ofuscada;
    }

    /**
     * @param tipo_cambio the tipo_cambio to set
     */
    public void setTipo_cambio(String tipo_cambio) {
        this.tipo_cambio = tipo_cambio;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @param codigo_producto the codigo_producto to set
     */
    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    /**
     * @param codigo_respuesta the codigo_respuesta to set
     */
    public void setCodigo_respuesta(String codigo_respuesta) {
        this.codigo_respuesta = codigo_respuesta;
    }

    /**
     * @param locacion the locacion to set
     */
    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(String canal) {
        this.canal = canal;
    }
    
    
    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, TransactionsRequest.class);
    }


}
