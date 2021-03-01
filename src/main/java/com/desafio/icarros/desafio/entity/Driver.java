package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {

    private String givenName;
    private String familyName;
    private String dateOfBirth;
    private String nationality;

    @JsonProperty("givenName")
    public String getGivenName() { return givenName; }
    @JsonProperty("givenName")
    public void setGivenName(String value) { this.givenName = value; }

    @JsonProperty("familyName")
    public String getFamilyName() { return familyName; }
    @JsonProperty("familyName")
    public void setFamilyName(String value) { this.familyName = value; }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() { return dateOfBirth; }
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String value) { this.dateOfBirth = value; }

    @JsonProperty("nationality")
    public String getNationality() { return nationality; }
    @JsonProperty("nationality")
    public void setNationality(String value) { this.nationality = value; }
}
