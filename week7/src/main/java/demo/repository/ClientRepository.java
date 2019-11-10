package com.shop.demo.repository;
import com.shop.demo.model.Client;
import com.shop.demo.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
