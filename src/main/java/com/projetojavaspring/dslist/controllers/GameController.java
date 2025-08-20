package com.projetojavaspring.dslist.controllers;
import com.projetojavaspring.dslist.services.*;
import com.projetojavaspring.dslist.dto.GameMinDTO;
import com.projetojavaspring.dslist.entities.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findall();
        return result;
    }
}
