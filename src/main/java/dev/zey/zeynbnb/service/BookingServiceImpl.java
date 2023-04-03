package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dao.BookingRepository;
import dev.zey.zeynbnb.dto.BookingRequest;
import dev.zey.zeynbnb.model.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public ResponseEntity<?> create(BookingRequest request) {
        Booking booking = createBooking(request);
        bookingRepository.save(booking);
        ResponseEntity.ok()
                .header("Booking-BookingId")
                .header("Booking-HouseId")
                .header("Booking-PeopleNames")
                .header("Booking-FromDate")
                .header("Booking-ToDate")
                .build();
        return ResponseEntity.ok(bookingRepository.findById(booking.getId()));
    }

    private Booking createBooking(BookingRequest request) {
        Booking booking = new Booking();
        booking.setHouseId(request.getHouseId());
        booking.setPeopleNames(request.getPeopleNames());
        booking.setFromDate(request.getFromDate());
        booking.setToDate(request.getToDate());
        return booking;
    }

    @Override
    public ResponseEntity<?> getBookingDetails(Long id) {
        return ResponseEntity.ok(bookingRepository.findById(id));
    }
}
