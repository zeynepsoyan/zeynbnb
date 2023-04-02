package dev.zey.zeynbnb.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Booking {
    @Id
    @SequenceGenerator(
            name = "booking_id_sequence",
            sequenceName = "booking_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "booking_id_sequence"
    )
    private String bookingId;
    private Integer houseId;
    private String peopleList;
    private String date;

    public Booking(String bookingId, Integer houseId, String peopleList, String date) {
        this.bookingId = bookingId;
        this.houseId = houseId;
        this.peopleList = peopleList;
        this.date = date;
    }

    public Booking() {
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(String peopleList) {
        this.peopleList = peopleList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingId, booking.bookingId) && Objects.equals(houseId, booking.houseId) && Objects.equals(peopleList, booking.peopleList) && Objects.equals(date, booking.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, houseId, peopleList, date);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", houseId=" + houseId +
                ", peopleList='" + peopleList + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
