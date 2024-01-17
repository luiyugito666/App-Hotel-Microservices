package com.jlyh.hotel.hotel.service;

import com.jlyh.hotel.hotel.config.AppConfig;
import com.jlyh.hotel.hotel.dao.IHotelDao;
import com.jlyh.hotel.hotel.model.Hotel;
import com.jlyh.hotel.hotel.model.HotelRooms;
import com.jlyh.hotel.hotel.model.Room;
import com.jlyh.hotel.hotel.service.client.RoomsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class HotelServiceImpl implements IHotelService{
    @Autowired
   private IHotelDao serviceDao;

  //  @Autowired
  //  private RestTemplate clientRest;

    @Autowired
    RoomsFeignClient roomsFeignClient;


    @Override
    public List<Hotel> getAll() {
        return (List<Hotel>) serviceDao.findAll();
    }

    @Override
    public HotelRooms getHotelById(Long hotelId) {
        HotelRooms response = new HotelRooms();
        Optional<Hotel> hotel = serviceDao.findById(hotelId);

        //metodo RestTemplate
    /*
        Map<String,Long> pathVariable= new HashMap<String, Long>();
        pathVariable.put("id",hotelId);

        List<Room> rooms = Arrays.asList(clientRest.getForObject("http://localhost:8081/rooms/{id}",Room[].class,pathVariable));
        */

        //consume por feign

    List<Room> rooms = roomsFeignClient.getAllRoom(hotelId);

    response.setHotelId(hotel.get().getHotelId());
    response.setHotelName(hotel.get().getHotelName());
    response.setHotelAddress(hotel.get().getHotelAddress());
    response.setRooms(rooms);

    return response;


    }
}
