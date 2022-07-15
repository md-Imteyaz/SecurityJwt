package com.example.jwt.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.api.entity.User;



public interface UserRepository extends JpaRepository<User, Integer> {

	//List<User> getallUser = null;

	User findByUserName(String username);



}
