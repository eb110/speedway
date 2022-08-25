package com.figura.speedway.controller;

import com.figura.speedway.model.Speedway_rider;
import com.figura.speedway.model.Speedway_team;
import com.figura.speedway.service.SpeedwayTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/team")
public class SpeedwayTeamController {

    @Autowired
    SpeedwayTeamService speedwayTeamService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addTeam")
    private String add(@RequestBody Speedway_team speedway_team){
        speedwayTeamService.saveSpeedwayTeam(speedway_team);
        return "the team has been added to the data base";
    }

    @GetMapping("/getByName/{name}")
    public Speedway_team getTeam(@PathVariable("name") String name){
        return speedwayTeamService.getSpeedwayTeamByName(name);
    }
}
