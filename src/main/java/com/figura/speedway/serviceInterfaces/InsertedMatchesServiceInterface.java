package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.InsertedMatch;

public interface InsertedMatchesServiceInterface {

    public InsertedMatch saveInsertedMatch(InsertedMatch inserted_match);
    public Boolean checkIfAlreadyExist (String name);
}
