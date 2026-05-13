package com.educandoweb.aulamaxvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.aulamaxvenda.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
