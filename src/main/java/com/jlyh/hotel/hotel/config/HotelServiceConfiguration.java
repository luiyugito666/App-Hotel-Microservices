package com.jlyh.hotel.hotel.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix="hotel")
@Data
public class HotelServiceConfiguration {
    private String msg;
    private String buildVersion;
    private Map<String,String> mailDetails;


}
