package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dao.HouseRepository;
import dev.zey.zeynbnb.dto.CreateHouseRequest;
import dev.zey.zeynbnb.model.House;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    @Override
    public ResponseEntity<?> create(CreateHouseRequest request) {

        House house = createCustomer(request);
        houseRepository.save(house);
        return ResponseEntity.ok()
                .header("X-User-Id", house.getId().toString())
                .header("X-User-Name", house.getCity())
                .build();
    }

    private House createCustomer(CreateHouseRequest request) {
        House house = new House();
        house.setCity(request.getName());
        house.setDescription(request.getAddress());
        return house;
    }

    @Override
    public ResponseEntity<List<House>> getAllHouse() {
        return ResponseEntity.ok(houseRepository.findAll());
    }

}
