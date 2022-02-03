package by.bsuir.web.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @ManyToOne
    @JoinColumn(name="type_of_movie_id")
    private TypeOfMovie typeOfMovie;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movies_id")
    private List<Review> reviews;
    @ManyToMany
    @JoinTable(
            name = "movies_has_staff",
            joinColumns = @JoinColumn(name = "movies_id"),
            inverseJoinColumns = @JoinColumn(name = "staff_id"))
    List<Staff> staff;
    @ManyToMany
    @JoinTable(
            name = "movies_has_genres",
            joinColumns = @JoinColumn(name = "movies_id"),
            inverseJoinColumns = @JoinColumn(name = "genres_id"))
    List<Genre> genres;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public TypeOfMovie getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(TypeOfMovie typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
