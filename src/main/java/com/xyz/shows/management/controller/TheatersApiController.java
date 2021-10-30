package com.xyz.shows.management.controller;

import com.google.common.collect.Lists;
import com.xyz.shows.management.api.TheatersApi;
import com.xyz.shows.management.dao.entities.Cinema;
import com.xyz.shows.management.dao.repository.TheaterRepository;
import com.xyz.shows.management.model.Error;
import com.xyz.shows.management.model.Theater;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static com.xyz.shows.management.helpers.Converter.getTheaterDto;

@RestController
public class TheatersApiController implements TheatersApi {

    @Autowired
    private TheaterRepository theaterRepository;

    public ResponseEntity<Theater> getTheaterDetails(@ApiParam(value = "Id of a Theater",required=true) @PathVariable("theaterId") Long theaterId
    ) {
        Optional<com.xyz.shows.management.dao.entities.Theater> theaterDao  = theaterRepository.findById(theaterId.intValue());
        if(theaterDao.isEmpty()) {
            Error error = new Error().code("Not_Found").description("Theater with Id:" + theaterId + " not found in inventory");
            return new ResponseEntity(error, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(getTheaterDto(theaterDao.get(), Lists.newArrayList(theaterDao.get().getScreens())), HttpStatus.OK);
    }
}
