package com.example.task01.projection;

import com.example.task01.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author Sanjarbek Allayev, пт 17:45. 11.03.2022
 */
@Projection(name = "measurementProjection", types = Measurement.class)
public interface MeasurementProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.active}")
    boolean isActive();

}
