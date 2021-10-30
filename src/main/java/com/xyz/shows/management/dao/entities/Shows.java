package com.xyz.shows.management.dao.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Table(name = "Shows")
@Getter
@Setter
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="cinema_id", nullable = false)
    private Cinema cinema;

    @ManyToOne
    @JoinColumn(name="screen_id", nullable = false)
    private Screen screen;

    @Column(name="show_price")
    private Integer showPrice;

    @Column(name="show_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime showTime;

    @ManyToMany
    @JoinTable(
            name = "shows_offers",
            joinColumns = @JoinColumn(name = "shows_id"),
            inverseJoinColumns = @JoinColumn(name = "offer_id")
    )
    private Set<Offers> showOffers;

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Integer getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Integer showPrice) {
        this.showPrice = showPrice;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }

    public Set<Offers> getShowOffers() {
        return showOffers;
    }

    public void setShowOffers(Set<Offers> showOffers) {
        this.showOffers = showOffers;
    }
}
