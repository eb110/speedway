package com.figura.speedway.service;

import com.figura.speedway.model.SpeedwayRider;
import com.figura.speedway.model.TotalResult;
import com.figura.speedway.repository.TotalResultRepository;
import com.figura.speedway.service.dtos.RidersTotalDto;
import com.figura.speedway.serviceInterfaces.TotalResultServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Optional;

@Service
public class TotalResultService implements TotalResultServiceInterface {

    @Autowired
    TotalResultRepository totalResultRepository;
    @Autowired
    SpeedwayRiderService speedwayRiderService;

    public RidersTotalDto calculateRiders() {
        Iterable<SpeedwayRider> riders = speedwayRiderService.getAllSpeedwayRiders();
        RidersTotalDto ridersTotalDto = new RidersTotalDto();
        double pts = 0;
        int bns = 0;
        int gms = 0;
        int fp = 0;
        int pp = 0;
        int hts = 0;
        Iterator<SpeedwayRider> iter = riders.iterator();
        while(iter.hasNext()){
            SpeedwayRider sr = iter.next();
            pts += sr.getPoints();
            bns += sr.getBonuses();
            gms += sr.getGames();
            fp += sr.getFullPerfects();
            pp += sr.getPaidPerfects();
            hts += sr.getHeats();
        }
        ridersTotalDto.setBonuses(bns);
        ridersTotalDto.setHeats(hts);
        ridersTotalDto.setGames(gms);
        ridersTotalDto.setPoints(pts);
        ridersTotalDto.setFullPerfects(fp);
        ridersTotalDto.setPaidPerfects(pp);
        return ridersTotalDto;
    }

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
        calculateRiders();
        return totalResultRepository.findById(id);
    }


}
