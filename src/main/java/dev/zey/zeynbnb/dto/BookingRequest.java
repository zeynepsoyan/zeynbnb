package dev.zey.zeynbnb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingRequest {
    private Long houseId;
    private String peopleNames;
}
