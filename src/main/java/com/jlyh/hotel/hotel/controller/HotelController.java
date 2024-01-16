package com.jlyh.hotel.hotel.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.jlyh.hotel.hotel.config.HotelServiceConfiguration;
import com.jlyh.hotel.hotel.model.Hotel;
import com.jlyh.hotel.hotel.model.PropertiesHotel;
import com.jlyh.hotel.hotel.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private IHotelService service;
  @Autowired
    private HotelServiceConfiguration configHot;


    @GetMapping("hotels")

    public List<Hotel> getAllHotel(){
       return service.getAll();

    }

    @GetMapping("/hotels/read/properties")
    public String getPropertiesHotels() throws JsonProcessingException {
        ObjectWriter owj = new ObjectMapper().writer().withDefaultPrettyPrinter();
        PropertiesHotel propertiesHotel=new PropertiesHotel(configHot.getMsg(), configHot.getBuildVersion(), configHot.getMailDetails());
        String jsonString =owj.writeValueAsString(propertiesHotel);
        return jsonString;
    }

}
