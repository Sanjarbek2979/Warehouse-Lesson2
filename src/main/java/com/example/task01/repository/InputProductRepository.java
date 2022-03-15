package com.example.task01.repository;

import com.example.task01.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

/**
 * @author Sanjarbek Allayev, сб 20:38. 26.02.2022
 */
@RepositoryRestResource(path = "inputProduct")
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
List<InputProduct> findAllByInput_Id(Integer id);
}
