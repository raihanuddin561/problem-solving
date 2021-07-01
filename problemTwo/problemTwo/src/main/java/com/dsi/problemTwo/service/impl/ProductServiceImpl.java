package com.dsi.problemTwo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.problemTwo.model.Product;
import com.dsi.problemTwo.repository.ProductRepository;
import com.dsi.problemTwo.service.ProductServic;
@Service
public class ProductServiceImpl implements ProductServic {
	@Autowired
	private ProductRepository productRepository;
	@Override
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

}
