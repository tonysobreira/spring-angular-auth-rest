package com.djamware.springangularauth.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.djamware.springangularauth.model.User;
import com.djamware.springangularauth.repository.UserRepository;
import com.djamware.springangularauth.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Integer id) {
		Optional<User> optionalUser = userRepository.findById(id);

		if (optionalUser.isPresent()) {
			return optionalUser.get();
		}

		return null;
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
