package com.figura.speedway.controller;

import com.figura.speedway.model.Speedway_match_rider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matchRider")
public class SpeedwayMatchRiderController {

    @Autowired
    SpeedwayMatchRiderController speedwayMatchRiderController;

    @GetMapping("/getMatchRiderById/{id}")
        public Speedway_match_rider getMatchRiderById(@PathVariable("id") int id){
            return speedwayMatchRiderController.getMatchRiderById(id);
    }
}
