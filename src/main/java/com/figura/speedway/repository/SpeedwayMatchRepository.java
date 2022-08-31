package com.figura.speedway.repository;

import com.figura.speedway.model.Speedway_match;
import com.figura.speedway.model.Speedway_rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpeedwayMatchRepository extends JpaRepository<Speedway_match, Integer> {

    @Query(value="SELECT max(id) FROM speedway_match", nativeQuery = true)
    int getLastId();

}
