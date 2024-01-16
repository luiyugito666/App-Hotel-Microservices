package com.jlyh.hotel.hotel.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.lang.model.element.Name;

@Entity
@Getter @Setter @ToString
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="hotel_id")
    private Long hotelId;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "hotel_address")
    private String hotelAddress;

}
