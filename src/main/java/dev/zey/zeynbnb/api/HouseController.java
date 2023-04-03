package dev.zey.zeynbnb.api;

import dev.zey.zeynbnb.dto.CreateHouseRequest;
import dev.zey.zeynbnb.dto.QueryHouseRequest;
import dev.zey.zeynbnb.model.House;
import dev.zey.zeynbnb.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/house")
public class HouseController {

    @Autowired
    HouseService houseService;

    @PostMapping(value = "/")
    public ResponseEntity<?> create(@RequestBody CreateHouseRequest request) {
        return houseService.create(request);
    }

    @GetMapping(value = "/initHouses")
    public ResponseEntity<?> initHouses() {
        return houseService.initDb();
    }

    @GetMapping
    public ResponseEntity<List<House>> getAllHouse() {
        return houseService.getAllHouse();
    }

    @GetMapping(value = "/page/{size}")
    public ResponseEntity<List<House>> getAllHouseWithPagination(@PathVariable("size") Integer size) {
        Pageable firstPageWithTwoElements = PageRequest.of(0, size);
        return houseService.findAllWithPagination(firstPageWithTwoElements);
    }

    @GetMapping(value = "/query")
    public ResponseEntity<List<House>> getHouseByFilters(@RequestBody QueryHouseRequest request) {
        return houseService.queryHouse(request);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<?> getHouseById(@PathVariable("id") Long id) {
        return houseService.getHouseById(id);
    }
}

