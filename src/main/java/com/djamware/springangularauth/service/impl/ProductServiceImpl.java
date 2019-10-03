package com.djamware.springangularauth.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.djamware.springangularauth.model.Product;
import com.djamware.springangularauth.repository.ProductRepository;
import com.djamware.springangularauth.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	// @Autowired
	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(Integer id) {
		Optional<Product> optionalProduct = productRepository.findById(id);

		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		}

		return null;
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteById(Integer id) {
		productRepository.deleteById(id);
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}

}
