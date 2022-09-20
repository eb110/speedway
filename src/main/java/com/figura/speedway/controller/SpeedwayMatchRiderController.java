package com.figura.speedway.controller;

import com.figura.speedway.model.SpeedwayMatchRider;
import com.figura.speedway.service.SpeedwayMatchRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matchRider")
public class SpeedwayMatchRiderController {

    @Autowired
    SpeedwayMatchRiderService speedwayMatchRiderService;

    @GetMapping("/getMatchRiderById/{id}")
        public SpeedwayMatchRider getMatchRiderById(@PathVariable("id") int id){
            return speedwayMatchRiderService.getSpeedwayMatchRiderById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addMatchRider")
    private String add(@RequestBody SpeedwayMatchRider speedway_matchRider){
        speedwayMatchRiderService.saveSpeedwayMatchRider(speedway_matchRider);
        return "the speedway match rider has been added to the data base";
    }
    @GetMapping("/getLastMatchRiderId")
    public int getLastMatchRiderId(){
        int res = speedwayMatchRiderService.getTheLastSpeedwayMatchRiderId();
        return res;
    }

}
