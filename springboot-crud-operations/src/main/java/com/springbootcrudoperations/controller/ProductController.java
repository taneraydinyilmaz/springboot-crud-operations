package com.springbootcrudoperations.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootcrudoperations.model.Product;
import com.springbootcrudoperations.repository.ProductRepository;

//The Controller Layer - Denetleyici Katmanı

@Controller
public class ProductController {

	 

	/*
	 * kaydetme(post) ,
	 * 
	 * güncelleme(put)
	 * 
	 * silme(delete)
	 * 
	 * ara(get)
	 */
	
	private final ProductRepository productRepository;

	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/index")
	public String showProductList(Model model) {
		model.addAttribute("product", productRepository.findAll());
		return "index";

	}

	//----------------------------------------------------------------------------
	@GetMapping("/product")
	public String show(Model model) {
		model.addAttribute("product", productRepository.findAll());
		return "urunler";
	}
	@PostMapping("/addproduct")
	public String addProduct(@Valid Product product, BindingResult result, Model model) {
		if(result.hasErrors())
		return "urun-ekle";
		
		productRepository.save(product);
		return "redirect:/index";

	}
	//----------------------------------------------------------------------------
	
	

}
