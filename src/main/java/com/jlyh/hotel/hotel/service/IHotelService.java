package com.jlyh.hotel.hotel.service;

import com.jlyh.hotel.hotel.model.Hotel;
import com.jlyh.hotel.hotel.model.HotelRooms;

import java.util.List;

public interface IHotelService {

    List<Hotel> getAll();
    HotelRooms getHotelById(Long hotelId);
    HotelRooms getHotelByIdWithOutRooms(Long hotelId);
}
