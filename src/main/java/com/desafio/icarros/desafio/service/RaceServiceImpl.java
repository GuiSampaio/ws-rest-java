package com.desafio.icarros.desafio.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.icarros.desafio.dto.RaceDTO;
import com.desafio.icarros.desafio.exception.RaceException;
import com.desafio.icarros.desafio.util.Messages;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class RaceServiceImpl implements RaceService {

	@Autowired
	private RaceApiService raceApiService;

	@Override
	public RaceDTO findRaceByYearAndRound(Map<String, String> requestParams)
			throws RaceException, JsonProcessingException {

		validarFiltro(requestParams);

		String year = requestParams.get("year");
		String round = requestParams.get("round");
		String result = "results.json";

		RaceDTO race = raceApiService.findResults(year, round, result);

		return race;
	}

	@Override
	public RaceDTO findStandingsBySeasonAndRound(Map<String, String> requestParams)
			throws RaceException, JsonProcessingException {

		validarFiltro(requestParams);

		String year = requestParams.get("year");
		String round = requestParams.get("round");
		String result = "driverStandings.json";

		RaceDTO race = raceApiService.findResults(year, round, result);

		return race;

	}

	private void validarFiltro(Map<String, String> requestParams) throws RaceException {
		if (!requestParams.containsKey("year")) {
			throw new RaceException(Messages.EMPTY_YEAR);
		}

		if (!requestParams.containsKey("round")) {
			throw new RaceException(Messages.EMPTY_ROUND);
		}
	}

}
