package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StandingsList {
    private String season;
    private String round;
    private DriverStanding[] driverStandings;

    @JsonProperty("season")
    public String getSeason() { return season; }
    @JsonProperty("season")
    public void setSeason(String value) { this.season = value; }

    @JsonProperty("round")
    public String getRound() { return round; }
    @JsonProperty("round")
    public void setRound(String value) { this.round = value; }

    @JsonProperty("DriverStandings")
    public DriverStanding[] getDriverStandings() { return driverStandings; }
    @JsonProperty("DriverStandings")
    public void setDriverStandings(DriverStanding[] value) { this.driverStandings = value; }
}
