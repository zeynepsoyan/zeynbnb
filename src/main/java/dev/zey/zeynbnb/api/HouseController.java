package dev.zey.zeynbnb.api;

import dev.zey.zeynbnb.dto.CreateHouseRequest;
import dev.zey.zeynbnb.model.House;
import dev.zey.zeynbnb.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    HouseService houseService;

    @PostMapping(value = "/")
    public ResponseEntity<?> create(@RequestBody CreateHouseRequest request) {
        return houseService.create(request);
    }

    @GetMapping
    public ResponseEntity<List<House>> getAllHouse() {
        return houseService.getAllHouse();
    }
}

