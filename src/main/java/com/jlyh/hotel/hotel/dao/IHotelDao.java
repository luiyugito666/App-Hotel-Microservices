package com.jlyh.hotel.hotel.dao;

import com.jlyh.hotel.hotel.model.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface IHotelDao extends CrudRepository<Hotel,Long> {
}
