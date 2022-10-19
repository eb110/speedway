package com.figura.speedway.repository;

import com.figura.speedway.model.SpeedwayRider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface SpeedwayRiderRepository extends JpaRepository <SpeedwayRider, Integer> {

    @Query(value="SELECT * from speedway_rider sr where sr.surname=?1", nativeQuery = true)
    List<SpeedwayRider> getRidersBySurname(String surname);
    @Query(value="SELECT max(id) FROM speedway_rider", nativeQuery = true)
    int getLastId();
    @Query(value="SELECT * FROM speedway_rider WHERE id=(SELECT max(id) FROM speedway_rider)", nativeQuery = true)
    SpeedwayRider getLastRider();
}
