package com.educandoweb.aulamaxvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.aulamaxvenda.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
