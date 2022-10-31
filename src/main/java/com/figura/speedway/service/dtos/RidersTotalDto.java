package com.figura.speedway.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RidersTotalDto {
    private double points = 0;
    private int games = 0;
    private int bonuses = 0;
    private int heats = 0;
    private int fullPerfects = 0;
    private int paidPerfects = 0;
}
