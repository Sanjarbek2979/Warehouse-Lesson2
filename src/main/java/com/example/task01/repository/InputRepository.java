package com.example.task01.repository;


import com.example.task01.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Sanjarbek Allayev, сб 20:38. 26.02.2022
 */
@RepositoryRestResource(path = "input")
public interface InputRepository extends JpaRepository<Input,Integer> {
}
