package com.figura.speedway.service;

import com.figura.speedway.model.SpeedwayTeam;
import com.figura.speedway.repository.SpeedwayTeamRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayTeamServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedwayTeamService implements SpeedwayTeamServiceInterface {

    @Autowired
    SpeedwayTeamRepository speedwayTeamRepository;

    @Override
    public SpeedwayTeam saveSpeedwayTeam(SpeedwayTeam speedway_team) {
        return speedwayTeamRepository.save(speedway_team);
    }

    @Override
    public SpeedwayTeam getSpeedwayTeamByName(String name) {
        return speedwayTeamRepository.findByName(name).orElseThrow();
    }

    @Override
    public void deleteSpeedwayTeam(int id) {speedwayTeamRepository.deleteById(id);}

    @Override
    public int getTheLastId() {
        return speedwayTeamRepository.getLastId();
    }


}
