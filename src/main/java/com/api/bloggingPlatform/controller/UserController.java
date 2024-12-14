package com.api.bloggingPlatform.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.bloggingPlatform.model.user.User;
import com.api.bloggingPlatform.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("create")
	public User createUser() {
		return userService.createUser();
	}
	
	
}
