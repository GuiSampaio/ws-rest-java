package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String lat;
    private String locationLong;
    private String locality;
    private String country;

    @JsonProperty("lat")
    public String getLat() { return lat; }
    @JsonProperty("lat")
    public void setLat(String value) { this.lat = value; }

    @JsonProperty("long")
    public String getLocationLong() { return locationLong; }
    @JsonProperty("long")
    public void setLocationLong(String value) { this.locationLong = value; }

    @JsonProperty("locality")
    public String getLocality() { return locality; }
    @JsonProperty("locality")
    public void setLocality(String value) { this.locality = value; }

    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }
}
