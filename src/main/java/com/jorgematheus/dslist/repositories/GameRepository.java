package com.jorgematheus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorgematheus.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
