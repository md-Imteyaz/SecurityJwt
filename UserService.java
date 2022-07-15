package com.example.jwt.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jwt.api.entity.User;
import com.example.jwt.api.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepo;

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public void saveOrUpdate(User user) {
		userRepo.save(user);
		
	}

}
