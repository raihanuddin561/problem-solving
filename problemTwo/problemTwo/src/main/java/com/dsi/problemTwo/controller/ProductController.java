package com.dsi.problemTwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dsi.problemTwo.model.Product;
import com.dsi.problemTwo.service.ProductServic;

@Controller
public class ProductController {
	@Autowired
	private ProductServic productServic;
	@GetMapping("/products")
	public String getProductPage(Model model) {
		List<Product> productList = productServic.getProducts();
		model.addAttribute("productList",productList);
		return "product";
	}

}
