package com.credencial.util.digipro;

import java.util.HashMap;

/**
 *
 * @author cj_sr
 */
public class Klazz {

    private Documentos[] Documentos;

    private String __type;

    private Json[] Json;

    private HashMap<String, String> hasMap;

    public Documentos[] getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(Documentos[] Documentos) {
        this.Documentos = Documentos;
    }

    public String get__type() {
        return __type;
    }

    public void set__type(String __type) {
        this.__type = __type;
    }

    public Json[] getJson() {
        return Json;
    }

    public void setJson(Json[] Json) {
        this.Json = Json;
    }

    @Override
    public String toString() {
        return "ClassPojo [Documentos = " + Documentos + ", __type = " + __type + ", Json = " + Json + "]";
    }

    public HashMap<String, String> getHasMap() {
        return hasMap;
    }

    public void setHasMap(Documentos[] documentos, Json[] json) {
        this.hasMap = new HashMap<>();

        for (Documentos js : documentos) {
            this.hasMap.put(js.getNombreExpediente(), js.getBase64());
        }
        for (Json js : json) {
            this.hasMap.put(js.getTitulo(), js.getValor());
        }

    }

}
