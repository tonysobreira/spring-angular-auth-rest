package com.djamware.springangularauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.springangularauth.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Override
	public void delete(Product product);

}
