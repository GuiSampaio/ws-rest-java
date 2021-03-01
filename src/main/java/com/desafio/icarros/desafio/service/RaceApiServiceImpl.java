package com.desafio.icarros.desafio.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.desafio.icarros.desafio.dto.RaceDTO;
import com.desafio.icarros.desafio.exception.RaceException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class RaceApiServiceImpl implements RaceApiService {

	@Value("${api.race}")
	private String raceUrl;

	@Override
	public <T> RaceDTO findResults(String year, String round, String result)
			throws RaceException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();

		URI uri = UriComponentsBuilder.fromHttpUrl(raceUrl)
				.path("/f1/")
				.path(year + "/")
				.path(round + "/")
				.path(result)
				.build()
				.toUri();

		ResponseEntity<Object> response = restTemplate.exchange(uri, HttpMethod.GET, createRequest(uri), 
				Object.class);

		RaceDTO dto = jsonToDto(new ObjectMapper().writeValueAsString(response.getBody()));

		return dto;
	}

	private static RequestEntity<?> createRequest(URI uri) {
		return RequestEntity.get(uri).header("user-agent", "").accept(MediaType.APPLICATION_JSON).build();
	}

	private RaceDTO jsonToDto(String json) throws RaceException {

		try {
			RaceDTO dto = new RaceDTO();

			ObjectMapper mapper = new ObjectMapper();

			dto = mapper.readValue(json, RaceDTO.class);

			return dto;
		} catch (Exception e) {
			throw new RaceException(e.getMessage());
		}
	}

}
