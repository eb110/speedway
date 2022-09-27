package com.figura.speedway.repository;

import com.figura.speedway.model.SpeedwayMatch;
import com.figura.speedway.model.SpeedwayRider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SpeedwayMatchRepository extends JpaRepository<SpeedwayMatch, Integer> {

    @Query(value="SELECT max(id) FROM speedway_match", nativeQuery = true)
    int getLastId();

    @Query(value="SELECT * FROM speedway_match WHERE id=(SELECT max(id) FROM speedway_match)", nativeQuery = true)
    SpeedwayMatch getLastMatch();

}
