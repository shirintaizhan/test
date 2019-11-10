package com.shop.demo.controller;

import com.shop.demo.model.Laptop;
import com.shop.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    @Autowired
    LaptopRepository laptopRepository;

    @PostMapping ("/laptop/save")
    public String save(@RequestBody Laptop laptop){

        laptopRepository.save(laptop);

        return "saved";

    }

    @GetMapping("/laptop/{laptopId}/view")
    public String view (@PathVariable("laptopId") int laptopId){

        Optional<Laptop> laptop = laptopRepository.findById(laptopId);

        return  laptop.toString();

    }

    @PostMapping ("/laptop/update")
    public String update(@RequestBody Laptop laptop){

        laptopRepository.save(laptop);

        return "updated";
    }

    @GetMapping ("/laptop/list")
    public String list (){

        List<Laptop> list =laptopRepository.findAll();

        return list.toString();

    }

    @PostMapping ("/laptop/{laptopId}/delete")
    public String delete (@PathVariable int laptopId){

        laptopRepository.deleteById(laptopId);

        return "deleted";

    }

}
