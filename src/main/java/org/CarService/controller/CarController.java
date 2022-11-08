package org.CarService.controller;

import org.CarService.entity.Car;
import org.CarService.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLDataException;
import java.util.List;

@RestController
@RequestMapping("/")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getBrands() {
        return this.carService.getCars();
    }

}
