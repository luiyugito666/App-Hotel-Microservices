package com.jlyh.hotel.hotel.service;

import com.jlyh.hotel.hotel.dao.IHotelDao;
import com.jlyh.hotel.hotel.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService{
    @Autowired
   private IHotelDao serviceDao;


    @Override
    public List<Hotel> getAll() {
        return (List<Hotel>) serviceDao.findAll();
    }
}
