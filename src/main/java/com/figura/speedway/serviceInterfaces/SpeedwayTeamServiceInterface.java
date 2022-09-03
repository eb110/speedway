package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.Speedway_team;

public interface SpeedwayTeamServiceInterface {
    public Speedway_team saveSpeedwayTeam(Speedway_team speedway_team);
    public Speedway_team getSpeedwayTeamByName(String name);
    public void deleteSpeedwayTeam(int id);
    public int getTheLastId();
}
