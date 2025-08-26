package com.projetojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetojavaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
    
} 


