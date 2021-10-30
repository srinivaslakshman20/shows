package com.xyz.shows.management.dao.repository;

import com.xyz.shows.management.dao.entities.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {
}
