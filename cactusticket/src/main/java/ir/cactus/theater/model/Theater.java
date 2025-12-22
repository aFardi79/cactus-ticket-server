package ir.cactus.theater.model;


import ir.cactus.commons.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Theater")
public class Theater extends BaseEntity {
    private List<Hall> hall;
    private String theaterName;

    @Column(name = "hall")
    @OneToMany
    public List<Hall> getHall() {
        return hall;
    }

    public void setHall(List<Hall> hall) {
        this.hall = hall;
    }

    @Column(name = "theaterName")
    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
}
