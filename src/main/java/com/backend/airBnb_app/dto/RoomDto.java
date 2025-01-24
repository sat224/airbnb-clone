package com.backend.airBnb_app.dto;

import com.backend.airBnb_app.entity.Hotel;
import java.math.BigDecimal;

public class RoomDto {
    private Long id;
    private Hotel hotel;
    private String type;
    private BigDecimal basePrice;
    private String photos;
    private String amenities;
    private Integer totalCount;
    private Integer capacity;
}
