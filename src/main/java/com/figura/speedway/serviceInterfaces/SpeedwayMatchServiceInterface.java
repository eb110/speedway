package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SpeedwayMatch;

public interface SpeedwayMatchServiceInterface {

    public SpeedwayMatch saveSpeedwayMatch(SpeedwayMatch speedway_match);
    public SpeedwayMatch getSpeedwayMatchById(int id);
    public Iterable<SpeedwayMatch> getAllSpeedwayMatches();
    public int getTheLastSpeedwayMatchId();
}
