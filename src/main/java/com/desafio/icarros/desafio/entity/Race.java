package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;
import java.time.LocalDate;
import java.time.OffsetTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Race {
    private String season;
    private String round;
    private String raceName;
    private Circuit circuit;
    private String date;
    private String time;
    private Result[] results;

    @JsonProperty("season")
    public String getSeason() { return season; }
    @JsonProperty("season")
    public void setSeason(String value) { this.season = value; }

    @JsonProperty("round")
    public String getRound() { return round; }
    @JsonProperty("round")
    public void setRound(String value) { this.round = value; }

    @JsonProperty("raceName")
    public String getRaceName() { return raceName; }
    @JsonProperty("raceName")
    public void setRaceName(String value) { this.raceName = value; }

    @JsonProperty("Circuit")
    public Circuit getCircuit() { return circuit; }
    @JsonProperty("Circuit")
    public void setCircuit(Circuit value) { this.circuit = value; }

    @JsonProperty("date")
    public String getDate() { return date; }
    @JsonProperty("date")
    public void setDate(String value) { this.date = value; }

    @JsonProperty("time")
    public String getTime() { return time; }
    @JsonProperty("time")
    public void setTime(String value) { this.time = value; }

    @JsonProperty("Results")
    public Result[] getResults() { return results; }
    @JsonProperty("Results")
    public void setResults(Result[] value) { this.results = value; }
}
