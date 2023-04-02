package dev.zey.zeynbnb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateHouseRequest {
    private String listingTitle;
    private String city;
    private String description;
    private String amenities;
    private Integer maxPeople;
}
