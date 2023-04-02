package com.cars.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.api.models.Car;

public interface CarsRepository extends JpaRepository<Car, Long> {

}
