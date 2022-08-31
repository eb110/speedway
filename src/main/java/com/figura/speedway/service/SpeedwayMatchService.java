package com.figura.speedway.service;

import com.figura.speedway.model.Speedway_match;
import com.figura.speedway.repository.SpeedwayMatchRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayMatchServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class SpeedwayMatchService implements SpeedwayMatchServiceInterface {

    @Autowired
    SpeedwayMatchRepository speedwayMatchRepository;

    @Override
    public Speedway_match saveSpeedwayMatch(Speedway_match speedway_match) {
        return speedwayMatchRepository.save(speedway_match);
    }

    @Override
    public Speedway_match getSpeedwayMatchById(int id) {
        return speedwayMatchRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Speedway_match> getAllSpeedwayMatches(){
        return speedwayMatchRepository.findAll();
    }

    @Override
    public int getTheLastSpeedwayMatchId(){
        return speedwayMatchRepository.getLastId();
    }
}
