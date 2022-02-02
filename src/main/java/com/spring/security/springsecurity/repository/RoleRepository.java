package com.spring.security.springsecurity.repository;

import com.spring.security.springsecurity.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
