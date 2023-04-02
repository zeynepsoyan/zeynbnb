package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dto.CreateHouseRequest;
import dev.zey.zeynbnb.model.House;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HouseService {

    ResponseEntity<?> create(CreateHouseRequest request);

    ResponseEntity<List<House>> getAllHouse();

}
