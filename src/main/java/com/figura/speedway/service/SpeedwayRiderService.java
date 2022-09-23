package com.figura.speedway.service;

import com.figura.speedway.model.SpeedwayRider;
import com.figura.speedway.repository.SpeedwayRiderRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayRiderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeedwayRiderService implements SpeedwayRiderServiceInterface {

    @Autowired
    SpeedwayRiderRepository speedwayRiderRepository;
    @Override
    public SpeedwayRider saveSpeedwayRider(SpeedwayRider speedway_rider) {
        return speedwayRiderRepository.save(speedway_rider);
    }
    @Override
    public Iterable<SpeedwayRider> getAllSpeedwayRiders() {
        return speedwayRiderRepository.findAll();
    }
    @Override
    public SpeedwayRider getSpeedwayRiderById(int id) {
        return speedwayRiderRepository.findById(id).orElseThrow();
    }
    public SpeedwayRider getSpeedwayRiderBySurname(String surname){ return speedwayRiderRepository.findBySurname(surname).orElseThrow(); }
    public List<SpeedwayRider> getSpeedwayRidersBySurname(String surname){ return speedwayRiderRepository.getRidersBySurname(surname); }
    @Override
    public void deleteSpeedwayRider(int id) {
        speedwayRiderRepository.deleteById(id);
    }
    @Override
    public void updateSpeedwayRider(SpeedwayRider speedway_rider) {speedwayRiderRepository.save(speedway_rider); }
    @Override
    public int getLastId() {
        return speedwayRiderRepository.getLastId();
    }
    @Override
    public SpeedwayRider getLastRider() {
        return speedwayRiderRepository.getLastRider();
    }
}
