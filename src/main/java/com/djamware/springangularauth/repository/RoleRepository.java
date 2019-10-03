package com.djamware.springangularauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.springangularauth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);

}
