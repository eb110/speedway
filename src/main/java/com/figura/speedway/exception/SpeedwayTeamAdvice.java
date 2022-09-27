package com.figura.speedway.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class SpeedwayTeamAdvice {

    @ResponseBody
    @ExceptionHandler(SpeedwayTeamNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String teamNotFoundByNameHandler(SpeedwayTeamNotFoundException ex){
        return ex.getMessage();
    }

}
