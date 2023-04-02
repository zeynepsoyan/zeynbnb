package dev.zey.zeynbnb.dao;

import dev.zey.zeynbnb.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
