package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Circuit {

    private String circuitName;
    private Location location;

    @JsonProperty("circuitName")
    public String getCircuitName() { return circuitName; }
    @JsonProperty("circuitName")
    public void setCircuitName(String value) { this.circuitName = value; }

    @JsonProperty("Location")
    public Location getLocation() { return location; }
    @JsonProperty("Location")
    public void setLocation(Location value) { this.location = value; }
}
