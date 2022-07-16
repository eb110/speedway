package com.figura.speedway.controller;

import com.figura.speedway.model.Speedway_rider;
import com.figura.speedway.service.SpeedwayRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rider")
public class SpeedwayRiderController {

    @Autowired
    SpeedwayRiderService speedwayRiderService;

    @PostMapping("/addRider")
    private String add(@RequestBody Speedway_rider speedway_rider){
        speedwayRiderService.saveSpeedwayRider(speedway_rider);
        return "the rider has been added to the data base";
    }

    @GetMapping("getAllRiders")
        public Iterable<Speedway_rider> getAllRidersFrom(){
            return speedwayRiderService.getAllSpeedwayRiders();
        }

    @GetMapping("/getById/{id}")
    public Speedway_rider getRider(@PathVariable("id") int id){
        return speedwayRiderService.getSpeedwayRiderById(id);
    }

    @DeleteMapping(value = "/deleteRider/{id}")
    public void deleteRider(@PathVariable("id") int id){
        speedwayRiderService.deleteSpeedwayRider(id);
    }

    @PutMapping("/updateRider/{id}")
    public String updateRider(@RequestBody Speedway_rider speedway_rider, @PathVariable("id") int id){
        speedwayRiderService.updateSpeedwayRider(speedway_rider, id);
        return "the rider has been updated";
    }

}
