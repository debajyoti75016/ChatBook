package com.chatbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbook.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

	User findByEmail(String email);



}
