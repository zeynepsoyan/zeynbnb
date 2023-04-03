package dev.zey.zeynbnb.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookingRequest {
    private Long houseId;
    private String peopleNames;
    private Date fromDate;
    private Date toDate;
}
