package dev.zey.zeynbnb.service;

import dev.zey.zeynbnb.dao.HouseRepository;
import dev.zey.zeynbnb.dto.CreateHouseRequest;
import dev.zey.zeynbnb.dto.QueryHouseRequest;
import dev.zey.zeynbnb.model.House;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    @Override
    public ResponseEntity<?> create(CreateHouseRequest request) {
        House house = createHouse(request);
        houseRepository.save(house);
        return ResponseEntity.ok()
                .header("House-Id", house.getId().toString())
                .header("House-ListingTitle", house.getListingTitle())
                .header("House-City", house.getCity())
                .header("House-Description", house.getDescription())
                .header("House-Amenities", house.getAmenities())
                .header("House-MaxPeople", house.getMaxPeople().toString())
                .header("House-BookedDates", house.getBookedDates().toString())
                .build();
    }

    private House createHouse(CreateHouseRequest request) {
        House house = new House();
        house.setListingTitle(request.getListingTitle());
        house.setCity(request.getCity());
        house.setDescription(request.getDescription());
        house.setAmenities(request.getAmenities());
        house.setMaxPeople(request.getMaxPeople());
        house.setBookedDates(new ArrayList<>(Arrays.asList(new Date())) {});
        return house;
    }

    @Override
    public ResponseEntity<List<House>> getAllHouse() {
        return ResponseEntity.ok(houseRepository.findAll());
    }

    @Override
    public Page<House> findAllWithPagination(Pageable pageable) {
        return houseRepository.findAllWithPagination(pageable);
    }

    @Override
    public ResponseEntity<?> getHouseById(Long id) {
        return ResponseEntity.ok(houseRepository.findById(id));
    }

    @Override
    public ResponseEntity<List<House>> queryHouse(QueryHouseRequest request) {
        return ResponseEntity.ok(houseRepository.findByCityIgnoreCaseAndMaxPeopleLessThanEqual(
                request.getCity(),
                request.getNumPeople()
        ));
    }

}
