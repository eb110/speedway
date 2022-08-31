package com.figura.speedway.service;

import com.figura.speedway.model.Speedway_match_rider;
import com.figura.speedway.repository.SpeedwayMatchRiderRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayMatchRiderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedwayMatchRiderService implements SpeedwayMatchRiderServiceInterface {

    @Autowired
    SpeedwayMatchRiderRepository speedwayMatchRiderRepository;


    @Override
    public Speedway_match_rider saveSpeedwayMatchRider(Speedway_match_rider speedway_match_rider) {
        return speedwayMatchRiderRepository.save(speedway_match_rider);
    }

    @Override
    public Speedway_match_rider getSpeedwayMatchRiderById(int id) {
        return speedwayMatchRiderRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Speedway_match_rider> getAllSpeedwayMatchRiders() {
        return speedwayMatchRiderRepository.findAll();
    }

    @Override
    public int getTheLastSpeedwayMatchRiderId() {
        return speedwayMatchRiderRepository.getLastId();
    }
}
