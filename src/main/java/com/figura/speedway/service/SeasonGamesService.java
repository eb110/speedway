package com.figura.speedway.service;

import com.figura.speedway.model.SeasonGames;
import com.figura.speedway.repository.SeasonGamesRepository;
import com.figura.speedway.serviceInterfaces.SeasonGamesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeasonGamesService implements SeasonGamesServiceInterface {

    @Autowired
    SeasonGamesRepository seasonGamesRepository;

    @Override
    public SeasonGames saveSeasonGames(SeasonGames seasonGames) {
        return seasonGamesRepository.save(seasonGames);
    }

    @Override
    public Optional<SeasonGames> getSeasonGamesById(int id) {
        return seasonGamesRepository.findById(id);
    }
}
