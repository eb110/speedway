package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SpeedwayMatchRider;

import java.util.OptionalInt;

public interface SpeedwayMatchRiderServiceInterface {

    public SpeedwayMatchRider saveSpeedwayMatchRider(SpeedwayMatchRider speedway_matchRider);
    public SpeedwayMatchRider getSpeedwayMatchRiderById(int id);

    public Iterable<SpeedwayMatchRider> getAllSpeedwayMatchRiders();
    public int getTheLastSpeedwayMatchRiderId();
}
