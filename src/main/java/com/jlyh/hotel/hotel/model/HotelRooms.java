package com.jlyh.hotel.hotel.model;

import lombok.Data;

import java.util.List;
@Data
public class HotelRooms {
    private Long hotelId;
    private String hotelName;
    private String hotelAddress;
    private List<Room> rooms;
}
