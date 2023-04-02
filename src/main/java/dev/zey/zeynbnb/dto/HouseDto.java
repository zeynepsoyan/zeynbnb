package dev.zey.zeynbnb.dto;

import java.util.Date;
import java.util.List;

public class HouseDto {

    private String id;
    private String listingTitle;
    private String city;
    private String description;
    private List<String> amenities;
    private Integer maxPeople;
    private List<Date> bookedDates;

    public HouseDto(String id, String listingTitle, String city, String description, List<String> amenities, Integer maxPeople, List<Date> bookedDates) {
        this.id = id;
        this.listingTitle = listingTitle;
        this.city = city;
        this.description = description;
        this.amenities = amenities;
        this.maxPeople = maxPeople;
        this.bookedDates = bookedDates;
    }

    public HouseDto() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListingTitle() {
        return listingTitle;
    }

    public void setListingTitle(String listingTitle) {
        this.listingTitle = listingTitle;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public List<Date> getBookedDates() {
        return bookedDates;
    }

    public void setBookedDates(List<Date> bookedDates) {
        this.bookedDates = bookedDates;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", listingTitle='" + listingTitle + '\'' +
                ", city='" + city + '\'' +
                ", description='" + description + '\'' +
                ", amenities=" + amenities +
                ", maxPeople=" + maxPeople +
                ", bookedDates=" + bookedDates +
                '}';
    }
}
