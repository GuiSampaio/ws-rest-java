package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StandingsTable {
    private String season;
    private String round;
    private StandingsList[] standingsLists;

    @JsonProperty("season")
    public String getSeason() { return season; }
    @JsonProperty("season")
    public void setSeason(String value) { this.season = value; }

    @JsonProperty("round")
    public String getRound() { return round; }
    @JsonProperty("round")
    public void setRound(String value) { this.round = value; }

    @JsonProperty("StandingsLists")
    public StandingsList[] getStandingsLists() { return standingsLists; }
    @JsonProperty("StandingsLists")
    public void setStandingsLists(StandingsList[] value) { this.standingsLists = value; }
}
