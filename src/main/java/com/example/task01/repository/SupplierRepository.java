package com.example.task01.repository;

import com.example.task01.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * @author Sanjarbek Allayev, сб 9:34. 26.02.2022
 */
@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
