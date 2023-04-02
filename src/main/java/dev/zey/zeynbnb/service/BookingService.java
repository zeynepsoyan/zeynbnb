package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dto.BookingRequest;
import org.springframework.http.ResponseEntity;


public interface BookingService {

    ResponseEntity<?> create(BookingRequest request);

    ResponseEntity<?> getBookingDetails(Long id);
}
