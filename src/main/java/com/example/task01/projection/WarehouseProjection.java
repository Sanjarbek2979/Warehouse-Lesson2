package com.example.task01.projection;

import com.example.task01.entity.User;
import com.example.task01.entity.Warehouse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author Sanjarbek Allayev, пт 17:45. 11.03.2022
 */
@Projection(name = "warehouseProjection", types = Warehouse.class)
public interface WarehouseProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.active}")
    boolean isActive();

}
