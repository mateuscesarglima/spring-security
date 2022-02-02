package com.spring.security.springsecurity.repository;

import com.spring.security.springsecurity.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
