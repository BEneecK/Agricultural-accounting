package by.bsuir.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;
    @Column(name = "age_limit")
    private int ageLimit;
    @Column(name = "duration")
    private int duration;
    @Column(name = "release_year")
    private int releaseYear;
    @Column(name = "rating")
    private double rating;
    @Column(name = "type_of_movie_id")
    private int typeOfMovieId;
}
