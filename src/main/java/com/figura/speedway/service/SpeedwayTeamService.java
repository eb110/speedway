package com.figura.speedway.service;

import com.figura.speedway.exception.SpeedwayTeamNotFoundException;
import com.figura.speedway.model.SpeedwayTeam;
import com.figura.speedway.repository.SpeedwayTeamRepository;
import com.figura.speedway.serviceInterfaces.SpeedwayTeamServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpeedwayTeamService implements SpeedwayTeamServiceInterface {

    @Autowired
    SpeedwayTeamRepository speedwayTeamRepository;

    @Override
    public SpeedwayTeam saveSpeedwayTeam(SpeedwayTeam speedway_team) {
        return speedwayTeamRepository.save(speedway_team);
    }

    @Override
    public Optional<SpeedwayTeam> getSpeedwayTeamByName(String name) {
        return speedwayTeamRepository.findByName(name);
    }

    @Override
    public void deleteSpeedwayTeam(int id) {speedwayTeamRepository.deleteById(id);}

    @Override
    public int getTheLastId() {
        return speedwayTeamRepository.getLastId();
    }

    @Override
    public List<SpeedwayTeam> getAllTeams() {
        return speedwayTeamRepository.findAll();
    }


}
