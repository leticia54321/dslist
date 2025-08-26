package com.projetojavaspring.dslist.services;
import java.util.List;
import com.projetojavaspring.dslist.dto.GameListDTO;
import com.projetojavaspring.dslist.repositories.GameListRepository;
import com.projetojavaspring.dslist.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findall(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
