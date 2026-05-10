package com.educandoweb.aulamaxvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.aulamaxvenda.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
