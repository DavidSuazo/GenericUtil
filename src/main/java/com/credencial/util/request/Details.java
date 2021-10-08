package com.credencial.util.request;

/**
 *
 * @author cj_sr
 */
public class Details {

    private String payment_id;
    private String external_reference;
    private String concept_id;
    private String concept_description;
    private Float amount;
    private String collector_id;

    public String getPayment_id() {
        return payment_id;
    }

    public String getExternal_reference() {
        return external_reference;
    }

    public String getConcept_id() {
        return concept_id;
    }

    public String getConcept_description() {
        return concept_description;
    }

    public Float getAmount() {
        return amount;
    }

    public String getCollector_id() {
        return collector_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public void setExternal_reference(String external_reference) {
        this.external_reference = external_reference;
    }

    public void setConcept_id(String concept_id) {
        this.concept_id = concept_id;
    }

    public void setConcept_description(String concept_description) {
        this.concept_description = concept_description;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setCollector_id(String collector_id) {
        this.collector_id = collector_id;
    }

}
