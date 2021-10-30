package com.xyz.shows.management.service;

import com.xyz.shows.management.dao.repository.CinemaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public void getAllCinemas(){
        var list = cinemaRepository.findAll();
        list.forEach(System.out::println);
    }
}
