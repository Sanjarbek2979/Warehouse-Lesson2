package com.example.task01.projection;

import com.example.task01.entity.Client;
import com.example.task01.entity.Measurement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author Sanjarbek Allayev, пт 17:45. 11.03.2022
 */
@Projection(name = "clientProjection", types = Client.class)
public interface ClientProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.phoneNumber}")
    String getPhoneNumber();

    @Value("#{target.active}")
    boolean isActive();

}
