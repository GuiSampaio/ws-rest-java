package com.desafio.icarros.desafio.entity;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private String number;
    private String position;
    private String positionText;
    private String points;
    private Driver driver;
    private Constructor constructor;
    private String grid;
    private String laps;
    private String status;
    private ResultTime time;
    private FastestLap fastestLap;

    @JsonProperty("number")
    public String getNumber() { return number; }
    @JsonProperty("number")
    public void setNumber(String value) { this.number = value; }

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

    @JsonProperty("Driver")
    public Driver getDriver() { return driver; }
    @JsonProperty("Driver")
    public void setDriver(Driver value) { this.driver = value; }

    @JsonProperty("Constructor")
    public Constructor getConstructor() { return constructor; }
    @JsonProperty("Constructor")
    public void setConstructor(Constructor value) { this.constructor = value; }

    @JsonProperty("grid")
    public String getGrid() { return grid; }
    @JsonProperty("grid")
    public void setGrid(String value) { this.grid = value; }

    @JsonProperty("laps")
    public String getLaps() { return laps; }
    @JsonProperty("laps")
    public void setLaps(String value) { this.laps = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("Time")
    public ResultTime getTime() { return time; }
    @JsonProperty("Time")
    public void setTime(ResultTime value) { this.time = value; }

    @JsonProperty("FastestLap")
    public FastestLap getFastestLap() { return fastestLap; }
    @JsonProperty("FastestLap")
    public void setFastestLap(FastestLap value) { this.fastestLap = value; }
}
