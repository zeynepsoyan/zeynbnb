package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.model.House;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HouseService {

    List<House> getAllHouses();

    ResponseEntity<House> createHouse(House house);

}
