package com.desafio.icarros.desafio.service;

import com.desafio.icarros.desafio.dto.RaceDTO;
import com.desafio.icarros.desafio.exception.RaceException;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RaceApiService {

	<T> RaceDTO findResults(String year, String round, String result)
			throws RaceException, JsonProcessingException;

}
