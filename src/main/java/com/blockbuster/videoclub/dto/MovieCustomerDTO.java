package com.blockbuster.videoclub.dto;
import lombok.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MovieCustomerDTO {
    private Integer movieId;
    private String title;
    private String director;
    private String genre;
    private Date releaseYear;
    private String renterCustomerName;
    private Date returnDate;
    private Boolean isReturned;
}


