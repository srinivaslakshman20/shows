package com.xyz.shows.management.controller;

import com.xyz.shows.management.api.CinemasApi;
import com.xyz.shows.management.dao.repository.CinemaRepository;
import com.xyz.shows.management.model.Cinema;
import com.xyz.shows.management.model.Error;
import com.xyz.shows.management.model.CreateCinemaRequest;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

import static com.xyz.shows.management.helpers.Converter.getCinemaDao;
import static com.xyz.shows.management.helpers.Converter.getCinemaDto;

@RestController
@Slf4j
public class CinemasApiController implements CinemasApi {

    @Autowired
    private CinemaRepository cinemaRepository;

    public ResponseEntity<Cinema> addNewCinema(@ApiParam(value = "Request body for adding a new cinema to the inventory") @Valid @RequestBody CreateCinemaRequest body
    ) {
        if (!cinemaRepository.findByName(body.getCinema().getName()).isEmpty()) {
            Error error = new Error().code("Duplicate_object").description("Cinema '" + body.getCinema().getName() + "' already present in the inventory");
            return new ResponseEntity(error, HttpStatus.CONFLICT);
        }
        Cinema cinema = body.getCinema();
        com.xyz.shows.management.dao.entities.Cinema savedCinema = cinemaRepository.save(getCinemaDao(cinema));
        return new ResponseEntity(savedCinema, HttpStatus.OK);
    }

    public ResponseEntity<Cinema> getCinemaDetails(@ApiParam(value = "Id of a Cinema",required=true) @PathVariable("cinemaId") Long cinemaId
    ) {
        Optional<com.xyz.shows.management.dao.entities.Cinema> cinema  = cinemaRepository.findById(cinemaId.intValue());
        if(cinema.isEmpty()) {
            Error error = new Error().code("Not_Found").description("Cinema with Id:" + cinemaId + " not found in inventory");
            return new ResponseEntity(error, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(getCinemaDto(cinema.get()), HttpStatus.OK);
    }

}