package com.sbi.service;

import org.springframework.stereotype.Service;

import com.sbi.dao.ProductRepository;
import com.sbi.entity.Product;
import com.sbi.model.ProductRequest;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Long saveProduct(Product pr) {
		
		Product saved = productRepository.save(pr);
		return saved.getProductId();
	}

}
