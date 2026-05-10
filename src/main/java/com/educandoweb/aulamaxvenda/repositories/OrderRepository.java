package com.educandoweb.aulamaxvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.aulamaxvenda.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
