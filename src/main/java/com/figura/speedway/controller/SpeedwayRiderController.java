package com.figura.speedway.controller;

import com.figura.speedway.model.Speedway_rider;
import com.figura.speedway.service.SpeedwayRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rider")
public class SpeedwayRiderController {

    @Autowired
    SpeedwayRiderService speedwayRiderService;

    @CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("/getBySurname/{surname}")
    public Speedway_rider getRider(@PathVariable("surname") String surname){
        return speedwayRiderService.getSpeedwayRiderBySurname(surname);
    }

    @GetMapping("/getAllBySurname/{surname}")
    public List<Speedway_rider> getRidersBySurname(@PathVariable("surname") String surname){
        return speedwayRiderService.getSpeedwayRidersBySurname(surname);
    }

    @DeleteMapping(value = "/deleteRider/{id}")
    public void deleteRider(@PathVariable("id") int id){
        speedwayRiderService.deleteSpeedwayRider(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updateRider/{id}")
    public String updateRider(@RequestBody Speedway_rider speedway_rider, @PathVariable("id") int id){
        speedwayRiderService.updateSpeedwayRider(speedway_rider, id);
        return "the rider has been updated";
    }

}
