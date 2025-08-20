package com.projetojavaspring.dslist.services;
import java.util.List;
import com.projetojavaspring.dslist.dto.*;
import com.projetojavaspring.dslist.repositories.GameRespository;
import com.projetojavaspring.dslist.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {

    @Autowired
    private GameRespository gameRespository;

    public List<GameMinDTO> findall(){
        List<Game> result = gameRespository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
