package com.djamware.springangularauth.service;

import java.util.List;

import com.djamware.springangularauth.model.Role;

public interface RoleService {

	public List<Role> findAll();

	public Role findById(Integer id);

	public Role save(Role role);

	public void deleteById(Integer id);

	public Role findByRole(String role);

}
