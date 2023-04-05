package com.cars.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CarDTO(
    @NotBlank String carModel,

    @NotBlank String manufacturer,

    @NotBlank @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$") String manufactureDate,

    @Min(0) int price,

    @Min(1886) int modelYear
    ) {

}
