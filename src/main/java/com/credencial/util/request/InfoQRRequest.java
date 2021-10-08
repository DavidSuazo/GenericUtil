package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class InfoQRRequest implements Serializable, JSonable {

    private String idQR;
    private String id;
    private Type_operation to;
    private String ammount;
    private String description;
    private String cardNumber;
    private int idUser;
    private String secuence_numer;
    private String cardType;
    private String rubro;
    private String denCom;
    private String destinationCard;

    /**
     * @return the ammount
     */
    public String getAmmount() {
        return ammount;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @return the secuence_numer
     */
    public String getSecuence_numer() {
        return secuence_numer;
    }

    /**
     * @param ammount the ammount to set
     */
    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @param secuence_numer the secuence_numer to set
     */
    public void setSecuence_numer(String secuence_numer) {
        this.secuence_numer = secuence_numer;
    }

    public enum Type_operation {
        INFO_QR,
        PAY_QR
    }

    /**
     * @return the idQR
     */
    public String getIdQR() {
        return idQR;
    }

    /**
     * @param idQR the idQR to set
     */
    public void setIdQR(String idQR) {
        this.idQR = idQR;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, InfoQRRequest.class);
    }

    /**
     * @return the to
     */
    public Type_operation getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(Type_operation to) {
        this.to = to;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @return the rubro
     */
    public String getRubro() {
        return rubro;
    }

    /**
     * @return the denCom
     */
    public String getDenCom() {
        return denCom;
    }

    /**
     * @return the destinationCard
     */
    public String getDestinationCard() {
        return destinationCard;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @param rubro the rubro to set
     */
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    /**
     * @param denCom the denCom to set
     */
    public void setDenCom(String denCom) {
        this.denCom = denCom;
    }

    /**
     * @param destinationCard the destinationCard to set
     */
    public void setDestinationCard(String destinationCard) {
        this.destinationCard = destinationCard;
    }

}
