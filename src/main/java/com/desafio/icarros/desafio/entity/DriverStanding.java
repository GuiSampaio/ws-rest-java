package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverStanding {
	
    private String position;
    private String positionText;
    private String points;
    private String wins;
    private Driver driver;
    private Constructor[] constructors;

    @JsonProperty("position")
    public String getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(String value) { this.position = value; }

    @JsonProperty("positionText")
    public String getPositionText() { return positionText; }
    @JsonProperty("positionText")
    public void setPositionText(String value) { this.positionText = value; }

    @JsonProperty("points")
    public String getPoints() { return points; }
    @JsonProperty("points")
    public void setPoints(String value) { this.points = value; }

    @JsonProperty("wins")
    public String getWINS() { return wins; }
    @JsonProperty("wins")
    public void setWINS(String value) { this.wins = value; }

    @JsonProperty("Driver")
    public Driver getDriver() { return driver; }
    @JsonProperty("Driver")
    public void setDriver(Driver value) { this.driver = value; }

    @JsonProperty("Constructors")
    public Constructor[] getConstructors() { return constructors; }
    @JsonProperty("Constructors")
    public void setConstructors(Constructor[] value) { this.constructors = value; }
}
