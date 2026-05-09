package com.educandoweb.aulamaxvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulamaxvenda.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
