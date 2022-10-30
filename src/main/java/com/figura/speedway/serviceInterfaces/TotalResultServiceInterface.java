package com.figura.speedway.serviceInterfaces;

import com.figura.speedway.model.TotalResult;

import java.util.Optional;

public interface TotalResultServiceInterface {
    public TotalResult saveTotalResult(TotalResult totalResult);
    public void updateTotalResult(TotalResult totalResult);
    public Optional<TotalResult> getTotalResultById(int id);
}
