package com.shop.demo;

import com.shop.demo.controller.LaptopController;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.shop.demo.model.Laptop;
import com.shop.demo.repository.LaptopRepository;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TestingLaptopController {


    @InjectMocks
    private LaptopController LaptopController;

    @Autowired
    LaptopRepository laptopRepository;

    @Test
    @PostMapping ("/laptop/save")
    public String save(@RequestBody Laptop laptop){

        laptopRepository.save(laptop);

        return "saved";

    }
    @Test
    @GetMapping("/laptop/{laptopId}/view")
    public String view (@PathVariable("laptopId") int laptopId){

        Optional<Laptop> laptop = laptopRepository.findById(laptopId);

        return  laptop.toString();

    }
    @Test
    @PostMapping ("/laptop/update")
    public String update(@RequestBody Laptop laptop){

        laptopRepository.save(laptop);

        return "updated";
    }
    @Test
    @GetMapping ("/laptop/list")
    public String list (){

        List<Laptop> list =laptopRepository.findAll();

        return list.toString();

    }

    @Test
    @PostMapping ("/laptop/{laptopId}/delete")
    public String delete (@PathVariable int laptopId){

        laptopRepository.deleteById(laptopId);

        return "deleted";

    }

}
