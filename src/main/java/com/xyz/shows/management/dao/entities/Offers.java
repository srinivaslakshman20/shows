package com.xyz.shows.management.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Offers")
@Getter
@Setter
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="offer_code")
    private String code;

    @Column(name="offer_description")
    private String description;

    @ManyToMany(mappedBy = "showOffers")
    private Set<Shows> shows;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Shows> getShows() {
        return shows;
    }

    public void setShows(Set<Shows> shows) {
        this.shows = shows;
    }
}
