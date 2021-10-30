package com.xyz.shows.management.helpers;

import com.xyz.shows.management.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHelper {

    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    public ResponseEntity<Error> handleInvalidInput(HttpMessageNotReadableException ex) {
        return new ResponseEntity<>(new Error().description(ex.getMessage()).code("Bad_Request"), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Error> handleAllExceptions(Exception ex) {
        //TODO: Remove printstackTrace
        ex.printStackTrace();
        return new ResponseEntity<>(new Error().code("Internal_Server_Error").description("Something went wrong. Kindly try again"),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
