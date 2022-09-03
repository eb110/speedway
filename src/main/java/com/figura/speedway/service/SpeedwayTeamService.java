package com.figura.speedway.service;

import com.figura.speedway.model.Speedway_team;
import com.figura.speedway.repository.SpeedwayTeamRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayTeamServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedwayTeamService implements SpeedwayTeamServiceInterface {

    @Autowired
    SpeedwayTeamRepository speedwayTeamRepository;

    @Override
    public Speedway_team saveSpeedwayTeam(Speedway_team speedway_team) {
        return speedwayTeamRepository.save(speedway_team);
    }

    @Override
    public Speedway_team getSpeedwayTeamByName(String name) {
        return speedwayTeamRepository.findByName(name).orElse(null);
    }

    @Override
    public void deleteSpeedwayTeam(int id) {speedwayTeamRepository.deleteById(id);}

    @Override
    public int getTheLastId() {
        return speedwayTeamRepository.getLastId();
    }


}
