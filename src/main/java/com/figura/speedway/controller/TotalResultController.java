package com.figura.speedway.controller;

import com.figura.speedway.model.TotalResult;
import com.figura.speedway.service.TotalResultService;
import com.figura.speedway.service.dtos.RidersTotalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/totalResult")
public class TotalResultController {

    @Autowired
    TotalResultService totalResultService;
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/insertTotalResult")
    private String add(@RequestBody TotalResult totalResult){
        totalResultService.saveTotalResult(totalResult);
        return "total result has been created";
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<TotalResult> getTotalResult(@PathVariable("id") int id){
        Optional<TotalResult> tr = totalResultService.getTotalResultById(id);
        if(!tr.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(tr.get());
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updateTotalResult")
    public String updateTotalResult(@RequestBody TotalResult totalResult){
        totalResultService.updateTotalResult(totalResult);
        return "total result has been updated";
    }

    @GetMapping("/getTotalOfAllRiders")
    public ResponseEntity<RidersTotalDto> calculateAllRiders(){
        RidersTotalDto tr = totalResultService.calculateRiders();
        return ResponseEntity.status(HttpStatus.OK).body(tr);
    }

}
