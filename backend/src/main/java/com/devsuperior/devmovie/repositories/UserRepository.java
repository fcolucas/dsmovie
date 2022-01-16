package com.devsuperior.devmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
