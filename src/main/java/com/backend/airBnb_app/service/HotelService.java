package com.backend.airBnb_app.service;

import com.backend.airBnb_app.dto.HotelDto;
import com.backend.airBnb_app.entity.Hotel;
import org.springframework.stereotype.Service;

public interface HotelService {
    public Hotel createNewHotel(HotelDto hotelDto);
    public Hotel getHotelById(Long id);

}
