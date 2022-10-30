package com.figura.speedway.service;

import com.figura.speedway.model.TotalResult;
import com.figura.speedway.repository.TotalResultRepository;
import com.figura.speedway.serviceInterfaces.TotalResultServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TotalResultService implements TotalResultServiceInterface {

    @Autowired
    TotalResultRepository totalResultRepository;

    @Override
    public TotalResult saveTotalResult(TotalResult totalResult) {
        return totalResultRepository.save(totalResult);
    }

    @Override
    public void updateTotalResult(TotalResult totalResult) {
        totalResultRepository.save(totalResult);
    }

    @Override
    public Optional<TotalResult> getTotalResultById(int id) {
        return totalResultRepository.findById(id);
    }


}
