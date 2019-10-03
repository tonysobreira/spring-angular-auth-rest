package com.djamware.springangularauth.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.djamware.springangularauth.model.Product;
import com.djamware.springangularauth.model.Role;
import com.djamware.springangularauth.model.User;
import com.djamware.springangularauth.service.ProductService;
import com.djamware.springangularauth.service.RoleService;
import com.djamware.springangularauth.service.UserService;

@Service("facade")
public class FacadeImpl implements Facade {

	private UserService userService;
	private RoleService roleService;
	private ProductService productService;

	public FacadeImpl(@Qualifier("userService") final UserService userService,
			@Qualifier("roleService") final RoleService roleService,
			@Qualifier("productService") final ProductService productService) {
		this.userService = userService;
		this.roleService = roleService;
		this.productService = productService;

	}

	/** User **/

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public List<User> findAllUser() {
		return this.userService.findAll();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public User findUserById(Integer id) {
		return this.userService.findById(id);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public User saveUser(User user) {
		return this.userService.save(user);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public void deleteUserById(Integer id) {
		this.userService.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public User findUserByEmail(String email) {
		return this.userService.findByEmail(email);
	}

	/** User **/

	/** Role **/

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public List<Role> findAllRole() {
		return this.roleService.findAll();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public Role findRoleById(Integer id) {
		return this.roleService.findById(id);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public Role saveRole(Role role) {
		return this.roleService.save(role);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public void deleteRoleById(Integer id) {
		this.roleService.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public Role findRoleByRole(String role) {
		return this.roleService.findByRole(role);
	}

	/** Role **/

	/** Product **/

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public List<Product> findAllProduct() {
		return this.productService.findAll();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public Product findProductById(Integer id) {
		return this.productService.findById(id);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public Product saveProduct(Product product) {
		return this.productService.save(product);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public void deleteProductById(Integer id) {
		this.productService.deleteById(id);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class, isolation = Isolation.DEFAULT)
	public void delete(Product product) {
		this.productService.delete(product);
	}

	/** Product **/

}
