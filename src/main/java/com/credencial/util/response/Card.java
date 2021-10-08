package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class Card implements Serializable, JSonable {

    private String number;
    private String acount;
    private Entity entity;
    private String branchOffice;
    private ProductCard productCard;
    private Balance saldos;
    private State state;
    private Validity validity;
    private Person person;
    private Activity activity;
    private String countError;

    private String cardObFuscated;
    private String dateVen;
    private String typeCard;
    private String stateCard;
    private String name;
    private String typeDocument;
    private String documentNumber;
    private String alias;
    private String clabe;
    private String lastNominationMoment;
    private String product;
    private boolean wasReplaced;

    public String getAcount() {
        return acount;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getBranchOffice() {
        return branchOffice;
    }

    public String getCountError() {
        return countError;
    }

    public Entity getEntity() {
        return entity;
    }

    public String getNumber() {
        return number;
    }

    public Person getPerson() {
        return person;
    }

    public ProductCard getProductCard() {
        return productCard;
    }

    public State getState() {
        return state;
    }

    public Validity getValidity() {
        return validity;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setBranchOffice(String branchOffice) {
        this.branchOffice = branchOffice;
    }

    public void setCountError(String countError) {
        this.countError = countError;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setProductCard(ProductCard productCard) {
        this.productCard = productCard;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Card.class);
    }

    public String getCardObFuscated() {
        return cardObFuscated;
    }

    public void setCardObFuscated(String cardObFuscated) {
        this.cardObFuscated = cardObFuscated;
    }

    public String getDateVen() {
        return dateVen;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public String getStateCard() {
        return stateCard;
    }

    public String getName() {
        return name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getAlias() {
        return alias;
    }

    public String getClabe() {
        return clabe;
    }

    public void setDateVen(String dateVen) {
        this.dateVen = dateVen;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public void setStateCard(String stateCard) {
        this.stateCard = stateCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public Balance getSaldos() {
        return saldos;
    }

    public void setSaldos(Balance saldos) {
        this.saldos = saldos;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLastNominationMoment() {
        return lastNominationMoment;
    }

    public void setLastNominationMoment(String lastNominationMoment) {
        this.lastNominationMoment = lastNominationMoment;
    }

    public boolean isWasReplaced() {
        return wasReplaced;
    }

    public void setWasReplaced(boolean wasReplaced) {
        this.wasReplaced = wasReplaced;
    }
   
}
