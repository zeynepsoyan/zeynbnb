package dev.zey.zeynbnb.api;

import dev.zey.zeynbnb.dto.HouseDto;
import dev.zey.zeynbnb.model.House;
import dev.zey.zeynbnb.service.HouseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("api/v1/houses")
@RestController
public class HouseController {

    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    public List<HouseDto> getAllHouses() {
        List<House> houses = houseService.getAllHouses();
        List<HouseDto> housesDto = new ArrayList<HouseDto>();
        houses.forEach(house -> housesDto.add(createDto(house)));
        return housesDto;
    }

    public List<HouseDto> getHouseWithFilters(String city, Integer numPeople, Date date) {
        return List.of();
    }

    record NewHouseRequest(
            String listingTitle,
            String city,
            String description,
            List<String> amenities,
            Integer maxPeople
    ) {}

    @PostMapping
    public void addHouse(@Valid @NonNull @RequestBody NewHouseRequest request) {
        HouseDto houseDto = new HouseDto();
        houseDto.setListingTitle(request.listingTitle());
        houseDto.setCity(request.city());
        houseDto.setDescription(request.description());
        houseDto.setAmenities(request.amenities());
        houseDto.setMaxPeople(request.maxPeople());

        House house = createModel(houseDto);
        houseService.createHouse(house);
    }

    private HouseDto createDto(House house) {
        HouseDto dto = new HouseDto(house.getId(),
                house.getListingTitle(),
                house.getCity(),
                house.getDescription(),
                house.getAmenities(),
                house.getMaxPeople(),
                house.getBookedDates());
        return dto;
    }

    private House createModel(HouseDto houseDto) {
        House model = new House(houseDto.getId(),
                houseDto.getListingTitle(),
                houseDto.getCity(),
                houseDto.getDescription(),
                houseDto.getAmenities(),
                houseDto.getMaxPeople(),
                houseDto.getBookedDates());
        return model;
    }

}
