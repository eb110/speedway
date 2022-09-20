package com.figura.speedway.repository;

import com.figura.speedway.model.SpeedwayMatchRider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SpeedwayMatchRiderRepository extends JpaRepository<SpeedwayMatchRider, Integer> {

    @Query(value="SELECT max(id) FROM speedway_match_rider", nativeQuery = true)
    int getLastId();

}

