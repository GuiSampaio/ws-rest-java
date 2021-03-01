package com.desafio.icarros.desafio.dto;

import java.io.Serializable;

import com.desafio.icarros.desafio.entity.MRData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RaceDTO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MRData mrData;
    
    @JsonProperty("MRData")
    public MRData getMrData() { return mrData; }
    @JsonProperty("MRData")
    public void setMrData(MRData value) { this.mrData = value; }
    


    
	
}

