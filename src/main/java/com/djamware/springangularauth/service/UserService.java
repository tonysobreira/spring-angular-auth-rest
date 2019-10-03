package com.djamware.springangularauth.service;

import java.util.List;

import com.djamware.springangularauth.model.User;

public interface UserService {

	public List<User> findAll();

	public User findById(Integer id);

	public User save(User user);

	public void deleteById(Integer id);

	public User findByEmail(String email);

}
