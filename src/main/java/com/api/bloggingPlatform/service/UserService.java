package com.api.bloggingPlatform.service;

import org.springframework.stereotype.Service;

import com.api.bloggingPlatform.model.user.User;
import com.api.bloggingPlatform.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User createUser() {
		User user = new User();
		return user = userRepository.save(user);
	}
	
}
