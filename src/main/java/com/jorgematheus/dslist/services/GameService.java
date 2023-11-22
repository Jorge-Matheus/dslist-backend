package com.jorgematheus.dslist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgematheus.dslist.dto.GameMinDTO;
import com.jorgematheus.dslist.entities.Game;
import com.jorgematheus.dslist.repositories.GameRepository;


@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> obj = gameRepository.findAll();
		List<GameMinDTO> dto = obj.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
