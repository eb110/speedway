package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SpeedwayMatch;
import com.figura.speedway.model.SpeedwayRider;

import java.util.Optional;

public interface SpeedwayMatchServiceInterface {

    public SpeedwayMatch saveSpeedwayMatch(SpeedwayMatch speedway_match);
    public Optional<SpeedwayMatch> getSpeedwayMatchById(int id);
    public Iterable<SpeedwayMatch> getAllSpeedwayMatches();
    public int getTheLastSpeedwayMatchId();
    public SpeedwayMatch getLastMatch();

}
