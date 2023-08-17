package com.blockbuster.videoclub.dao;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "movie_rentals")
public class MovieRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Integer rentalId;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "rented_on")
    private Date rentedOn;
    @Column(name = "due_return_date")
    private Date dueReturnDate;

    @Column(name = "is_returned")
    private Boolean isReturned;



}
