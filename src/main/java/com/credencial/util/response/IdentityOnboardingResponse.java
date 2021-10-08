package com.credencial.util.response;

import com.credencial.util.JSonable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;

/**
 *
 * @author tecto
 */
public class IdentityOnboardingResponse implements Serializable, JSonable {

    private String formStatus;
    private String formId;
    private String productId;
    private String formKey;
    private String idType;
    private String idState;
    private String idCountry;
    private String name;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String address1;
    private String address2;
    private String Country;
    private String idNumber;
    private String idNumberMatchResult;
    private String idNumber1;
    private String idNumber2;
    private String idNumber3;
    private String validIdNumber;
    private String dateOfBirth;
    private String dateOfBirthFormatted;
    private String expirationDate;
    private String expirationDateFormatted;
    private String issueDate;
    private String issuingCountry;
    private String faceDetected;
    private String mrzValid;
    private String mrzData;
    private String faceVerificationStatus;
    private String manualReviewExecuted;
    private String imageFront;
    private String imageBack;
    private String imageProcessedFront;
    private String imageProcessedBack;
    private String customerPhoto;
    private String nameNonEng;
    private String firstNameNonEng;
    private String lastNameNonEng;
    private String middleNameNonEng;
    private String lastName2;
    private String addressNonEng;
    private String addressLine1NonEng;
    private String addressLine2NonEng;
    private String idNumberNonEng;
    private String idNumber2NonEng;
    private String dateofBirthNonEng;
    private String expiryDateNonEng;
    private String issueDateNonEng;
    private String gender;
    private String uniqueCustomerNumber;
    private String formStateCode;
    private String content;
    private String currentFormStateForCall;

    public String getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(String formStatus) {
        this.formStatus = formStatus;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFormKey() {
        return formKey;
    }

    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdState() {
        return idState;
    }

    public void setIdState(String idState) {
        this.idState = idState;
    }

    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumberMatchResult() {
        return idNumberMatchResult;
    }

    public void setIdNumberMatchResult(String idNumberMatchResult) {
        this.idNumberMatchResult = idNumberMatchResult;
    }

    public String getIdNumber1() {
        return idNumber1;
    }

    public void setIdNumber1(String idNumber1) {
        this.idNumber1 = idNumber1;
    }

    public String getIdNumber2() {
        return idNumber2;
    }

    public void setIdNumber2(String idNumber2) {
        this.idNumber2 = idNumber2;
    }

    public String getIdNumber3() {
        return idNumber3;
    }

    public void setIdNumber3(String idNumber3) {
        this.idNumber3 = idNumber3;
    }

    public String getValidIdNumber() {
        return validIdNumber;
    }

    public void setValidIdNumber(String validIdNumber) {
        this.validIdNumber = validIdNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirthFormatted() {
        return dateOfBirthFormatted;
    }

    public void setDateOfBirthFormatted(String dateOfBirthFormatted) {
        this.dateOfBirthFormatted = dateOfBirthFormatted;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDateFormatted() {
        return expirationDateFormatted;
    }

    public void setExpirationDateFormatted(String expirationDateFormatted) {
        this.expirationDateFormatted = expirationDateFormatted;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public String getFaceDetected() {
        return faceDetected;
    }

    public void setFaceDetected(String faceDetected) {
        this.faceDetected = faceDetected;
    }

    public String getMrzValid() {
        return mrzValid;
    }

    public void setMrzValid(String mrzValid) {
        this.mrzValid = mrzValid;
    }

    public String getMrzData() {
        return mrzData;
    }

    public void setMrzData(String mrzData) {
        this.mrzData = mrzData;
    }

    public String getFaceVerificationStatus() {
        return faceVerificationStatus;
    }

    public void setFaceVerificationStatus(String faceVerificationStatus) {
        this.faceVerificationStatus = faceVerificationStatus;
    }

    public String getManualReviewExecuted() {
        return manualReviewExecuted;
    }

    public void setManualReviewExecuted(String manualReviewExecuted) {
        this.manualReviewExecuted = manualReviewExecuted;
    }

    public String getImageFront() {
        return imageFront;
    }

    public void setImageFront(String imageFront) {
        this.imageFront = imageFront;
    }

    public String getImageBack() {
        return imageBack;
    }

    public void setImageBack(String imageBack) {
        this.imageBack = imageBack;
    }

    public String getImageProcessedFront() {
        return imageProcessedFront;
    }

    public void setImageProcessedFront(String imageProcessedFront) {
        this.imageProcessedFront = imageProcessedFront;
    }

    public String getImageProcessedBack() {
        return imageProcessedBack;
    }

    public void setImageProcessedBack(String imageProcessedBack) {
        this.imageProcessedBack = imageProcessedBack;
    }

    public String getCustomerPhoto() {
        return customerPhoto;
    }

    public void setCustomerPhoto(String customerPhoto) {
        this.customerPhoto = customerPhoto;
    }

    public String getNameNonEng() {
        return nameNonEng;
    }

    public void setNameNonEng(String nameNonEng) {
        this.nameNonEng = nameNonEng;
    }

    public String getFirstNameNonEng() {
        return firstNameNonEng;
    }

    public void setFirstNameNonEng(String firstNameNonEng) {
        this.firstNameNonEng = firstNameNonEng;
    }

    public String getLastNameNonEng() {
        return lastNameNonEng;
    }

    public void setLastNameNonEng(String lastNameNonEng) {
        this.lastNameNonEng = lastNameNonEng;
    }

    public String getMiddleNameNonEng() {
        return middleNameNonEng;
    }

    public void setMiddleNameNonEng(String middleNameNonEng) {
        this.middleNameNonEng = middleNameNonEng;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getAddressNonEng() {
        return addressNonEng;
    }

    public void setAddressNonEng(String addressNonEng) {
        this.addressNonEng = addressNonEng;
    }

    public String getAddressLine1NonEng() {
        return addressLine1NonEng;
    }

    public void setAddressLine1NonEng(String addressLine1NonEng) {
        this.addressLine1NonEng = addressLine1NonEng;
    }

    public String getAddressLine2NonEng() {
        return addressLine2NonEng;
    }

    public void setAddressLine2NonEng(String addressLine2NonEng) {
        this.addressLine2NonEng = addressLine2NonEng;
    }

    public String getIdNumberNonEng() {
        return idNumberNonEng;
    }

    public void setIdNumberNonEng(String idNumberNonEng) {
        this.idNumberNonEng = idNumberNonEng;
    }

    public String getIdNumber2NonEng() {
        return idNumber2NonEng;
    }

    public void setIdNumber2NonEng(String idNumber2NonEng) {
        this.idNumber2NonEng = idNumber2NonEng;
    }

    public String getDateofBirthNonEng() {
        return dateofBirthNonEng;
    }

    public void setDateofBirthNonEng(String dateofBirthNonEng) {
        this.dateofBirthNonEng = dateofBirthNonEng;
    }

    public String getExpiryDateNonEng() {
        return expiryDateNonEng;
    }

    public void setExpiryDateNonEng(String expiryDateNonEng) {
        this.expiryDateNonEng = expiryDateNonEng;
    }

    public String getIssueDateNonEng() {
        return issueDateNonEng;
    }

    public void setIssueDateNonEng(String issueDateNonEng) {
        this.issueDateNonEng = issueDateNonEng;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUniqueCustomerNumber() {
        return uniqueCustomerNumber;
    }

    public void setUniqueCustomerNumber(String uniqueCustomerNumber) {
        this.uniqueCustomerNumber = uniqueCustomerNumber;
    }

    public String getFormStateCode() {
        return formStateCode;
    }

    public void setFormStateCode(String formStateCode) {
        this.formStateCode = formStateCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCurrentFormStateForCall() {
        return currentFormStateForCall;
    }

    public void setCurrentFormStateForCall(String currentFormStateForCall) {
        this.currentFormStateForCall = currentFormStateForCall;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.toJson(this);
    }

    @Override
    public Object fromJSON(String message) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        return gson.fromJson(message, IdentityOnboardingResponse.class);
    }

}
