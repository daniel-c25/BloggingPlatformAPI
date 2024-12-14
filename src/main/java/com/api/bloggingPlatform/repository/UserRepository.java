package com.api.bloggingPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bloggingPlatform.model.user.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
