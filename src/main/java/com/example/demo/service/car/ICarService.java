package com.example.demo.service.car;

import com.example.demo.model.Car;

public interface ICarService {
    Iterable<Car>findAll();
    Car findById(Long id);
    void save(Car car);
    void delete(Long id);
}
