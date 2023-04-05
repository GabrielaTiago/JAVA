package com.cars.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;
import com.cars.api.models.Car;
import com.cars.api.repositories.CarsRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarsRepository repository;

    @GetMapping
    public List<Car> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody @Valid CarDTO req) {
        repository.save(new Car(req));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody @Valid CarDTO req) {
        repository.findById(id).map(car -> {
            car.setCarModel(req.carModel());
            car.setManufacturer(req.manufacturer());
            car.setManufactureDate(req.manufactureDate());
            car.setPrice(req.price());
            car.setModelYear(req.modelYear());
            return repository.save(car);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
