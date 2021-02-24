package com.springbootcrudoperations.service.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootcrudoperations.model.Product;
import com.springbootcrudoperations.repository.ProductRepository;
import com.springbootcrudoperations.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void update(Long productId, Product product) {
	if(productRepository.findById(productId).get()!= null)
	{
		product.setId(productId);
		this.save(product);
	}
	}

	@Override
	public void delete(Long productId) {
		if(productRepository.findById(productId).get()!= null)
		{
			productRepository.deleteById(productId);
		}
	}

	@Override
	public Product findById(Long id) { 
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> getAll() { 
		return (List<Product>) productRepository.findAll();
	}

 
}
