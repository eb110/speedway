package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.Speedway_rider;

public interface SpeedwayRiderServiceInterface {

    public Speedway_rider saveSpeedwayRider(Speedway_rider speedway_rider);

    public Iterable<Speedway_rider> getAllSpeedwayRiders();

    public Speedway_rider getSpeedwayRiderById(int id);

    public void deleteSpeedwayRider(int id);

    public void updateSpeedwayRider(Speedway_rider  speedway_rider, int id);

}
