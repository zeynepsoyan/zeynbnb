package dev.zey.zeynbnb.dao;

import dev.zey.zeynbnb.model.House;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface HouseRepository extends JpaRepository<House,Long> {

    @Query(value = "SELECT * FROM house", countQuery = "SELECT count(*) FROM house", nativeQuery = true)
    Page<House> findAllWithPagination(Pageable pageable);

    @Query(value = "SELECT h.id, h.listing_title, h.city, h.description, h.amenities, h.max_people\n" +
            "        FROM house h\n" +
            "        LEFT JOIN booking b ON h.id = b.house_id\n" +
            "        WHERE LOWER(h.city) = LOWER(:city)\n" +
            "        AND h.max_people >= :numPeople\n" +
            "        AND NOT (COALESCE(b.from_date, '9999-12-31') <= :toDate AND COALESCE(b.to_date, '9999-12-31') >= :fromDate)", nativeQuery = true)
    List<House> findByCityIgnoreCaseAndMaxPeopleLessThanEqualAndDatesNotOverlap(
            @Param("city") String city,
            @Param("numPeople") Integer numPeople,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate);

}
