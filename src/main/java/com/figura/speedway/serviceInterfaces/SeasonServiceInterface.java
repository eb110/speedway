package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.Season;

import java.util.Optional;

public interface SeasonServiceInterface {

    public Season saveSeason(Season season);
    public Optional<Season> getSeasonById(int id);
    public Optional<Season> getSeasonByYear(int year);
    public void updateTopLeagueState(Season season);
}
