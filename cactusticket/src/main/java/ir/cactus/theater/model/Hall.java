package ir.cactus.theater.model;


import ir.cactus.commons.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hall")
public class Hall extends BaseEntity {

    private String hallName;


    @Column(name = "HallName")
    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
}
