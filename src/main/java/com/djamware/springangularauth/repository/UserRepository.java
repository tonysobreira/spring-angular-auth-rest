package com.djamware.springangularauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.springangularauth.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);

}
