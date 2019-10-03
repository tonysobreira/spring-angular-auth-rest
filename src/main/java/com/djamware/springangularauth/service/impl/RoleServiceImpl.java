package com.djamware.springangularauth.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.djamware.springangularauth.model.Role;
import com.djamware.springangularauth.repository.RoleRepository;
import com.djamware.springangularauth.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepository;

	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findById(Integer id) {
		Optional<Role> optionalRole = roleRepository.findById(id);

		if (optionalRole.isPresent()) {
			return optionalRole.get();
		}

		return null;
	}

	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void deleteById(Integer id) {
		roleRepository.deleteById(id);
	}

	@Override
	public Role findByRole(String role) {
		return roleRepository.findByRole(role);
	}

}
