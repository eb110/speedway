package com.figura.speedway.controller;

import com.figura.speedway.model.Season;
import com.figura.speedway.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/season")
public class SeasonController {

    @Autowired
    SeasonService seasonService;

    @GetMapping("/getSeasonById/{id}")
    public ResponseEntity<Season> getSeasonById(@PathVariable("id") int id){
        Optional<Season> sn = seasonService.getSeasonById(id);
        if(!sn.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(sn.get());
    }

    @GetMapping("/getSeasonByYear/{year}")
    public ResponseEntity<Season> getSeasonByYear(@PathVariable("year") int year){
        Optional<Season> sn = seasonService.getSeasonByYear(year);
        if(!sn.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(sn.get());
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addSeason")
    private String saveSeason(@RequestBody Season season){
        seasonService.saveSeason(season);
        return "season has been added to the db";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updateSeasontopLeague")
    private String updateSeasonTopLeague(@RequestBody Season season){
        seasonService.updateTopLeagueState(season);
        return "season top league status set to true";
    }

}