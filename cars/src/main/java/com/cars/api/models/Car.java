package com.cars.api.models;

import com.cars.api.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String carModel;

    @Column(length = 20, nullable = false)
    private String manufacturer;

    @Column(length = 10, nullable = false)
    private String manufactureDate;
    
    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int modelYear;

    public Car(CarDTO data) {
        this.carModel = data.carModel();
        this.manufacturer = data.manufacturer();
        this.manufactureDate = data.manufactureDate();
        this.price = data.price();
        this.modelYear = data.modelYear();
    }
}
