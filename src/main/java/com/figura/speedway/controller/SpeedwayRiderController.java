package com.figura.speedway.controller;

import com.figura.speedway.model.SpeedwayRider;
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
    private String add(@RequestBody SpeedwayRider speedway_rider){
        speedwayRiderService.saveSpeedwayRider(speedway_rider);
        return "the rider has been added to the data base";
    }
    @GetMapping("/getAllRiders")
        public Iterable<SpeedwayRider> getAllRidersFrom(){
            return speedwayRiderService.getAllSpeedwayRiders();
        }
    @GetMapping("/getById/{id}")
    public SpeedwayRider getRider(@PathVariable("id") int id){
        return speedwayRiderService.getSpeedwayRiderById(id);
    }
    @GetMapping("/getBySurname/{surname}")
    public SpeedwayRider getRider(@PathVariable("surname") String surname){
        return speedwayRiderService.getSpeedwayRiderBySurname(surname);
    }
    @GetMapping("/getAllBySurname/{surname}")
    public List<SpeedwayRider> getRidersBySurname(@PathVariable("surname") String surname){
        return speedwayRiderService.getSpeedwayRidersBySurname(surname);
    }
    @DeleteMapping(value = "/deleteRider/{id}")
    public void deleteRider(@PathVariable("id") int id){
        speedwayRiderService.deleteSpeedwayRider(id);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updateRider")
    public String updateRider(@RequestBody SpeedwayRider speedway_rider){
        speedwayRiderService.updateSpeedwayRider(speedway_rider);
        return "the rider has been updated";
    }
    @GetMapping("/getLastRiderId")
    public int getLastMatchId(){
        int res = speedwayRiderService.getLastId();
        return res;
    }
    @GetMapping("/getLastRider")
    public SpeedwayRider getLastRider(){
        return speedwayRiderService.getLastRider();
    }

}
