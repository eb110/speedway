package com.figura.speedway.repository;

import com.figura.speedway.model.Speedway_team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SpeedwayTeamRepository extends JpaRepository <Speedway_team, Integer> {

    Optional<Speedway_team> findByName(String name);

}
