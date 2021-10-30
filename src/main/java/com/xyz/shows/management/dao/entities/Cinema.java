package com.xyz.shows.management.dao.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Cinema")
@Getter
@Setter
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="cast_members")
    private String castMembers;

    @Column(name="genre")
    private String genre;

    @Column(name="languages")
    private String languages;

    @Column(name="duration_in_mins")
    private Integer durationInMins;

    @OneToMany(mappedBy = "cinema")
    private Set<Shows> shows;

    public Cinema() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(String castMembers) {
        this.castMembers = castMembers;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Integer getDurationInMins() {
        return durationInMins;
    }

    public void setDurationInMins(Integer durationInMins) {
        this.durationInMins = durationInMins;
    }

    public Set<Shows> getShows() {
        return shows;
    }

    public void setShows(Set<Shows> shows) {
        this.shows = shows;
    }
}
