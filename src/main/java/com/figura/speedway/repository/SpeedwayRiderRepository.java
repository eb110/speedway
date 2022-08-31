package com.figura.speedway.repository;

import com.figura.speedway.model.Speedway_rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SpeedwayRiderRepository extends JpaRepository <Speedway_rider, Integer> {
    Optional<Speedway_rider> findBySurname(String surname);

   // @Query("SELECT sr from speedway_rider sr where sr.surname==?1")
    @Query(value="SELECT * from speedway_rider sr where sr.surname=?1", nativeQuery = true)
    List<Speedway_rider> getRidersBySurname(String surname);
}
