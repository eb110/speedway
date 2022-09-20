package com.figura.speedway.repository;

import com.figura.speedway.model.SpeedwayTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SpeedwayTeamRepository extends JpaRepository <SpeedwayTeam, Integer> {

    Optional<SpeedwayTeam> findByName(String name);

    @Query(value="SELECT max(id) FROM speedway_team", nativeQuery = true)
    int getLastId();

}
