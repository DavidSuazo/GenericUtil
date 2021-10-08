package com.credencial.util.request;

import static com.credencial.util.ConstantesAltaWeb.DOC_INE;
import static com.credencial.util.ConstantesAltaWeb.DOC_PASSPORT;
import static com.credencial.util.ConstantesAltaWeb.FEMALE;
import static com.credencial.util.ConstantesAltaWeb.FEMALE_F;
import static com.credencial.util.ConstantesAltaWeb.FEMENINO;
import static com.credencial.util.ConstantesAltaWeb.MALE;
import static com.credencial.util.ConstantesAltaWeb.MALE_H;
import static com.credencial.util.ConstantesAltaWeb.MASCULINO;
import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class RegisterOnboardRequest extends GBMBaseRequest implements Serializable, JSonable {

    private static final String DEFAULT_ENTITY_PREFIX = "COEMISOR";

    private Boolean isExternalApp;
    private String bundle;
    private String idUser;
    private String email;
    private String contresena;
    private String password;
    private String newPassword;
    private String numeroIdentificacionFiscal;
    private String dni;
    private String name;
    private String firstName;
    private String lastName;
    private String telephoneFix;
    private String telephone;
    private String telephoneOrigin;
    private int idOnboard;
    private int typeDocument;
    private String nrDocument;
    private String typePerson;
    private String gender;
    private String birthDate;
    private Double incomeAmount;
    private String limitAmount;
    private int statementType;
    private String statementOther;
    private String civilStatus;
    private int sector;
    private int cantidad;
    private int chanel;
    private String code_add;
    private String streat;
    private String number_add;
    private String dpto;
    private String numberDpto;
    private String location;
    private String provice;
    private String postalCode;
    private String phoneNumber;
    @Expose(serialize = false, deserialize = true)
    private String backImage64;
    @Expose(serialize = false, deserialize = true)
    private String frontImage64;
    @Expose(serialize = false, deserialize = true)
    private String selfieFrontImage64;
    @Expose(serialize = false, deserialize = true)
    private String selfieImage64;
    @Expose(serialize = false, deserialize = true)
    private String selfieLifeImage64;
    @Expose(serialize = false, deserialize = true)
    private String fileStatuto;
    private String ocupation;
    private String catego;
    private String pinDriver;
    private String cuit;
    private int cuitType;
    private String keyOnboard;
    private int idSucursal;
    private String score;
    private String score_code;
    private String score_message;
    private String vu_j_response;
    private String imei;
    private String nationality;
    private String locationBirth;
    private Boolean pep;
    private String pep_description;
    private Boolean uif;
    private String uif_description;
    private int originFounds;
    private String originFoundsDescription;
    private int originFounds_legal;
    private String originFoundsDescription_legal;
    private String iva_condition;
    private String entityPrefix = DEFAULT_ENTITY_PREFIX;
    private String deliveryAddress_code_send;
    private String deliveryAddress_hour;
    private String deliveryAddress_street;
    private String deliveryAddress_number_street;
    private String deliveryAddress_department;
    private String deliveryAddress_code_product;
    private String deliveryAddress_province;
    private String deliveryAddress_code_province;
    private String deliveryAddress_city;
    private String deliveryAddress_code_postal;
    private String deliveryAddress_location;

    private String realAddrress_street;
    private String realAddrress_number;
    private String realAddrress_code_postal;
    private String realAddrress_floor;
    private String realAddrress_number_aparment;
    private String typeOperation;
    private String like;
    private String path;
    private String idLocation;
    private String idProvice;
    private String nameSelfieLife;
    private String razonSocial;
    private String clabe;
    private String isSavingCard = "N";
    private String ops;
    private String usr;
    private String penc;
    private String identity_number;
    private String origin_country;
    private String product_code;
    private String affinity_group;
    private String fourthLine;
    private String marca_grabacion_card;
    private String cod_vendor;
    private String carga_anual_limite;
    private String delivery_plod;
    private String typeDocumentSrt;
    private String context = "CWWS005B?";
    private int idContex;
    private String merchant_id;
    private String isTarjetaFisica = "N";
    private boolean isModify;
    private boolean isModifyAlias;
    private boolean cardRecordigCard;
    private String vencimiento;
    private String num_cuenta;
    private boolean isRealModify;
    private String cbu;

    //Comercio
    private boolean isCommerce;
    private String commerce_dni;
    private String commerce_number;
    private String commerce_floor;
    private String commerce_department;
    private String commerce_street;
    private String commerce_door;
    private String commerce_plod;
    private String commerce_postal_code;
    private String commerce_location;
    private String commerce_province;
    private String commerce_razon_social;
    private String condition_tributary;
    private String condition_tributary_commerce;
    private String category_taxpayer;
    private String number_income;
    private String nosis_activity;
    private String rubro;

    //Juridico
    private boolean isJuridico;
    private String legal_cuit;
    private String legal_razon_social;
    private String legal_nature;
    private String main_activity;
    private String enrollment_date_registral;
    private String enrollment_registral_number;
    private String obligated_subject;
    private String supervised_person;
    private String legal_email;
    private String legal_street;
    private String legal_number;
    private String legal_location;
    private String legal_postal_code;
    private String legal_province;
    private String phoneNumber_sede_social;
    private String legal_representative;
    private String attorney;
    private boolean uifLegal;
    private String uifLegalDescription;
    private String formId;
    private String formKey;
    private Boolean isMPOS;
    private String tyc;
    private String webRegistration;
    private String curp;
    private String idClienteCore;
    private String encodedKeyCliente;
    private String idCuentaCore;
    private String encodedKeyCuenta;
    private String numCuentaCore;
    private String idStatus;
    private String tokenUser;

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getIdOnboard() {
        return idOnboard;
    }

    public int getTypeDocument() {
        return typeDocument;
    }

    public String getNrDocument() {
        return nrDocument;
    }

    public String getGender() {
        String gender = this.gender.toUpperCase();

        if (gender.equals(FEMENINO) || gender.equals(FEMALE)) {
            return FEMALE_F;
        } else if (gender.equals(MASCULINO) || gender.equals(MALE)) {
            return MALE_H;
        } else {
            return gender;
        }

    }

    public String getBirthDate() {
        return birthDate;
    }

    public Double getIncomeAmount() {
        return incomeAmount;
    }

    public int getSector() {
        return sector;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getChanel() {
        return chanel;
    }

    public String getCode_add() {
        return code_add;
    }

    public String getStreet() {
        return streat;
    }

    public String getNumber_add() {
        return number_add;
    }

    public String getDpto() {
        return dpto;
    }

    public String getNumberDpto() {
        return numberDpto;
    }

    public String getLocation() {
        return location;
    }

    public String getProvice() {
        return provice;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setIdOnboard(int idOnboard) {
        this.idOnboard = idOnboard;
    }

    public void setTypeDocument(int typeDocument) {
        this.typeDocument = typeDocument;
    }

    public void setNrDocument(String nrDocument) {
        this.nrDocument = nrDocument;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGenderFormat(String gender) {
        if (gender.equals("H")) {
            this.gender = "M";
        } else {
            this.gender = "F";
        }

    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthDateFormat(String birthDate) {
        try {
            this.birthDate = birthDate.substring(6, 10) + birthDate.substring(3, 5) + birthDate.substring(0, 2);

        } catch (Exception e) {
            e.printStackTrace();
            this.birthDate = "";
        }
    }

    public void setIncomeAmount(Double incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    public void setCode_add(String code_add) {
        this.code_add = code_add;
    }

    public void setStreat(String streat) {
        this.streat = streat;
    }

    public void setNumber_add(String number_add) {
        this.number_add = number_add;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public void setNumberDpto(String numberDpto) {
        this.numberDpto = numberDpto;
    }

    public void setLocation(String location) {
        if (location != null) {
            this.location = location.trim();
        }
    }

    public void setProvice(String provice) {
        if (provice != null) {
            this.provice = provice.trim();
        }
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    public String toJsonLog() {
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(new NoModuleExclusionStrategy(false))
                .addDeserializationExclusionStrategy(new NoModuleExclusionStrategy(true))
                .create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, RegisterOnboardRequest.class);
    }

    public int getIdContex() {
        return idContex;
    }

    public void setIdContex(int idContex) {
        this.idContex = idContex;
    }

    public String getBackImage64() {
        return backImage64;
    }

    public void setBackImage64(String backImage64) {
        this.backImage64 = backImage64;
    }

    public String getFrontImage64() {
        return frontImage64;
    }

    public void setFrontImage64(String frontImage64) {
        this.frontImage64 = frontImage64;
    }

    public String getSelfieFrontImage64() {
        return selfieFrontImage64;
    }

    public void setSelfieFrontImage64(String selfieFrontImage64) {
        this.selfieFrontImage64 = selfieFrontImage64;
    }

    public String getSelfieImage64() {
        return selfieImage64;
    }

    public void setSelfieImage64(String selfieImage64) {
        this.selfieImage64 = selfieImage64;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getCatego() {
        return catego;
    }

    public void setCatego(String catego) {
        this.catego = catego;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getTelephoneFix() {
        return telephoneFix;
    }

    public void setTelephoneFix(String telephoneFix) {
        this.telephoneFix = telephoneFix;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPinDriver() {
        return pinDriver;
    }

    public void setPinDriver(String pinDriver) {
        this.pinDriver = pinDriver;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContresena() {
        return contresena;
    }

    public void setContresena(String contresena) {
        this.contresena = contresena;
    }

    public String getNumeroIdentificacionFiscal() {
        return numeroIdentificacionFiscal;
    }

    public void setNumeroIdentificacionFiscal(String numeroIdentificacionFiscal) {
        this.numeroIdentificacionFiscal = numeroIdentificacionFiscal;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public String getKeyOnboard() {
        return keyOnboard;
    }

    public void setKeyOnboard(String keyOnboard) {
        this.keyOnboard = keyOnboard;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public String getScore() {
        return score;
    }

    public String getScore_code() {
        return score_code;
    }

    public String getScore_message() {
        return score_message;
    }

    public String getVu_j_response() {
        return vu_j_response;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setScore_code(String score_code) {
        this.score_code = score_code;
    }

    public void setScore_message(String score_message) {
        this.score_message = score_message;
    }

    public void setVu_j_response(String vu_j_response) {
        this.vu_j_response = vu_j_response;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNationality() {
        return nationality;
    }

    public String getLocationBirth() {
        return locationBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setLocationBirth(String locationBirth) {
        this.locationBirth = locationBirth;
    }

    public Boolean isPep() {
        return pep;
    }

    public void setPep(Boolean pep) {
        this.pep = pep;
    }

    public Boolean isUif() {
        return uif;
    }

    public void setUif(boolean uif) {
        this.uif = uif;
    }

    public String getDeliveryAddress_code_send() {
        return deliveryAddress_code_send;
    }

    public String getDeliveryAddress_hour() {
        return deliveryAddress_hour;
    }

    public String getDeliveryAddress_street() {
        return deliveryAddress_street;
    }

    public String getDeliveryAddress_number_street() {
        return deliveryAddress_number_street;
    }

    public String getDeliveryAddress_department() {
        return deliveryAddress_department;
    }

    public String getDeliveryAddress_code_product() {
        return deliveryAddress_code_product;
    }

    public String getDeliveryAddress_province() {
        return deliveryAddress_province;
    }

    public String getDeliveryAddress_city() {
        return deliveryAddress_city;
    }

    public String getDeliveryAddress_code_postal() {
        return deliveryAddress_code_postal;
    }

    public void setDeliveryAddress_code_send(String deliveryAddress_code_send) {
        this.deliveryAddress_code_send = deliveryAddress_code_send;
    }

    public void setDeliveryAddress_hour(String deliveryAddress_hour) {
        this.deliveryAddress_hour = deliveryAddress_hour;
    }

    public void setDeliveryAddress_street(String deliveryAddress_street) {
        this.deliveryAddress_street = deliveryAddress_street;
    }

    public void setDeliveryAddress_number_street(String deliveryAddress_number_street) {
        this.deliveryAddress_number_street = deliveryAddress_number_street;
    }

    public void setDeliveryAddress_department(String deliveryAddress_department) {
        this.deliveryAddress_department = deliveryAddress_department;
    }

    public void setDeliveryAddress_code_product(String deliveryAddress_code_product) {
        this.deliveryAddress_code_product = deliveryAddress_code_product;
    }

    public void setDeliveryAddress_province(String deliveryAddress_province) {
        this.deliveryAddress_province = deliveryAddress_province;
    }

    public void setDeliveryAddress_city(String deliveryAddress_city) {
        this.deliveryAddress_city = deliveryAddress_city;
    }

    public void setDeliveryAddress_code_postal(String deliveryAddress_code_postal) {
        this.deliveryAddress_code_postal = deliveryAddress_code_postal;
    }

    public String getRealAddrress_street() {
        return realAddrress_street;
    }

    public String getRealAddrress_number() {
        return realAddrress_number;
    }

    public String getRealAddrress_code_postal() {
        return realAddrress_code_postal;
    }

    public String getRealAddrress_floor() {
        return realAddrress_floor;
    }

    public String getRealAddrress_number_aparment() {
        return realAddrress_number_aparment;
    }

    public void setRealAddrress_street(String realAddrress_street) {
        this.realAddrress_street = realAddrress_street;
    }

    public void setRealAddrress_number(String realAddrress_number) {
        this.realAddrress_number = realAddrress_number;
    }

    public void setRealAddrress_code_postal(String realAddrress_code_postal) {
        this.realAddrress_code_postal = realAddrress_code_postal;
    }

    public void setRealAddrress_floor(String realAddrress_floor) {
        this.realAddrress_floor = realAddrress_floor;
    }

    public void setRealAddrress_number_aparment(String realAddrress_number_aparment) {
        this.realAddrress_number_aparment = realAddrress_number_aparment;
    }

    public String getDeliveryAddress_code_province() {
        return deliveryAddress_code_province;
    }

    public void setDeliveryAddress_code_province(String deliveryAddress_code_province) {
        this.deliveryAddress_code_province = deliveryAddress_code_province;
    }

    public String getSelfieLifeImage64() {
        return selfieLifeImage64;
    }

    public void setSelfieLifeImage64(String selfieLifeImage64) {
        this.selfieLifeImage64 = selfieLifeImage64;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIdLocation() {
        return idLocation;
    }

    public String getIdProvice() {
        return idProvice;
    }

    public void setIdLocation(String idLocation) {
        this.idLocation = idLocation;
    }

    public void setIdProvice(String idProvice) {
        this.idProvice = idProvice;
    }

    public String getNameSelfieLife() {
        return nameSelfieLife;
    }

    public void setNameSelfieLife(String nameSelfieLife) {
        this.nameSelfieLife = nameSelfieLife;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getIsSavingCard() {
        return isSavingCard;
    }

    public void setIsSavingCard(String isSavingCard) {
        this.isSavingCard = isSavingCard;
    }

    public String getOps() {
        return ops;
    }

    public void setOps(String ops) {
        this.ops = ops;
    }

    public String getIdentity_number() {
        return identity_number;
    }

    public void setIdentity_number(String identity_number) {
        this.identity_number = identity_number;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getAffinity_group() {
        return affinity_group;
    }

    public void setAffinity_group(String affinity_group) {
        this.affinity_group = affinity_group;
    }

    public String getFourthLine() {
        return fourthLine;
    }

    public void setFourthLine(String fourthLine) {
        this.fourthLine = fourthLine;
    }

    public String getMarca_grabacion_card() {
        return marca_grabacion_card;
    }

    public void setMarca_grabacion_card(String marca_grabacion_card) {
        this.marca_grabacion_card = marca_grabacion_card;
    }

    public String getCod_vendor() {
        return cod_vendor;
    }

    public void setCod_vendor(String cod_vendor) {
        this.cod_vendor = cod_vendor;
    }

    public String getCarga_anual_limite() {
        return carga_anual_limite;
    }

    public void setCarga_anual_limite(String carga_anual_limite) {
        this.carga_anual_limite = carga_anual_limite;
    }

    public String getDeliveryAddress_location() {
        return deliveryAddress_location;
    }

    public void setDeliveryAddress_location(String deliveryAddress_location) {
        this.deliveryAddress_location = deliveryAddress_location;
    }

    public String getDelivery_plod() {
        return delivery_plod;
    }

    public void setDelivery_plod(String delivery_plod) {
        this.delivery_plod = delivery_plod;
    }

    public String getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(String limitAmount) {
        this.limitAmount = limitAmount;
    }

    public String getTypeDocumentSrt() {
        switch (typeDocument) {
            case 1:
                return DOC_INE;
            case 2:
                return DOC_PASSPORT;
            default:
                return DOC_INE;
        }
    }

    public void setTypeDocumentSrt(String typeDocumentSrt) {
        this.typeDocumentSrt = typeDocumentSrt;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getIsTarjetaFisica() {
        return isTarjetaFisica;
    }

    public void setIsTarjetaFisica(String isTarjetaFisica) {
        this.isTarjetaFisica = isTarjetaFisica;
    }

    public boolean isIsModify() {
        return isModify;
    }

    public void setIsModify(boolean isModify) {
        this.isModify = isModify;
    }

    public boolean isIsModifyAlias() {
        return isModifyAlias;
    }

    public void setIsModifyAlias(boolean isModifyAlias) {
        this.isModifyAlias = isModifyAlias;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPenc() {
        return penc;
    }

    public void setPenc(String penc) {
        this.penc = penc;
    }

    public int getStatementType() {
        return statementType;
    }

    public void setStatementType(int statementType) {
        this.statementType = statementType;
    }

    public String getStatementOther() {
        return statementOther;
    }

    public void setStatementOther(String statementOther) {
        this.statementOther = statementOther;
    }

    public String getUif_description() {
        return uif_description;
    }

    public void setUif_description(String uif_description) {
        this.uif_description = uif_description;
    }

    public String getPep_description() {
        return pep_description;
    }

    public void setPep_description(String pep_description) {
        this.pep_description = pep_description;
    }

    public int getOriginFounds() {
        return originFounds;
    }

    public String getOriginFoundsDescription() {
        return originFoundsDescription;
    }

    public void setOriginFounds(int originFounds) {
        this.originFounds = originFounds;
    }

    public void setOriginFoundsDescription(String originFoundsDescription) {
        this.originFoundsDescription = originFoundsDescription;
    }

    public int getCuitType() {
        return cuitType;
    }

    public void setCuitType(int cuitType) {
        this.cuitType = cuitType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getIva_condition() {
        return iva_condition;
    }

    public void setIva_condition(String iva_condition) {
        this.iva_condition = iva_condition;
    }

    public boolean isCardRecordigCard() {
        return cardRecordigCard;
    }

    public void setCardRecordigCard(boolean cardRecordigCard) {
        this.cardRecordigCard = cardRecordigCard;
    }

    public String getEntityPrefix() {
        return entityPrefix;
    }

    public void setEntityPrefix(String entityPrefix) {
        this.entityPrefix = entityPrefix;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public boolean isIsCommerce() {
        return isCommerce;
    }

    public void setIsCommerce(boolean isCommerce) {
        this.isCommerce = isCommerce;
    }

    public String getCommerce_number() {
        return commerce_number;
    }

    public void setCommerce_number(String commerce_number) {
        this.commerce_number = commerce_number;
    }

    public String getCommerce_street() {
        return commerce_street;
    }

    public void setCommerce_street(String commerce_street) {
        this.commerce_street = commerce_street;
    }

    public String getCommerce_door() {
        return commerce_door;
    }

    public void setCommerce_door(String commerce_door) {
        this.commerce_door = commerce_door;
    }

    public String getCommerce_plod() {
        return commerce_plod;
    }

    public void setCommerce_plod(String commerce_plod) {
        this.commerce_plod = commerce_plod;
    }

    public String getCommerce_postal_code() {
        return commerce_postal_code;
    }

    public void setCommerce_postal_code(String commerce_postal_code) {
        this.commerce_postal_code = commerce_postal_code;
    }

    public String getCommerce_location() {
        return commerce_location;
    }

    public void setCommerce_location(String commerce_location) {
        this.commerce_location = commerce_location;
    }

    public String getCommerce_province() {
        return commerce_province;
    }

    public void setCommerce_province(String commerce_province) {
        this.commerce_province = commerce_province;
    }

    public String getCondition_tributary() {
        return condition_tributary;
    }

    public void setCondition_tributary(String condition_tributary) {
        this.condition_tributary = condition_tributary;
    }

    public String getCategory_taxpayer() {
        return category_taxpayer;
    }

    public void setCategory_taxpayer(String category_taxpayer) {
        this.category_taxpayer = category_taxpayer;
    }

    public String getNumber_income() {
        return number_income;
    }

    public void setNumber_income(String number_income) {
        this.number_income = number_income;
    }

    public String getNosis_activity() {
        return nosis_activity;
    }

    public void setNosis_activity(String nosis_activity) {
        this.nosis_activity = nosis_activity;
    }

    public boolean isIsRealModify() {
        return isRealModify;
    }

    public void setIsRealModify(boolean isRealModify) {
        this.isRealModify = isRealModify;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getCommerce_dni() {
        return commerce_dni;
    }

    public void setCommerce_dni(String commerce_dni) {
        this.commerce_dni = commerce_dni;
    }

    public String getCommerce_floor() {
        return commerce_floor;
    }

    public void setCommerce_floor(String commerce_floor) {
        this.commerce_floor = commerce_floor;
    }

    public String getCommerce_department() {
        return commerce_department;
    }

    public void setCommerce_department(String commerce_department) {
        this.commerce_department = commerce_department;
    }

    public String getCommerce_razon_social() {
        return commerce_razon_social;
    }

    public void setCommerce_razon_social(String commerce_razon_social) {
        this.commerce_razon_social = commerce_razon_social;
    }

    public boolean isIsJuridico() {
        return isJuridico;
    }

    public void setIsJuridico(boolean isJuridico) {
        this.isJuridico = isJuridico;
    }

    public String getLegal_cuit() {
        return legal_cuit;
    }

    public void setLegal_cuit(String legal_cuit) {
        this.legal_cuit = legal_cuit;
    }

    public String getLegal_razon_social() {
        return legal_razon_social;
    }

    public void setLegal_razon_social(String legal_razon_social) {
        this.legal_razon_social = legal_razon_social;
    }

    public String getLegal_nature() {
        return legal_nature;
    }

    public void setLegal_nature(String legal_nature) {
        this.legal_nature = legal_nature;
    }

    public String getMain_activity() {
        return main_activity;
    }

    public void setMain_activity(String main_activity) {
        this.main_activity = main_activity;
    }

    public String getEnrollment_date_registral() {
        return enrollment_date_registral;
    }

    public void setEnrollment_date_registral(String enrollment_date_registral) {
        this.enrollment_date_registral = enrollment_date_registral;
    }

    public String getEnrollment_registral_number() {
        return enrollment_registral_number;
    }

    public void setEnrollment_registral_number(String enrollment_registral_number) {
        this.enrollment_registral_number = enrollment_registral_number;
    }

    public String getObligated_subject() {
        return obligated_subject;
    }

    public void setObligated_subject(String obligated_subject) {
        this.obligated_subject = obligated_subject;
    }

    public String getSupervised_person() {
        return supervised_person;
    }

    public void setSupervised_person(String supervised_person) {
        this.supervised_person = supervised_person;
    }

    public String getLegal_email() {
        return legal_email;
    }

    public void setLegal_email(String legal_email) {
        this.legal_email = legal_email;
    }

    public String getPhoneNumber_sede_social() {
        return phoneNumber_sede_social;
    }

    public void setPhoneNumber_sede_social(String phoneNumber_sede_social) {
        this.phoneNumber_sede_social = phoneNumber_sede_social;
    }

    public String getLegal_street() {
        return legal_street;
    }

    public void setLegal_street(String legal_street) {
        this.legal_street = legal_street;
    }

    public String getLegal_number() {
        return legal_number;
    }

    public void setLegal_number(String legal_number) {
        this.legal_number = legal_number;
    }

    public String getLegal_location() {
        return legal_location;
    }

    public void setLegal_location(String legal_location) {
        this.legal_location = legal_location;
    }

    public String getLegal_postal_code() {
        return legal_postal_code;
    }

    public void setLegal_postal_code(String legal_postal_code) {
        this.legal_postal_code = legal_postal_code;
    }

    public String getLegal_province() {
        return legal_province;
    }

    public void setLegal_province(String legal_province) {
        this.legal_province = legal_province;
    }

    public String getLegal_representative() {
        return legal_representative;
    }

    public void setLegal_representative(String legal_representative) {
        this.legal_representative = legal_representative;
    }

    public String getAttorney() {
        return attorney;
    }

    public void setAttorney(String attorney) {
        this.attorney = attorney;
    }

    public String getCondition_tributary_commerce() {
        return condition_tributary_commerce;
    }

    public void setCondition_tributary_commerce(String condition_tributary_commerce) {
        this.condition_tributary_commerce = condition_tributary_commerce;
    }

    public int getOriginFounds_legal() {
        return originFounds_legal;
    }

    public void setOriginFounds_legal(int originFounds_legal) {
        this.originFounds_legal = originFounds_legal;
    }

    public String getOriginFoundsDescription_legal() {
        return originFoundsDescription_legal;
    }

    public void setOriginFoundsDescription_legal(String originFoundsDescription_legal) {
        this.originFoundsDescription_legal = originFoundsDescription_legal;
    }

    public boolean isUifLegal() {
        return uifLegal;
    }

    public void setUifLegal(boolean uifLegal) {
        this.uifLegal = uifLegal;
    }

    public String getUifLegalDescription() {
        return uifLegalDescription;
    }

    public void setUifLegalDescription(String uifLegalDescription) {
        this.uifLegalDescription = uifLegalDescription;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getFormKey() {
        return formKey;
    }

    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    public Boolean getIsExternalApp() {
        return isExternalApp;
    }

    public void setIsExternalApp(Boolean isExternalApp) {
        this.isExternalApp = isExternalApp;
    }

    public Boolean getUif() {
        return uif;
    }

    public void setUif(Boolean uif) {
        this.uif = uif;
    }

    public Boolean getIsMPOS() {
        return isMPOS;
    }

    public void setIsMPOS(Boolean isMPOS) {
        this.isMPOS = isMPOS;
    }

    /**
     * @return the fileStatuto
     */
    public String getFileStatuto() {
        return fileStatuto;
    }

    /**
     * @param fileStatuto the fileStatuto to set
     */
    public void setFileStatuto(String fileStatuto) {
        this.fileStatuto = fileStatuto;
    }

    /**
     * @return the telephoneOrigin
     */
    public String getTelephoneOrigin() {
        return telephoneOrigin;
    }

    /**
     * @param telephoneOrigin the telephoneOrigin to set
     */
    public void setTelephoneOrigin(String telephoneOrigin) {
        this.telephoneOrigin = telephoneOrigin;
    }

    public String getTyc() {
        return tyc;
    }

    public void setTyc(String tyc) {
        this.tyc = tyc;
    }

    public String getWebRegistration() {
        return webRegistration;
    }

    public void setWebRegistration(String webRegistration) {
        this.webRegistration = webRegistration;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getIdClienteCore() {
        return idClienteCore;
    }

    public void setIdClienteCore(String idClienteCore) {
        this.idClienteCore = idClienteCore;
    }

    public String getEncodedKeyCliente() {
        return encodedKeyCliente;
    }

    public void setEncodedKeyCliente(String encodedKeyCliente) {
        this.encodedKeyCliente = encodedKeyCliente;
    }

    public String getIdCuentaCore() {
        return idCuentaCore;
    }

    public void setIdCuentaCore(String idCuentaCore) {
        this.idCuentaCore = idCuentaCore;
    }

    public String getEncodedKeyCuenta() {
        return encodedKeyCuenta;
    }

    public void setEncodedKeyCuenta(String encodedKeyCuenta) {
        this.encodedKeyCuenta = encodedKeyCuenta;
    }

    public String getNumCuentaCore() {
        return numCuentaCore;
    }

    public void setNumCuentaCore(String numCuentaCore) {
        this.numCuentaCore = numCuentaCore;
    }

    public String getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    public String getTokenUser() {
        return tokenUser;
    }

    public void setTokenUser(String tokenUser) {
        this.tokenUser = tokenUser;
    }

}
