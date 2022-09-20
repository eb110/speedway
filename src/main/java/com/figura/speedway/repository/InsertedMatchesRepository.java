package com.figura.speedway.repository;

import com.figura.speedway.model.InsertedMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InsertedMatchesRepository extends JpaRepository <InsertedMatch, Integer> {

    @Query(value="select * from inserted_match im where im.name=?1", nativeQuery = true)
    List<InsertedMatch> checkIfAlreadyExist(String name);
}
