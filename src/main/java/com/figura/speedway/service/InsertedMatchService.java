package com.figura.speedway.service;

import com.figura.speedway.model.Inserted_match;
import com.figura.speedway.repository.InsertedMatchesRepository;
import com.figura.speedway.serviceInterfaces.InsertedMatchesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertedMatchService implements InsertedMatchesServiceInterface {

    @Autowired
    InsertedMatchesRepository insertedMatchesRepository;

    @Override
    public Inserted_match saveInsertedMatch(Inserted_match inserted_match) {
        return insertedMatchesRepository.save(inserted_match);
    }

    @Override
    public Boolean checkIfAlreadyExist(String name) {
        List<Inserted_match> listOfInsertedMatches = insertedMatchesRepository.checkIfAlreadyExist(name);
        if(listOfInsertedMatches.size() > 0)
            return true;
        return false;
    }
}
