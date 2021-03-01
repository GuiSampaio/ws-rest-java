package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FastestLap {
	
    private String rank;
    private String lap;
    private FastestLapTime time;
    private AverageSpeed averageSpeed;

    @JsonProperty("rank")
    public String getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(String value) { this.rank = value; }

    @JsonProperty("lap")
    public String getLap() { return lap; }
    @JsonProperty("lap")
    public void setLap(String value) { this.lap = value; }

    @JsonProperty("Time")
    public FastestLapTime getTime() { return time; }
    @JsonProperty("Time")
    public void setTime(FastestLapTime value) { this.time = value; }

    @JsonProperty("AverageSpeed")
    public AverageSpeed getAverageSpeed() { return averageSpeed; }
    @JsonProperty("AverageSpeed")
    public void setAverageSpeed(AverageSpeed value) { this.averageSpeed = value; }
}
