package com.example.demo.service.car;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService implements ICarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public Iterable<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Car car) {
         carRepository.save(car);

    }

    @Override
    public void delete(Long id) {
         carRepository.deleteById(id);

    }
}
