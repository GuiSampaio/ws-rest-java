package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RaceTable {
    private String season;
    private String round;
    private Race[] races;

    @JsonProperty("season")
    public String getSeason() { return season; }
    @JsonProperty("season")
    public void setSeason(String value) { this.season = value; }

    @JsonProperty("round")
    public String getRound() { return round; }
    @JsonProperty("round")
    public void setRound(String value) { this.round = value; }

    @JsonProperty("Races")
    public Race[] getRaces() { return races; }
    @JsonProperty("Races")
    public void setRaces(Race[] value) { this.races = value; }
}
