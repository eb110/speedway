package com.figura.speedway.controller;

import com.figura.speedway.model.Speedway_match_rider;
import com.figura.speedway.service.SpeedwayMatchRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matchRider")
public class SpeedwayMatchRiderController {

    @Autowired
    SpeedwayMatchRiderService speedwayMatchRiderService;

    @GetMapping("/getMatchRiderById/{id}")
        public Speedway_match_rider getMatchRiderById(@PathVariable("id") int id){
            return speedwayMatchRiderService.getSpeedwayMatchRiderById(id);
    }
}
