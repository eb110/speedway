package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.SeasonGames;

import java.util.List;
import java.util.Optional;

public interface SeasonGamesServiceInterface {

    public SeasonGames saveSeasonGames(SeasonGames seasonGames);
    public Optional<SeasonGames> getSeasonGamesById(int id);

    public List<SeasonGames> getAllBySeasonId(int id);
}
