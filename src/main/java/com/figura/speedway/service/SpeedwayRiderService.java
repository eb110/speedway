package com.figura.speedway.service;

import com.figura.speedway.model.Speedway_rider;
import com.figura.speedway.repository.SpeedwayRiderRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayRiderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedwayRiderService implements SpeedwayRiderServiceInterface {

    @Autowired
    SpeedwayRiderRepository speedwayRiderRepository;

    @Override
    public Speedway_rider saveSpeedwayRider(Speedway_rider speedway_rider) {
        return speedwayRiderRepository.save(speedway_rider);
    }

    @Override
    public Iterable<Speedway_rider> getAllSpeedwayRiders() {
        return speedwayRiderRepository.findAll();
    }

    @Override
    public Speedway_rider getSpeedwayRiderById(int id) {
        return speedwayRiderRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSpeedwayRider(int id) {
        speedwayRiderRepository.deleteById(id);
    }

    @Override
    public void updateSpeedwayRider(Speedway_rider speedway_rider, int id) {
        Speedway_rider rider = speedwayRiderRepository.findById(id).orElse(null);
        if(rider != null)
            speedwayRiderRepository.save(speedway_rider);
    }
}
