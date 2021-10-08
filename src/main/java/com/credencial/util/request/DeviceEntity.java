package com.credencial.util.request;

/**
 *
 * @author tecto
 */
public class DeviceEntity {

    private String os;
    private String systemOperativeName;
    private String systemOperativeVersion;
    private String manufacturer;
    private String model;

    public DeviceEntity() {
    }

    public String getSystemOperativeName() {
        return systemOperativeName;
    }

    public void setSystemOperativeName(String systemOperativeName) {
        this.systemOperativeName = systemOperativeName;
    }

    public String getSystemOperativeVersion() {
        return systemOperativeVersion;
    }

    public void setSystemOperativeVersion(String systemOperativeVersion) {
        this.systemOperativeVersion = systemOperativeVersion;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }

}
