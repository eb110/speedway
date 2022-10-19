package com.figura.speedway.service;

import com.figura.speedway.model.Season;
import com.figura.speedway.repository.SeasonRepository;
import com.figura.speedway.serviceInterfaces.SeasonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeasonService implements SeasonServiceInterface {

    @Autowired
    SeasonRepository seasonRepository;

    @Override
    public Season saveSeason(Season season) {
        return seasonRepository.save(season);
    }

    @Override
    public Optional<Season> getSeasonById(int id) {
        return seasonRepository.findById(id);
    }

    @Override
    public Optional<Season> getSeasonByYear(int year) {
        return seasonRepository.getSeasonByYear(year);
    }
}
