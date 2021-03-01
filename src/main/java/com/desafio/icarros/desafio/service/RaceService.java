package com.desafio.icarros.desafio.service;

import java.util.Map;

import com.desafio.icarros.desafio.dto.RaceDTO;
import com.desafio.icarros.desafio.exception.RaceException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface RaceService {

	RaceDTO findRaceByYearAndRound(Map<String, String> requestParams)
			throws RaceException, JsonMappingException, JsonProcessingException;

	RaceDTO findStandingsBySeasonAndRound(Map<String, String> requestParams)
			throws RaceException, JsonProcessingException;

}
