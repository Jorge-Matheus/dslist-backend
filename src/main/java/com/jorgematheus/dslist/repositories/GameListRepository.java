package com.jorgematheus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorgematheus.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
