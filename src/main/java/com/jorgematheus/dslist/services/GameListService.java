package com.jorgematheus.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jorgematheus.dslist.dto.GameListDTO;
import com.jorgematheus.dslist.dto.GameMinDTO;
import com.jorgematheus.dslist.entities.GameList;
import com.jorgematheus.dslist.repositories.GameListRepository;


@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> obj = gameListRepository.findAll();
		return obj.stream().map(x -> new GameListDTO(x)).toList();
	}
}
