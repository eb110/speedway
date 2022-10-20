package com.figura.speedway.repository;

import com.figura.speedway.model.SeasonGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeasonGamesRepository extends JpaRepository<SeasonGames, Integer> {

    @Query(value="SELECT * from season_games sg where sg.season_id=?1", nativeQuery = true)
    List<SeasonGames> getAllBySeasonId(int id);

}
