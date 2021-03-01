package com.desafio.icarros.desafio.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.icarros.desafio.dto.RaceDTO;
import com.desafio.icarros.desafio.exception.RaceException;
import com.desafio.icarros.desafio.service.RaceService;

@RestController
@RequestMapping(value = "/")
public class RaceController {

	@Autowired
	private RaceService raceService;

	@GetMapping(path = "findF1RacesBySeasonAndRound")
	public ResponseEntity<?> findF1RacesBySeasonAndRound(@RequestParam Map<String, String> requestParams) {
		try {
			RaceDTO race = raceService.findRaceByYearAndRound(requestParams);
			return new ResponseEntity<>(race, HttpStatus.OK);
		} catch (RaceException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

	@GetMapping(path = "findF1StandingsBySeasonAndRound")
	public ResponseEntity<?> findStandingsBySeasonAndRound(@RequestParam Map<String, String> requestParams) {
		try {
			RaceDTO race = raceService.findStandingsBySeasonAndRound(requestParams);
			return new ResponseEntity<>(race, HttpStatus.OK);
		} catch (RaceException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
