package com.figura.speedway.controller;

import com.figura.speedway.model.Speedway_match;
import com.figura.speedway.service.SpeedwayMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match")
public class SpeedwayMatchController {


    @Autowired
    SpeedwayMatchService speedwayMatchService;

    @GetMapping("/getMatchById/{id}")
        public Speedway_match getMatchById(@PathVariable("id") int id){
            return speedwayMatchService.getSpeedwayMatchById(id);
    }
}
