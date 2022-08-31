package com.figura.speedway.repository;

import com.figura.speedway.model.Inserted_match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InsertedMatchesRepository extends JpaRepository <Inserted_match, Integer> {

    @Query(value="select * from inserted_match im where im.name=?1", nativeQuery = true)
    List<Inserted_match> checkIfAlreadyExist(String name);
}
