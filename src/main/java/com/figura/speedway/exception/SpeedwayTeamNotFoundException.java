package com.figura.speedway.exception;

public class SpeedwayTeamNotFoundException  extends RuntimeException{
    public SpeedwayTeamNotFoundException(String name){
        super("The team of name \"" + name + "\" doesn't exist");
    }
}
