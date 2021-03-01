package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Constructor {

    private String name;
    private String nationality;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("nationality")
    public String getNationality() { return nationality; }
    @JsonProperty("nationality")
    public void setNationality(String value) { this.nationality = value; }
}
