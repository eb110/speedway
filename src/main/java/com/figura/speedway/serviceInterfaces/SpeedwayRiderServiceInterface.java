package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SpeedwayRider;

import java.util.List;

public interface SpeedwayRiderServiceInterface {

    public SpeedwayRider saveSpeedwayRider(SpeedwayRider speedway_rider);
    public Iterable<SpeedwayRider> getAllSpeedwayRiders();
    public SpeedwayRider getSpeedwayRiderById(int id);
    public SpeedwayRider getSpeedwayRiderBySurname(String surname);
    public List<SpeedwayRider> getSpeedwayRidersBySurname(String surname);
    public void deleteSpeedwayRider(int id);
    public void updateSpeedwayRider(SpeedwayRider speedway_rider);
    public int getLastId();
    public SpeedwayRider getLastRider();

}
