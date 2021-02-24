package com.springbootcrudoperations.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootcrudoperations.model.Product;

@Service
public interface ProductService {

	public Product save(Product product);

	public void update(Long productId, Product product);

	public void delete(Long productId);

	public Product findById(Long id);
	
	public List<Product> getAll();

}
