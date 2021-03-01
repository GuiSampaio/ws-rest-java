package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MRData {

    private String series;
    private RaceTable raceTable;
    private StandingsTable standingsTable;

    @JsonProperty("series")
    public String getSeries() { return series; }
    @JsonProperty("series")
    public void setSeries(String value) { this.series = value; }
    
    @JsonProperty("RaceTable")
    public RaceTable getRaceTable() { return raceTable; }
    @JsonProperty("RaceTable")
    public void setRaceTable(RaceTable value) { this.raceTable = value; }
    
    @JsonProperty("StandingsTable")
    public StandingsTable getStandingsTable() { return standingsTable; }
    @JsonProperty("StandingsTable")
    public void setStandingsTable(StandingsTable value) { this.standingsTable = value; }
}
