/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.15).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.xyz.shows.management.api;

import com.xyz.shows.management.model.Cinema;
import com.xyz.shows.management.model.CreateCinemaRequest;
import com.xyz.shows.management.model.CreateShowRequest;
import com.xyz.shows.management.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@Api(value = "cinemas", description = "the cinemas API")
public interface CinemasApi {

    Logger log = LoggerFactory.getLogger(CinemasApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a new Cinema", nickname = "addNewCinema", notes = "", response = Cinema.class, tags={ "Cinemas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Excepted response to a valid request", response = Cinema.class),
        @ApiResponse(code = 409, message = "Cinema already present in the inventory", response = Error.class),
        @ApiResponse(code = 400, message = "Incorrect request", response = Error.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Error.class) })
    @RequestMapping(value = "/cinemas",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Cinema> addNewCinema(@ApiParam(value = "Request body for adding a new cinema to the inventory"  )  @Valid @RequestBody CreateCinemaRequest body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"languages\" : \"English, Hindi\",\r\n  \"name\" : \"Fast and Furious 6\",\r\n  \"castMembers\" : \"Paul Walker, Vin Diesel, Michelle Rodriguez\",\r\n  \"genre\" : \"Action\",\r\n  \"description\" : \"Hobbs is tasked with catching a team of mercenary drivers who manage to evade him every time.\",\r\n  \"id\" : 345,\r\n  \"durationInMins\" : 112\r\n}", Cinema.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CinemasApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get Cinema details for a cinemaId", nickname = "getCinemaDetails", notes = "", response = Cinema.class, tags={ "Cinemas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success output", response = Cinema.class),
        @ApiResponse(code = 404, message = "Cinema not found in inventory", response = Error.class),
        @ApiResponse(code = 400, message = "Incorrect request", response = Error.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Error.class) })
    @RequestMapping(value = "/cinemas/{cinemaId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Cinema> getCinemaDetails(@ApiParam(value = "Id of a Cinema",required=true) @PathVariable("cinemaId") Long cinemaId
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"languages\" : \"English, Hindi\",\r\n  \"name\" : \"Fast and Furious 6\",\r\n  \"castMembers\" : \"Paul Walker, Vin Diesel, Michelle Rodriguez\",\r\n  \"genre\" : \"Action\",\r\n  \"description\" : \"Hobbs is tasked with catching a team of mercenary drivers who manage to evade him every time.\",\r\n  \"id\" : 345,\r\n  \"durationInMins\" : 112\r\n}", Cinema.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CinemasApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update Cinema details for a cinemaId", nickname = "updateCinemaDetails", notes = "", response = Cinema.class, tags={ "Cinemas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success output", response = Cinema.class),
        @ApiResponse(code = 404, message = "Cinema not found in inventory", response = Error.class),
        @ApiResponse(code = 400, message = "Incorrect request", response = Error.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Error.class) })
    @RequestMapping(value = "/cinemas/{cinemaId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Cinema> updateCinemaDetails(@ApiParam(value = "Id of a Cinema",required=true) @PathVariable("cinemaId") Long cinemaId
,@ApiParam(value = "Show that needs to be added to the inventory"  )  @Valid @RequestBody CreateShowRequest body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"languages\" : \"English, Hindi\",\r\n  \"name\" : \"Fast and Furious 6\",\r\n  \"castMembers\" : \"Paul Walker, Vin Diesel, Michelle Rodriguez\",\r\n  \"genre\" : \"Action\",\r\n  \"description\" : \"Hobbs is tasked with catching a team of mercenary drivers who manage to evade him every time.\",\r\n  \"id\" : 345,\r\n  \"durationInMins\" : 112\r\n}", Cinema.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CinemasApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
