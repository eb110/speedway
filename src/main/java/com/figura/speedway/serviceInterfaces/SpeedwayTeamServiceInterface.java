package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SpeedwayTeam;

public interface SpeedwayTeamServiceInterface {
    public SpeedwayTeam saveSpeedwayTeam(SpeedwayTeam speedway_team);
    public SpeedwayTeam getSpeedwayTeamByName(String name);
    public void deleteSpeedwayTeam(int id);
    public int getTheLastId();
}
