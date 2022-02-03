package by.bsuir.web.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "type_of_movie")
public class TypeOfMovie {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    private String type;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_of_movie_id")
    private List<Movie> movies = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
