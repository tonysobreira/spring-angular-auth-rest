package com.djamware.springangularauth;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.djamware.springangularauth.model.Role;
import com.djamware.springangularauth.model.User;
import com.djamware.springangularauth.repository.RoleRepository;
import com.djamware.springangularauth.service.CustomUserDetailsService;

@SpringBootApplication
public class SpringAngularAuthApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private CustomUserDetailsService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularAuthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Role role = new Role(null, "ADMIN");
		roleRepository.saveAll(Arrays.asList(role));

		User user = new User();
		user.setEmail("admin@admin");
		user.setFullName("Admin");
		user.setPassword("123");
		userService.saveUser(user);

	}

}
