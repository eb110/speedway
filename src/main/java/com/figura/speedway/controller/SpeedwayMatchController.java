package com.figura.speedway.controller;


import com.figura.speedway.model.SpeedwayMatch;
import com.figura.speedway.model.SpeedwayRider;
import com.figura.speedway.service.SpeedwayMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/match")
public class SpeedwayMatchController {

    @Autowired
    SpeedwayMatchService speedwayMatchService;

    @GetMapping("/getMatchById/{id}")
        public ResponseEntity<SpeedwayMatch> getMatchById(@PathVariable("id") int id){
            Optional<SpeedwayMatch> sm = speedwayMatchService.getSpeedwayMatchById(id);
            if(!sm.isPresent())
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

            return ResponseEntity.status(HttpStatus.OK).body(sm.get());
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addMatch")
    private String collectMatchDetails(@RequestBody SpeedwayMatch speedway_match){
        speedwayMatchService.saveSpeedwayMatch(speedway_match);
        return "speedway match has been created";
    }
    @GetMapping("/getAllMatches")
    public Iterable<SpeedwayMatch> getAllMatches(){
        return speedwayMatchService.getAllSpeedwayMatches();
    }
    @GetMapping("/getLastMatchId")
    public int getLastMatchId(){
        int res = speedwayMatchService.getTheLastSpeedwayMatchId();
        return res;
    }
    @GetMapping("/getLastMatch")
    public SpeedwayMatch getLastMatch(){
        return speedwayMatchService.getLastMatch();
    }

}
