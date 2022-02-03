package by.bsuir.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "table_of_contens")
    private String tableOfContens;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name="users_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="movies_id")
    private Movie movie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableOfContens() {
        return tableOfContens;
    }

    public void setTableOfContens(String tableOfContens) {
        this.tableOfContens = tableOfContens;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
