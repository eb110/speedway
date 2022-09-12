package com.figura.speedway.service;

import com.figura.speedway.model.Speedway_rider;
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

    public Speedway_rider getSpeedwayRiderBySurname(String surname){
        return speedwayRiderRepository.findBySurname(surname).orElse(null);
    }

    public List<Speedway_rider> getSpeedwayRidersBySurname(String surname){
        return speedwayRiderRepository.getRidersBySurname(surname);
    }

    @Override
    public void deleteSpeedwayRider(int id) {
        speedwayRiderRepository.deleteById(id);
    }

    @Override
    public void updateSpeedwayRider(Speedway_rider speedway_rider, int id) {
        Speedway_rider rider = speedwayRiderRepository.findById(id).orElse(null);
        if(rider != null) {
            speedway_rider.setId(id);
            speedwayRiderRepository.save(speedway_rider);
        }
    }

    @Override
    public int getLastId() {
        return speedwayRiderRepository.getLastId();
    }
}
