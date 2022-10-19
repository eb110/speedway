package com.figura.speedway.controller;

import com.figura.speedway.model.SpeedwayTeam;
import com.figura.speedway.service.SpeedwayTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<SpeedwayTeam> getTeam(@PathVariable("name") String name){
        Optional<SpeedwayTeam> st = speedwayTeamService.getSpeedwayTeamByName(name);
        if(!st.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(st.get());
    }
    @DeleteMapping(value = "/deleteTeam/{id}")
    public void deleteTeam(@PathVariable("id") int id) {speedwayTeamService.deleteSpeedwayTeam(id);}

    @GetMapping("/getLastId")
    public int getLastId(){
        int res = speedwayTeamService.getTheLastId();
        return res;
    }

    @GetMapping("/getAllTeams")
    public List<SpeedwayTeam> getAllTeams(){
        return speedwayTeamService.getAllTeams();
    }
}
