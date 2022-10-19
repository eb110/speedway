package com.figura.speedway.repository;

import com.figura.speedway.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SeasonRepository extends JpaRepository<Season, Integer> {

    @Query(value="SELECT * from season sn where sn.year=?1", nativeQuery = true)
    Optional<Season> getSeasonByYear(int year);
}
