package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/list")
    public ResponseEntity getAll(){
        return new ResponseEntity(carService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/seach/{id}")
    public ResponseEntity findById( @PathVariable Long id){
        return new ResponseEntity(carService.findById(id), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity save( @RequestBody Car car){
        carService.save(car);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/delete{id}")
    public ResponseEntity delete(@PathVariable Long id){
        carService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
