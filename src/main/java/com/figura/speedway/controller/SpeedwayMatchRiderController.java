package com.figura.speedway.controller;

import com.figura.speedway.dto.DtoSpeedwayMatch;
import com.figura.speedway.model.Speedway_match_rider;
import com.figura.speedway.model.Speedway_rider;
import com.figura.speedway.service.SpeedwayMatchRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
