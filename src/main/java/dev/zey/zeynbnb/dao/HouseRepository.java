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

    @Query(value = "SELECT * FROM house h WHERE h.city = :city AND h.max_people >= :numPeople", nativeQuery = true)
    List<House> findByCityIgnoreCaseAndMaxPeopleLessThanEqual(@Param("city") String city, @Param("numPeople") Integer numPeople);

}
