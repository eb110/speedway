package com.figura.speedway.controller;

import com.figura.speedway.model.SeasonGames;
import com.figura.speedway.service.SeasonGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/seasonGames")
public class SeasonGamesController {

    @Autowired
    SeasonGamesService seasonGamesService;

    @GetMapping("/getSeasonGamesById/{id}")
    public ResponseEntity<SeasonGames> getSeasonById(@PathVariable("id") int id){
        Optional<SeasonGames> sg = seasonGamesService.getSeasonGamesById(id);
        if(!sg.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(sg.get());
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addSeasonGames")
    private String saveSeasonGames(@RequestBody SeasonGames seasonGames){
        seasonGamesService.saveSeasonGames(seasonGames);
        return "season games has been added to the db";
    }
}
