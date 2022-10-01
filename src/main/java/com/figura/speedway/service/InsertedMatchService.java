package com.figura.speedway.service;

import com.figura.speedway.model.InsertedMatch;
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
    public InsertedMatch saveInsertedMatch(InsertedMatch inserted_match) {
        System.out.println("test of safety precautions");
        return insertedMatchesRepository.save(inserted_match);
    }

    @Override
    public Boolean checkIfAlreadyExist(String name) {
        List<InsertedMatch> listOfInsertedMatches = insertedMatchesRepository.checkIfAlreadyExist(name);
        if(listOfInsertedMatches.size() > 0)
            return true;
        return false;
    }
}
