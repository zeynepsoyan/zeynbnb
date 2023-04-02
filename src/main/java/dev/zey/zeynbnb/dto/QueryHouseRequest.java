package dev.zey.zeynbnb.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class QueryHouseRequest {
    private String city;
    private Integer numPeople;
    private Date fromDate;
    private Date toDate;
}
