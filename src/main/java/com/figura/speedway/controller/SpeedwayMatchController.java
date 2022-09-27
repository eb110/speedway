package com.figura.speedway.controller;


import com.figura.speedway.model.SpeedwayMatch;
import com.figura.speedway.model.SpeedwayRider;
import com.figura.speedway.service.SpeedwayMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/match")
public class SpeedwayMatchController {

    @Autowired
    SpeedwayMatchService speedwayMatchService;

    @GetMapping("/getMatchById/{id}")
        public SpeedwayMatch getMatchById(@PathVariable("id") int id){
            return speedwayMatchService.getSpeedwayMatchById(id);
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
