package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SpeedwayMatchRider;

import java.util.Optional;
import java.util.OptionalInt;

public interface SpeedwayMatchRiderServiceInterface {

    public SpeedwayMatchRider saveSpeedwayMatchRider(SpeedwayMatchRider speedway_matchRider);
    public Optional<SpeedwayMatchRider> getSpeedwayMatchRiderById(int id);

    public Iterable<SpeedwayMatchRider> getAllSpeedwayMatchRiders();
    public int getTheLastSpeedwayMatchRiderId();
}
