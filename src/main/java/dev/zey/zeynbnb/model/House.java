package dev.zey.zeynbnb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


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
}
