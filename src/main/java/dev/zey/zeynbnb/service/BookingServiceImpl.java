package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dao.BookingRepository;
import dev.zey.zeynbnb.dto.BookingRequest;
import dev.zey.zeynbnb.model.Booking;
import dev.zey.zeynbnb.model.House;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public ResponseEntity<?> create(BookingRequest request) {
        Booking booking = createBooking(request);
        bookingRepository.save(booking);
        return ResponseEntity.ok()
                .header("Booking-Id")
                .header("Booking-HouseId")
                .header("Booking-PeopleNames")
                .build();
    }

    private Booking createBooking(BookingRequest request) {
        Booking booking = new Booking();
        booking.setHouseId(request.getHouseId());
        booking.setPeopleNames(request.getPeopleNames());
        return booking;
    }

    @Override
    public ResponseEntity<?> getBookingDetails(Long id) {
        return ResponseEntity.ok(bookingRepository.findById(id));
    }
}
