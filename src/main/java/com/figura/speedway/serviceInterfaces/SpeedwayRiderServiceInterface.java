package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.Speedway_rider;

import java.util.List;

public interface SpeedwayRiderServiceInterface {

    public Speedway_rider saveSpeedwayRider(Speedway_rider speedway_rider);

    public Iterable<Speedway_rider> getAllSpeedwayRiders();

    public Speedway_rider getSpeedwayRiderById(int id);
    public Speedway_rider getSpeedwayRiderBySurname(String surname);
    public List<Speedway_rider> getSpeedwayRidersBySurname(String surname);
    public void deleteSpeedwayRider(int id);

    public void updateSpeedwayRider(Speedway_rider  speedway_rider, int id);

}
