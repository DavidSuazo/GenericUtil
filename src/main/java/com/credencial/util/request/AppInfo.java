package com.credencial.util.request;

/**
 *
 * @author tecto
 */
public class AppInfo {

    private String nameApp;
    private String versionApp;
    private String enviroment;
    private String versionConnector;

    /**
     * @return the nameApp
     */
    public String getNameApp() {
        return nameApp;
    }

    /**
     * @return the versionApp
     */
    public String getVersionApp() {
        return versionApp;
    }

    /**
     * @return the enviroment
     */
    public String getEnviroment() {
        return enviroment;
    }

    /**
     * @return the versionConnector
     */
    public String getVersionConnector() {
        return versionConnector;
    }

    /**
     * @param nameApp the nameApp to set
     */
    public void setNameApp(String nameApp) {
        this.nameApp = nameApp;
    }

    /**
     * @param versionApp the versionApp to set
     */
    public void setVersionApp(String versionApp) {
        this.versionApp = versionApp;
    }

    /**
     * @param enviroment the enviroment to set
     */
    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    /**
     * @param versionConnector the versionConnector to set
     */
    public void setVersionConnector(String versionConnector) {
        this.versionConnector = versionConnector;
    }

}
