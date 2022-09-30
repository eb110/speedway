package com.figura.speedway.controller;

import com.figura.speedway.model.SpeedwayRider;
import com.figura.speedway.service.SpeedwayRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<SpeedwayRider> getRider(@PathVariable("id") int id){
        Optional<SpeedwayRider> sr = speedwayRiderService.getSpeedwayRiderById(id);
        if(sr.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(sr.get());
    }
    @GetMapping("/getBySurname/{surname}")
    public ResponseEntity<SpeedwayRider> getRider(@PathVariable("surname") String surname){
        Optional<SpeedwayRider> sr = speedwayRiderService.getSpeedwayRiderBySurname(surname);
        if(sr.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(sr.get());
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
