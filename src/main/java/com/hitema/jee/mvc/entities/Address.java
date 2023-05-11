package com.hitema.jee.mvc.entities;

import com.vividsolutions.jts.geom.Geometry;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="address")
public class Address {

    @Id
        @Column(name="address_id")
            @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Geometry location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Geometry getLocation() {
        return location;
    }

    public void setLocation(Geometry location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", location=" + location +
                '}';
    }
}
