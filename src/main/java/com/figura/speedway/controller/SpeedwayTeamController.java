package com.figura.speedway.controller;

import com.figura.speedway.model.SpeedwayTeam;
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
    private String add(@RequestBody SpeedwayTeam speedway_team){
        speedwayTeamService.saveSpeedwayTeam(speedway_team);
        return "the team has been added to the data base";
    }

    @GetMapping("/getByName/{name}")
    public SpeedwayTeam getTeam(@PathVariable("name") String name){
        return speedwayTeamService.getSpeedwayTeamByName(name);
    }
    @DeleteMapping(value = "/deleteTeam/{id}")
    public void deleteTeam(@PathVariable("id") int id) {speedwayTeamService.deleteSpeedwayTeam(id);}

    @GetMapping("/getLastId")
    public int getLastId(){
        int res = speedwayTeamService.getTheLastId();
        return res;
    }
}
