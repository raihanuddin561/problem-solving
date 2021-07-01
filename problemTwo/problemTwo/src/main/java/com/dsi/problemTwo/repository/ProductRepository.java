package com.dsi.problemTwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsi.problemTwo.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
