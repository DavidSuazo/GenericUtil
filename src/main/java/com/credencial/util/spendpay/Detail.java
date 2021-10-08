package com.credencial.util.spendpay;

/**
 *
 * @author cj_sr
 */
public class Detail {
    
    private double amount;
    private String concept_id;
    private String concept_description;
    private String external_reference;
    private String collector_id;

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @return the concept_id
     */
    public String getConcept_id() {
        return concept_id;
    }

    /**
     * @return the concept_description
     */
    public String getConcept_description() {
        return concept_description;
    }

    /**
     * @return the external_reference
     */
    public String getExternal_reference() {
        return external_reference;
    }

    /**
     * @return the collector_id
     */
    public String getCollector_id() {
        return collector_id;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @param concept_id the concept_id to set
     */
    public void setConcept_id(String concept_id) {
        this.concept_id = concept_id;
    }

    /**
     * @param concept_description the concept_description to set
     */
    public void setConcept_description(String concept_description) {
        this.concept_description = concept_description;
    }

    /**
     * @param external_reference the external_reference to set
     */
    public void setExternal_reference(String external_reference) {
        this.external_reference = external_reference;
    }

    /**
     * @param collector_id the collector_id to set
     */
    public void setCollector_id(String collector_id) {
        this.collector_id = collector_id;
    }

}
