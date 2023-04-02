package dev.zey.zeynbnb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String listingTitle;
    private String city;
    private String description;
    private String amenities;
    private Integer maxPeople;
    @ElementCollection
    private List<Date> bookedDates;
}
