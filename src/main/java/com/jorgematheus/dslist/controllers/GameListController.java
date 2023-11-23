package com.jorgematheus.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorgematheus.dslist.dto.GameDTO;
import com.jorgematheus.dslist.dto.GameMinDTO;
import com.jorgematheus.dslist.entities.Game;
import com.jorgematheus.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameListController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	private ResponseEntity<List<GameMinDTO>> findAll() {
		List<GameMinDTO> obj = gameService.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO game = gameService.findById(id);
		return game;
	}
	
}