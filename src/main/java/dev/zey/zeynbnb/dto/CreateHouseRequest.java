package dev.zey.zeynbnb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateHouseRequest {
    private String name;
    private String address;
}
