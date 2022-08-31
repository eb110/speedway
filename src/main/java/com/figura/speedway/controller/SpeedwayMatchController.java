package com.figura.speedway.controller;


import com.figura.speedway.model.Speedway_match;
import com.figura.speedway.service.SpeedwayMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.OptionalInt;

@RestController
@RequestMapping("/match")
public class SpeedwayMatchController {

    @Autowired
    SpeedwayMatchService speedwayMatchService;

    @GetMapping("/getMatchById/{id}")
        public Speedway_match getMatchById(@PathVariable("id") int id){
            return speedwayMatchService.getSpeedwayMatchById(id);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addMatch")
    private String collectMatchDetails(@RequestBody Speedway_match speedway_match){
        speedwayMatchService.saveSpeedwayMatch(speedway_match);
        return "speedway match has been created";
    }
    @GetMapping("/getAllMatches")
    public Iterable<Speedway_match> getAllMatches(){
        return speedwayMatchService.getAllSpeedwayMatches();
    }
    @GetMapping("/getLastMatchId")
    public int getLastMatchId(){
        int res = speedwayMatchService.getTheLastSpeedwayMatchId();
        return res;
    }

}
