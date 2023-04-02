package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dao.HouseRepository;
import dev.zey.zeynbnb.model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    public HouseServiceImpl(@Qualifier("postgres") HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Autowired
    private HouseRepository houseRepository;

    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }

    @Override
    public ResponseEntity<House> createHouse(House house) {
        try {
            House _house = houseRepository.save(house);
            return new ResponseEntity<>(_house, HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    public void method(String s) {
        houseRepository.getHouseWithFilter();
    }

}
