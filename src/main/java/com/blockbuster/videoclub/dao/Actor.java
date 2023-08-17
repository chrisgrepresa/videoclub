package com.blockbuster.videoclub.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "actor_id")
    private Integer actorId;

    @Column (name = "actor_name")
    private String actorName;

    @Column (name = "film")
    private String film;

    @Column (name = "role")
    private String role;

    @Temporal(TemporalType.DATE)
    @Column (name = "birth_date")
    private Date birthDate;

    @Column (name = "nationality")
    private String nationality;

    public Actor(Integer actorId, String actorName, String film, String character, Date birthDate, String nationality) {
        this.actorId = actorId;
        this.actorName = actorName;
        this.film = film;
        this.role = character;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    public Actor() {
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", actorName='" + actorName + '\'' +
                ", film='" + film + '\'' +
                ", character='" + role + '\'' +
                ", birthDate=" + birthDate +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
