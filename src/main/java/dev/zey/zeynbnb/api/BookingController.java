package dev.zey.zeynbnb.api;


import dev.zey.zeynbnb.model.Booking;
import dev.zey.zeynbnb.service.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/booking")
@RestController
public class BookingController {

    private final BookingServiceImpl bookingService;

    @Autowired
    public BookingController(BookingServiceImpl bookingService) {
        this.bookingService = bookingService;
    }

    public List<Booking> getBookingDetails(String bookingId) {
        return List.of();
    }

    public String makeBooking() {
        return "<bookingId>";
    }
}
