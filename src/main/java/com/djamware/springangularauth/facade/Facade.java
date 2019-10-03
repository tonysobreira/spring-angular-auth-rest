package com.djamware.springangularauth.facade;

import java.util.List;

import com.djamware.springangularauth.model.Product;
import com.djamware.springangularauth.model.Role;
import com.djamware.springangularauth.model.User;

public interface Facade {

	/** User **/
	public List<User> findAllUser();

	public User findUserById(Integer id);

	public User saveUser(User user);

	public void deleteUserById(Integer id);

	public User findUserByEmail(String email);

	/** User **/

	/** Role **/
	public List<Role> findAllRole();

	public Role findRoleById(Integer id);

	public Role saveRole(Role role);

	public void deleteRoleById(Integer id);

	public Role findRoleByRole(String role);

	/** Role **/

	/** Product **/
	public List<Product> findAllProduct();

	public Product findProductById(Integer id);

	public Product saveProduct(Product product);

	public void deleteProductById(Integer id);

	public void delete(Product product);

	/** Product **/

}
