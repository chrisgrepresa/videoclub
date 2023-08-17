package com.blockbuster.videoclub.dao;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "movie_id")
    private Integer movieId;

    @Column (name = "director")
    private String director;

    @Column (name = "duration_minutes")
    private Integer durationMinutes;

    @Column (name = "genre")
    private String genre;

    @Temporal(TemporalType.DATE)
    @Column (name = "release_year")
    private Date releaseYear;

    @Column (name = "title")
    private String title;

    @OneToMany(mappedBy= "movie")
    private List<MovieRental> movieRentals;

    public Movie() {
    }

    public Movie(Integer movieId, String director, Integer durationMinutes, String genre, Date releaseYear, String title, List<MovieRental> movieRentals) {
        this.movieId = movieId;
        this.director = director;
        this.durationMinutes = durationMinutes;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.title = title;
        this.movieRentals = movieRentals;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MovieRental> getMovieRentals() {
        return movieRentals;
    }

    public void setMovieRentals(List<MovieRental> movieRentals) {
        this.movieRentals = movieRentals;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", director='" + director + '\'' +
                ", durationMinutes=" + durationMinutes +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", title='" + title + '\'' +
                ", movieRentals=" + movieRentals +
                '}';
    }
}
