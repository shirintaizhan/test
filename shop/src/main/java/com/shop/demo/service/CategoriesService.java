package com.shop.demo.service;

import com.shop.demo.model.Categories;
import com.shop.demo.repository.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {

    private CategoriesRepository categoriesRepository;

    public Categories create(Categories categories){
        return categoriesRepository.save(categories);
    }

    public Optional<Categories> findById(long id){
        return categoriesRepository.findById(id);
    }

    public String deleteById(long id){
        categoriesRepository.deleteById(id);
        return "Category is number:" + id + "has been deleted!";
    }

    public String deleteAll(ArrayList<Categories>categories){
        categoriesRepository.deleteAll();
        return "All categories have been deleted!";
    }

    public Categories changeById(long categoriesId, Categories categories) throws Exception{
        return categoriesRepository.findById(categoriesId)
                .map(category -> {
                    category.setCategoriesId(categories.getCategoriesId());
                    category.setName(categories.getName());
                    category.setDescription(categories.getDescription());
                    category.setActive(categories.getActive());
                    return categoriesRepository.save(category);
                }).orElseThrow(Exception::new);
    }

    public List<Categories> getAll(){
        return categoriesRepository.findAll();
    }
}