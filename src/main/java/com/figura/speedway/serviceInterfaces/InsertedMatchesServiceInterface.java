package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.Inserted_match;

import java.util.List;

public interface InsertedMatchesServiceInterface {

    public Inserted_match saveInsertedMatch(Inserted_match inserted_match);
    public Boolean checkIfAlreadyExist (String name);
}
