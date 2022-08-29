package com.figura.speedway.businessLogic;

import com.figura.speedway.dto.DtoRider;
import com.figura.speedway.dto.DtoSpeedwayMatch;

import java.util.List;

public class MatchResultCalculator {

    public MatchResultCalculator (DtoSpeedwayMatch dtoSpeedwayMatch){
        calculateTeamResult(dtoSpeedwayMatch.getAwayRiders(), 1);
    }

    private void calculateTeamResult(List<DtoRider> team, int homeAway){
        double teamPoints = 0;
        for(int i = 0; i < team.size(); i++){
            DtoRider rider = team.get(i);
            double point = 0;
            int bonus = 0;
            int heats = 0;
            int perfect = 0;
            int paidPerfect = 0;

            String[] points = rider.getPkt().split(",");

            for(int j = 0; j < points.length; j++){
                String heat = points[j];
                double pointTemp = 0;
                if(heat.contains(".")) {
                    pointTemp = Double.parseDouble(heat.substring(0, 3));
                }
                else if(Character.isDigit(heat.charAt(0))){
                    pointTemp = heat.charAt(0) + 48;
                }
                if(heat.contains("*"))
                    bonus++;
                point += pointTemp;
                teamPoints += pointTemp;
                heats++;
            }
            if(heats == 5 && point == 15){
                perfect++;
            }
            else if(heats == 5 && point + bonus == 15) {
                paidPerfect++;
            }
            System.out.println("next player");
        }
    }
}
