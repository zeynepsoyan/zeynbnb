package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dto.CreateHouseRequest;
import dev.zey.zeynbnb.dto.QueryHouseRequest;
import dev.zey.zeynbnb.model.House;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;

public interface HouseService {

    ResponseEntity<?> create(CreateHouseRequest request);

    ResponseEntity<List<House>> getAllHouse();

    ResponseEntity<?> getHouseById(Long id);

    ResponseEntity<List<House>> queryHouse(QueryHouseRequest request);
}
