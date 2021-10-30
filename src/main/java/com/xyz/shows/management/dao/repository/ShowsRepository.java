package com.xyz.shows.management.dao.repository;

import com.xyz.shows.management.dao.entities.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ShowsRepository extends JpaRepository<Shows, Integer> {

    List<Shows> findByCinemaIdAndScreenIdAndShowTime(Integer cinemaId, Integer screenId, LocalDateTime showTime);
}
