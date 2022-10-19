package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SpeedwayTeam;

import java.util.List;
import java.util.Optional;

public interface SpeedwayTeamServiceInterface {
    public SpeedwayTeam saveSpeedwayTeam(SpeedwayTeam speedway_team);
    public Optional<SpeedwayTeam> getSpeedwayTeamByName(String name);
    public void deleteSpeedwayTeam(int id);
    public int getTheLastId();
    public List<SpeedwayTeam> getAllTeams();
}
