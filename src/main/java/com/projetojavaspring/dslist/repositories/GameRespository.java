package com.projetojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetojavaspring.dslist.entities.Game;

public interface GameRespository extends JpaRepository<Game, Long>{
    
    
} 


