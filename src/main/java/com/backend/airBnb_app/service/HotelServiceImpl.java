package com.backend.airBnb_app.service;

import com.backend.airBnb_app.dto.HotelDto;
import com.backend.airBnb_app.entity.Hotel;
import com.backend.airBnb_app.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService{

    private final HotelRepository hotelRepository;

    @Override
    public Hotel createNewHotel(HotelDto hotelDto) {
        return null;
    }

    @Override
    public Hotel getHotelById(Long id) {
        return null;
    }
}
