package com.figura.speedway.controller;

import com.figura.speedway.model.SpeedwayMatchRider;
import com.figura.speedway.model.SpeedwayTeam;
import com.figura.speedway.service.SpeedwayMatchRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/matchRider")
public class SpeedwayMatchRiderController {

    @Autowired
    SpeedwayMatchRiderService speedwayMatchRiderService;

    @GetMapping("/getMatchRiderById/{id}")
        public ResponseEntity<SpeedwayMatchRider> getMatchRiderById(@PathVariable("id") int id){
            Optional<SpeedwayMatchRider> smr = speedwayMatchRiderService.getSpeedwayMatchRiderById(id);
            if(smr.isEmpty())
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

            return ResponseEntity.status(HttpStatus.OK).body(smr.get());
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
