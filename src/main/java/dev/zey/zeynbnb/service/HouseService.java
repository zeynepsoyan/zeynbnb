package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dto.CreateHouseRequest;
import dev.zey.zeynbnb.dto.QueryHouseRequest;
import dev.zey.zeynbnb.model.House;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;

public interface HouseService {

    ResponseEntity<?> create(CreateHouseRequest request);

    ResponseEntity<List<House>> getAllHouse();

    Page<House> findAllWithPagination(Pageable pageable);

    ResponseEntity<?> getHouseById(Long id);

    ResponseEntity<List<House>> queryHouse(QueryHouseRequest request);
}
