package com.figura.speedway.service;

import com.figura.speedway.model.SpeedwayMatch;
import com.figura.speedway.repository.SpeedwayMatchRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayMatchServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedwayMatchService implements SpeedwayMatchServiceInterface {

    @Autowired
    SpeedwayMatchRepository speedwayMatchRepository;

    @Override
    public SpeedwayMatch saveSpeedwayMatch(SpeedwayMatch speedway_match) {
        return speedwayMatchRepository.save(speedway_match);
    }

    @Override
    public SpeedwayMatch getSpeedwayMatchById(int id) {
        return speedwayMatchRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<SpeedwayMatch> getAllSpeedwayMatches(){
        return speedwayMatchRepository.findAll();
    }

    @Override
    public int getTheLastSpeedwayMatchId(){
        return speedwayMatchRepository.getLastId();
    }
}
