package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.Speedway_match;

public interface SpeedwayMatchServiceInterface {

    public Speedway_match saveSpeedwayMatch(Speedway_match speedway_match);
    public Speedway_match getSpeedwayMatchById(int id);
    public Iterable<Speedway_match> getAllSpeedwayMatches();
    public int getTheLastSpeedwayMatchId();
}
