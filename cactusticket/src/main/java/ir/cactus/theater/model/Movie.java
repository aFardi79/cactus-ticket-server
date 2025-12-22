package ir.cactus.theater.model;


import ir.cactus.commons.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "Movie")
public class Movie extends BaseEntity {
    private String movieName;
    private double moviePrice;


    @Column(name = "movieName")
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Column(name = "moviePrice")
    public double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }
}
