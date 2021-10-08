package com.credencial.util.request;

import com.credencial.util.JSonable;
import com.credencial.util.Request;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author cj_sr
 */
public class Form_Data implements Serializable, JSonable {

    private String ID_Type;
    private String ID_State;
    private String ID_Country;
    private String Name;
    private String First_Name;
    private String Middle_Name;
    private String Last_Name;
    private String Address;
    private String Address1;
    private String Address2;
    private String Country;
    private String ID_Number;
    private String ID_Number_Match_Result;
    private String IDNumber1;
    private String IDNumber2;
    private String IDNumber3;
    private String Valid_ID_Number;
    private String Date_of_Birth;
    private String Date_of_Birth_Formatted;
    private String Expiration_Date;
    private String Expiration_Date_Formatted;
    private String Issue_Date;
    private String Issuing_Country;
    private String Face_Detected;
    private String MRZValid;
    private String MRZData;
    private String FaceVerificationStatus;
    private String Manual_Review_Executed;
    private String Image_Front;
    private String Image_Back;
    private String Image_ProcessedFront;
    private String Image_ProcessedBack;
    private String Customer_Photo;
    private String NameNonEng;
    private String FirstNameNonEng;
    private String LastNameNonEng;
    private String MiddleNameNonEng;
    private String LastName2;
    private String AddressNonEng;
    private String AddressLine1NonEng;
    private String AddressLine2NonEng;
    private String IDNumberNonEng;
    private String IDNumber2NonEng;
    private String DateofBirthNonEng;
    private String ExpiryDateNonEng;
    private String IssueDateNonEng;
    private String Gender;
    private String Unique_Customer_Number;
    private String Form_State_Code;
    private String content;
    private String CURRENT_FORM_STATE_FOR_CALL;

    // Getter Methods   

    public String getID_Type() {
        return ID_Type;
    }

    public String getID_State() {
        return ID_State;
    }

    public String getID_Country() {
        return ID_Country;
    }

    public String getName() {
        return Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public String getCountry() {
        return Country;
    }

    public String getID_Number() {
        return ID_Number;
    }

    public String getID_Number_Match_Result() {
        return ID_Number_Match_Result;
    }

    public String getIDNumber1() {
        return IDNumber1;
    }

    public String getIDNumber2() {
        return IDNumber2;
    }

    public String getIDNumber3() {
        return IDNumber3;
    }

    public String getValid_ID_Number() {
        return Valid_ID_Number;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public String getDate_of_Birth_Formatted() {
        return Date_of_Birth_Formatted;
    }

    public String getExpiration_Date() {
        return Expiration_Date;
    }

    public String getExpiration_Date_Formatted() {
        return Expiration_Date_Formatted;
    }

    public String getIssue_Date() {
        return Issue_Date;
    }

    public String getIssuing_Country() {
        return Issuing_Country;
    }

    public String getFace_Detected() {
        return Face_Detected;
    }

    public String getMRZValid() {
        return MRZValid;
    }

    public String getMRZData() {
        return MRZData;
    }

    public String getFaceVerificationStatus() {
        return FaceVerificationStatus;
    }

    public String getManual_Review_Executed() {
        return Manual_Review_Executed;
    }

    public String getImage_Front() {
        return Image_Front;
    }

    public String getImage_Back() {
        return Image_Back;
    }

    public String getImage_ProcessedFront() {
        return Image_ProcessedFront;
    }

    public String getImage_ProcessedBack() {
        return Image_ProcessedBack;
    }

    public String getCustomer_Photo() {
        return Customer_Photo;
    }

    public String getNameNonEng() {
        return NameNonEng;
    }

    public String getFirstNameNonEng() {
        return FirstNameNonEng;
    }

    public String getLastNameNonEng() {
        return LastNameNonEng;
    }

    public String getMiddleNameNonEng() {
        return MiddleNameNonEng;
    }

    public String getLastName2() {
        return LastName2;
    }

    public String getAddressNonEng() {
        return AddressNonEng;
    }

    public String getAddressLine1NonEng() {
        return AddressLine1NonEng;
    }

    public String getAddressLine2NonEng() {
        return AddressLine2NonEng;
    }

    public String getIDNumberNonEng() {
        return IDNumberNonEng;
    }

    public String getIDNumber2NonEng() {
        return IDNumber2NonEng;
    }

    public String getDateofBirthNonEng() {
        return DateofBirthNonEng;
    }

    public String getExpiryDateNonEng() {
        return ExpiryDateNonEng;
    }

    public String getIssueDateNonEng() {
        return IssueDateNonEng;
    }

    public String getGender() {
        return Gender;
    }

    public String getUnique_Customer_Number() {
        return Unique_Customer_Number;
    }

    public String getForm_State_Code() {
        return Form_State_Code;
    }

    // Setter Methods 

    public void setID_Type(String ID_Type) {
        this.ID_Type = ID_Type;
    }

    public void setID_State(String ID_State) {
        this.ID_State = ID_State;
    }

    public void setID_Country(String ID_Country) {
        this.ID_Country = ID_Country;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public void setMiddle_Name(String Middle_Name) {
        this.Middle_Name = Middle_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setID_Number(String ID_Number) {
        this.ID_Number = ID_Number;
    }

    public void setID_Number_Match_Result(String ID_Number_Match_Result) {
        this.ID_Number_Match_Result = ID_Number_Match_Result;
    }

    public void setIDNumber1(String IDNumber1) {
        this.IDNumber1 = IDNumber1;
    }

    public void setIDNumber2(String IDNumber2) {
        this.IDNumber2 = IDNumber2;
    }

    public void setIDNumber3(String IDNumber3) {
        this.IDNumber3 = IDNumber3;
    }

    public void setValid_ID_Number(String Valid_ID_Number) {
        this.Valid_ID_Number = Valid_ID_Number;
    }

    public void setDate_of_Birth(String Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public void setDate_of_Birth_Formatted(String Date_of_Birth_Formatted) {
        this.Date_of_Birth_Formatted = Date_of_Birth_Formatted;
    }

    public void setExpiration_Date(String Expiration_Date) {
        this.Expiration_Date = Expiration_Date;
    }

    public void setExpiration_Date_Formatted(String Expiration_Date_Formatted) {
        this.Expiration_Date_Formatted = Expiration_Date_Formatted;
    }

    public void setIssue_Date(String Issue_Date) {
        this.Issue_Date = Issue_Date;
    }

    public void setIssuing_Country(String Issuing_Country) {
        this.Issuing_Country = Issuing_Country;
    }

    public void setFace_Detected(String Face_Detected) {
        this.Face_Detected = Face_Detected;
    }

    public void setMRZValid(String MRZValid) {
        this.MRZValid = MRZValid;
    }

    public void setMRZData(String MRZData) {
        this.MRZData = MRZData;
    }

    public void setFaceVerificationStatus(String FaceVerificationStatus) {
        this.FaceVerificationStatus = FaceVerificationStatus;
    }

    public void setManual_Review_Executed(String Manual_Review_Executed) {
        this.Manual_Review_Executed = Manual_Review_Executed;
    }

    public void setImage_Front(String Image_Front) {
        this.Image_Front = Image_Front;
    }

    public void setImage_Back(String Image_Back) {
        this.Image_Back = Image_Back;
    }

    public void setImage_ProcessedFront(String Image_ProcessedFront) {
        this.Image_ProcessedFront = Image_ProcessedFront;
    }

    public void setImage_ProcessedBack(String Image_ProcessedBack) {
        this.Image_ProcessedBack = Image_ProcessedBack;
    }

    public void setCustomer_Photo(String Customer_Photo) {
        this.Customer_Photo = Customer_Photo;
    }

    public void setNameNonEng(String NameNonEng) {
        this.NameNonEng = NameNonEng;
    }

    public void setFirstNameNonEng(String FirstNameNonEng) {
        this.FirstNameNonEng = FirstNameNonEng;
    }

    public void setLastNameNonEng(String LastNameNonEng) {
        this.LastNameNonEng = LastNameNonEng;
    }

    public void setMiddleNameNonEng(String MiddleNameNonEng) {
        this.MiddleNameNonEng = MiddleNameNonEng;
    }

    public void setLastName2(String LastName2) {
        this.LastName2 = LastName2;
    }

    public void setAddressNonEng(String AddressNonEng) {
        this.AddressNonEng = AddressNonEng;
    }

    public void setAddressLine1NonEng(String AddressLine1NonEng) {
        this.AddressLine1NonEng = AddressLine1NonEng;
    }

    public void setAddressLine2NonEng(String AddressLine2NonEng) {
        this.AddressLine2NonEng = AddressLine2NonEng;
    }

    public void setIDNumberNonEng(String IDNumberNonEng) {
        this.IDNumberNonEng = IDNumberNonEng;
    }

    public void setIDNumber2NonEng(String IDNumber2NonEng) {
        this.IDNumber2NonEng = IDNumber2NonEng;
    }

    public void setDateofBirthNonEng(String DateofBirthNonEng) {
        this.DateofBirthNonEng = DateofBirthNonEng;
    }

    public void setExpiryDateNonEng(String ExpiryDateNonEng) {
        this.ExpiryDateNonEng = ExpiryDateNonEng;
    }

    public void setIssueDateNonEng(String IssueDateNonEng) {
        this.IssueDateNonEng = IssueDateNonEng;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setUnique_Customer_Number(String Unique_Customer_Number) {
        this.Unique_Customer_Number = Unique_Customer_Number;
    }

    public void setForm_State_Code(String Form_State_Code) {
        this.Form_State_Code = Form_State_Code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCURRENT_FORM_STATE_FOR_CALL() {
        return CURRENT_FORM_STATE_FOR_CALL;
    }

    public void setCURRENT_FORM_STATE_FOR_CALL(String CURRENT_FORM_STATE_FOR_CALL) {
        this.CURRENT_FORM_STATE_FOR_CALL = CURRENT_FORM_STATE_FOR_CALL;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, Form_Data.class);
    }
}
