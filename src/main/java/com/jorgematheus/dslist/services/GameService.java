package com.jorgematheus.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.jorgematheus.dslist.dto.GameDTO;
import com.jorgematheus.dslist.dto.GameMinDTO;
import com.jorgematheus.dslist.entities.Game;
import com.jorgematheus.dslist.repositories.GameRepository;

import jakarta.transaction.Transactional;


@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GameDTO findById(@PathVariable Long listId) {
		Game result = gameRepository.findById(listId).get();
		return new GameDTO(result);
	}
	
	public List<GameMinDTO> findAll() {
		List<Game> obj = gameRepository.findAll();
		List<GameMinDTO> dto = obj.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
