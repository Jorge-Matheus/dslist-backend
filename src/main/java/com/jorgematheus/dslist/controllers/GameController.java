package com.jorgematheus.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorgematheus.dslist.dto.GameListDTO;
import com.jorgematheus.dslist.dto.GameMinDTO;
import com.jorgematheus.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	private ResponseEntity<List<GameListDTO>> findAll() {
		List<GameListDTO> obj = gameListService.findAll();
		return ResponseEntity.ok().body(obj);
	}
}
