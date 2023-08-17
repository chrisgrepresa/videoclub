package com.blockbuster.videoclub.repository;

import com.blockbuster.videoclub.dao.Movie;
import com.blockbuster.videoclub.dto.MovieCustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    @Query("""
            SELECT new com.blockbuster.videoclub.dto.MovieCustomerDTO
            (m.movieId, m.title, m.director, m.genre, m.releaseYear, c.renterCustomerName, mr.returnDate, mr.isReturned)
            FROM movie m
            JOIN movieRental mr
            JOIN customer c
            WHERE m.movieId = :movieId
            """)
    List<MovieCustomerDTO> findMovieAndRenterCustomer(Integer movieId);

}
