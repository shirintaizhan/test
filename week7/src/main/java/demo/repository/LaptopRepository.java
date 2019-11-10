package com.shop.demo.repository;

import com.shop.demo.model.Laptop;
import com.shop.demo.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
