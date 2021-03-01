package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultTime {
    private String millis;
    private String time;

    @JsonProperty("millis")
    public String getMillis() { return millis; }
    @JsonProperty("millis")
    public void setMillis(String value) { this.millis = value; }

    @JsonProperty("time")
    public String getTime() { return time; }
    @JsonProperty("time")
    public void setTime(String value) { this.time = value; }
}
