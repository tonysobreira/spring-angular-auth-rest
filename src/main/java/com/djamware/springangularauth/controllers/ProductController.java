package com.djamware.springangularauth.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djamware.springangularauth.model.Product;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProductController extends BaseController {

	@GetMapping("/product")
	public Iterable<Product> findAll() {
		return this.getFacade().findAllProduct();
	}

	@GetMapping("/product/{id}")
	public Product findById(@PathVariable("id") Integer id) {
		return this.getFacade().findProductById(id);
	}

	@PostMapping(path = "/product")
	public Product save(@RequestBody Product product) {
		return this.getFacade().saveProduct(product);
	}

	@PutMapping("/product/{id}")
	public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Integer id) {
		Product productData = this.getFacade().findProductById(id);

		if (productData != null) {
			Product _product = productData;

			_product.setProdName(product.getProdName());
			_product.setProdDesc(product.getProdDesc());
			_product.setProdPrice(product.getProdPrice());

			Product p = this.getFacade().saveProduct(_product);

			return new ResponseEntity<Product>(p, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable Integer id) {
		this.getFacade().deleteProductById(id);
	}

}
