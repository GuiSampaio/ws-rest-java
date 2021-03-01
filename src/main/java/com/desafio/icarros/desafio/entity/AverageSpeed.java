package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AverageSpeed {
    private Units units;
    private String speed;

    @JsonProperty("units")
    public Units getUnits() { return units; }
    @JsonProperty("units")
    public void setUnits(Units value) { this.units = value; }

    @JsonProperty("speed")
    public String getSpeed() { return speed; }
    @JsonProperty("speed")
    public void setSpeed(String value) { this.speed = value; }
}
