package com.figura.speedway.service;

import com.figura.speedway.model.SpeedwayMatchRider;
import com.figura.speedway.repository.SpeedwayMatchRiderRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayMatchRiderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.OptionalInt;

@Service
public class SpeedwayMatchRiderService implements SpeedwayMatchRiderServiceInterface {

    @Autowired
    SpeedwayMatchRiderRepository speedwayMatchRiderRepository;


    @Override
    public SpeedwayMatchRider saveSpeedwayMatchRider(SpeedwayMatchRider speedway_matchRider) {
        return speedwayMatchRiderRepository.save(speedway_matchRider);
    }

    @Override
    public SpeedwayMatchRider getSpeedwayMatchRiderById(int id) {
        return speedwayMatchRiderRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<SpeedwayMatchRider> getAllSpeedwayMatchRiders() {
        return speedwayMatchRiderRepository.findAll();
    }

    @Override
    public int getTheLastSpeedwayMatchRiderId() {
        return speedwayMatchRiderRepository.getLastId();
    }
}
