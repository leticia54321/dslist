package com.projetojavaspring.dslist.services;
import java.util.List;
import com.projetojavaspring.dslist.dto.*;
import com.projetojavaspring.dslist.repositories.GameRespository;
import com.projetojavaspring.dslist.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GameService {

    @Autowired
    private GameRespository gameRespository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRespository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findall(){
        List<Game> result = gameRespository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
