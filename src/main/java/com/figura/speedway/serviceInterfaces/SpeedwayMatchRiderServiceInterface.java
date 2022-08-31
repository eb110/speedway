package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.Speedway_match;
import com.figura.speedway.model.Speedway_match_rider;

public interface SpeedwayMatchRiderServiceInterface {

    public Speedway_match_rider saveSpeedwayMatchRider(Speedway_match_rider speedway_match_rider);
    public Speedway_match_rider getSpeedwayMatchRiderById(int id);
    public Iterable<Speedway_match_rider> getAllSpeedwayMatchRiders();
    public int getTheLastSpeedwayMatchRiderId();
}
