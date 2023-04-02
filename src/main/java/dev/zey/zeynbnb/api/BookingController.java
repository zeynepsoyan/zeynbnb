package dev.zey.zeynbnb.api;

import dev.zey.zeynbnb.dto.BookingRequest;
import dev.zey.zeynbnb.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    // TODO: Authentication support
    @PostMapping(value = "/")
    public ResponseEntity<?> create(@RequestBody BookingRequest request) {
        return bookingService.create(request);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<?> getBookingDetails(@PathVariable("id") Long id) {
        return bookingService.getBookingDetails(id);
    }

}

