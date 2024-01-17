package com.jlyh.hotel.hotel.service.client;

import com.jlyh.hotel.hotel.model.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("room")
public interface RoomsFeignClient {

    @RequestMapping(method= RequestMethod.GET,value="rooms/{id}" , consumes = "application/json")
    public List<Room> getAllRoom(@PathVariable Long id);
}
