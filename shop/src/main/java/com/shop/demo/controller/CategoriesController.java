package com.shop.demo.controller;

import com.shop.demo.model.Categories;
import com.shop.demo.repository.CategoriesRepository;
import com.shop.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    CategoriesService categoriesService;

    @PostMapping("/")
    public Categories save(@RequestBody Categories categories) {
        return categoriesService.create(categories);
    }

    @GetMapping("/{categoriesId}")
    public Optional<Categories> viewCategories(@PathVariable("categoriesId")long categoriesId){
         return categoriesService.findById(categoriesId);
    }

    @PutMapping("/{categoriesId}")
    public Categories update(@PathVariable("categoriesId") long categoriesId, @RequestBody Categories categories) throws Exception {
        return categoriesService.changeById(categoriesId,categories);
    }

    @GetMapping("/list")
    public List<Categories> list() {
        return categoriesService.getAll();
    }

    @DeleteMapping("/{categoriesId}")
    public String delete(@PathVariable("categoriesId") long categoriesId) {
       return categoriesService.deleteById(categoriesId);
    }
}