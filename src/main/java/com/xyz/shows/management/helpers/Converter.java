package com.xyz.shows.management.helpers;

import com.xyz.shows.management.dao.entities.Offers;
import com.xyz.shows.management.dao.entities.Screen;
import com.xyz.shows.management.dao.entities.Shows;
import com.xyz.shows.management.model.Cinema;
import com.xyz.shows.management.model.Show;
import com.xyz.shows.management.model.ShowOffer;
import com.xyz.shows.management.model.Theater;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Converter {


    private static final LocalTime AFTERNOON = LocalTime.of(12, 0, 0);
    private static final LocalTime EVENING = LocalTime.of(17, 0, 0);
    public static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static List<ShowOffer> getShowOfferDtos(Set<Offers> offers) {
        if(!CollectionUtils.isEmpty(offers)) {
            return offers.stream().map(offer -> new ShowOffer().code(offer.getCode()).description(offer.getDescription()))
                                  .collect(Collectors.toList());
        }
        return null;
    }

    public static Integer applyDiscount(Integer price, Integer numberOfTicketsReqd, LocalDateTime showTime, Set<Offers> offers) {
        if(!CollectionUtils.isEmpty(offers)) {
            //TODO: Need to better code as offers can be dynamic. Drools ?
            for(Offers offer : offers) {
                if (offer.getCode().equalsIgnoreCase("OFFER-20TICKET")
                    && between(showTime.toLocalTime(), AFTERNOON, EVENING)) {
                   price =  ( price * 20) * numberOfTicketsReqd / 100 ;
                }
                if(offer.getCode().equalsIgnoreCase("OFFER-3TICKET")
                    && numberOfTicketsReqd > 2) {
                    var noOf3rdTicketDiscounts = numberOfTicketsReqd / 3;
                    var remainingTickets = numberOfTicketsReqd - noOf3rdTicketDiscounts;
                    price = ( price * remainingTickets) + (price * 50 ) * noOf3rdTicketDiscounts / 100;
                }
            }
        }
        return price;
    }

    private static boolean between(LocalTime time, LocalTime start, LocalTime end) {
        return time.isBefore(end) && time.isAfter(start);
    }

    public static Show getShowsDto(Shows savedShow, Integer numberOfTicketsReqd) {
        Show showDto = new Show();
        showDto.setShowId(Long.valueOf(savedShow.getId()));
        showDto.setTheater(getTheaterDto(savedShow.getScreen().getTheater(), Arrays.asList(savedShow.getScreen())));
        showDto.setCinema(getCinemaDto(savedShow.getCinema()));
        showDto.setShowTotalPrice(Long.valueOf(savedShow.getShowPrice()));
        showDto.setDiscountedTotalPrice(Long.valueOf(applyDiscount(savedShow.getShowPrice(), numberOfTicketsReqd,
                savedShow.getShowTime(), savedShow.getShowOffers())));
        showDto.setShowTime(savedShow.getShowTime().format(DATE_FORMATTER));
        showDto.setShowOffers(getShowOfferDtos(savedShow.getShowOffers()));
        return showDto;
    }

    public static Theater getTheaterDto(com.xyz.shows.management.dao.entities.Theater theaterDao,
                                        List<Screen> screenDaos) {
        Theater theater = new Theater();
        theater.setId(Long.valueOf(theaterDao.getId()));
        theater.setName(theaterDao.getName());
        theater.setAddress1(theaterDao.getAddress1());
        theater.setAddress2(theaterDao.getAddress2());
        theater.setCity(theaterDao.getCity());
        theater.setPhone(theaterDao.getPhone());
        theater.setState(theaterDao.getState());
        theater.setZip(theaterDao.getZip());
        theater.setCategory(theaterDao.getCategory());

        if(!CollectionUtils.isEmpty(screenDaos)) {
            theater.setScreens(screenDaos.stream().map(screenDao -> new com.xyz.shows.management.model.Screen()
                    .name(screenDao.getName())
                    .seatCapacity(Long.valueOf(screenDao.getSeatCapacity())))
                    .collect(Collectors.toList()));
        }

        return theater;
    }


    public static Cinema getCinemaDto(com.xyz.shows.management.dao.entities.Cinema cinemaDao) {
        Cinema cinema = new Cinema();
        cinema.setId(Long.valueOf(cinemaDao.getId()));
        cinema.setName(cinemaDao.getName());
        cinema.setDescription(cinemaDao.getDescription());
        cinema.setCastMembers(cinemaDao.getCastMembers());
        cinema.setGenre(cinemaDao.getGenre());
        cinema.setLanguages(cinemaDao.getLanguages());
        cinema.setDurationInMins(Long.valueOf(cinemaDao.getDurationInMins()));
        return cinema;
    }


    public static com.xyz.shows.management.dao.entities.Cinema getCinemaDao(Cinema cinema) {
        com.xyz.shows.management.dao.entities.Cinema cinemaDao = new com.xyz.shows.management.dao.entities.Cinema();
        cinemaDao.setName(cinema.getName());
        cinemaDao.setDescription(cinema.getDescription());
        cinemaDao.setCastMembers(cinema.getCastMembers());
        cinemaDao.setGenre(cinema.getGenre());
        cinemaDao.setLanguages(cinema.getLanguages());
        cinemaDao.setDurationInMins(cinema.getDurationInMins().intValue());
        return cinemaDao;
    }


}
