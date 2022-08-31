package com.figura.speedway.controller;

import com.figura.speedway.model.Inserted_match;
import com.figura.speedway.service.InsertedMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insertedMatch")
public class InsertedMatchController {

    @Autowired
    InsertedMatchService insertedMatchService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/insertMatchName")
    private String add(@RequestBody Inserted_match inserted_match){
        insertedMatchService.saveInsertedMatch(inserted_match);
        return "the match name has been inserted";
    }

    @GetMapping("checkIfExist")
    public Boolean checkIfExist(@PathVariable("name") String name){
        return insertedMatchService.checkIfAlreadyExist(name);
        }
}
