package com.skillio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.model.User;
import com.skillio.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;

	public User addUser(User user) {
		return ur.save(user);
	}
	
}
