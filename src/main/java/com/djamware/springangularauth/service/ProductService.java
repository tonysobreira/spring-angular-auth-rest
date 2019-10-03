package com.djamware.springangularauth.service;

import java.util.List;

import com.djamware.springangularauth.model.Product;

public interface ProductService {

	public List<Product> findAll();

	public Product findById(Integer id);

	public Product save(Product product);

	public void deleteById(Integer id);

	public void delete(Product product);

}
