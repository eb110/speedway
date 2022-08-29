package com.figura.speedway.controller;

import com.figura.speedway.dto.DtoSpeedwayMatch;
import com.figura.speedway.model.Speedway_match;
import com.figura.speedway.model.Speedway_rider;
import com.figura.speedway.service.SpeedwayMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/sendMatchDetails")
    private String collectMatchDetails(@RequestBody DtoSpeedwayMatch dtoSpeedwayMatch){
        System.out.println("dto speedway match received");
        System.out.println(dtoSpeedwayMatch.getHomeId());
        return "dto speedway match has been received";
    }

}
