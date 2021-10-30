package com.xyz.shows.management.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.shows.management.api.ShowsApi;
import com.xyz.shows.management.dao.entities.*;
import com.xyz.shows.management.dao.repository.CinemaRepository;
import com.xyz.shows.management.dao.repository.ScreenRepository;
import com.xyz.shows.management.dao.repository.ShowsRepository;
import com.xyz.shows.management.dao.repository.TheaterRepository;
import com.xyz.shows.management.model.CreateShowRequest;
import com.xyz.shows.management.model.Error;
import com.xyz.shows.management.model.Show;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static com.xyz.shows.management.helpers.Converter.*;

@RestController
public class ShowsApiController implements ShowsApi {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private ShowsRepository showsRepository;

    @Autowired
    private ScreenRepository screenRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private TheaterRepository theaterRepository;

    public ResponseEntity<Show> getShowPerShowId(@ApiParam(value = "Id of a Show",required=true) @PathVariable("showId") Long showId
            ,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "numberOfTicketsReqd", required = true) Long numberOfTicketsReqd
    ) {

        Optional<Shows> show = showsRepository.findById(showId.intValue());
        if(show.isEmpty()) {
            Error error = new Error().code("Not_Found").description("Shows with Id:" + showId + " not found in inventory");
            return new ResponseEntity(error, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(getShowsDto(show.get(), numberOfTicketsReqd.intValue()), HttpStatus.OK);
    }

    public ResponseEntity<Show> addNewShow(@ApiParam(value = "Show that needs to be added to the inventory" ,required=true )  @Valid @RequestBody CreateShowRequest body
            ,@ApiParam(value = "Id of a screen",required=true) @PathVariable("screenId") Long screenId
            ,@ApiParam(value = "Id of a Cinema",required=true) @PathVariable("cinemaId") Long cinemaId
    ) {

        Optional<Cinema> cinemaOp = cinemaRepository.findById(cinemaId.intValue());
        if(cinemaOp.isEmpty()) {
            Error error = new Error().code("Not_Found").description("Cinema with Id:" + cinemaId + " not found in inventory");
            return new ResponseEntity(error, HttpStatus.NOT_FOUND);
        }

        Optional<Screen> screenOp = screenRepository.findById(screenId.intValue());
        if(screenOp.isEmpty()) {
            Error error = new Error().code("Not_Found").description("Screen with Id:" + screenId + " not found in inventory");
            return new ResponseEntity(error, HttpStatus.NOT_FOUND);
        }

        LocalDateTime dateTime = LocalDateTime.parse(body.getShowTime(), DATE_FORMATTER);

        List<Shows> showsList = showsRepository.findByCinemaIdAndScreenIdAndShowTime(cinemaId.intValue(), screenId.intValue(), dateTime);
        if(!showsList.isEmpty()) {
            Error error = new Error().code("Duplicate_object").description("Show with CinemaId:" + cinemaId
                    + " amd screenId: " + screenId + "already present in the inventory for show time: " + body.getShowTime());
            return new ResponseEntity(error, HttpStatus.CONFLICT);
        }

        Shows shows = new Shows();
        shows.setCinema(cinemaOp.get());
        shows.setScreen(screenOp.get());
        shows.setShowPrice(Integer.valueOf(body.getShowPrice()));
        shows.setShowTime(dateTime);

        Shows savedShow = showsRepository.save(shows);

        return new ResponseEntity(getShowsDto(savedShow, 1), HttpStatus.OK);
    }
}
