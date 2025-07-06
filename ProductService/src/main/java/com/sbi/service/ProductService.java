package com.sbi.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sbi.dao.ProductRepository;
import com.sbi.entity.Product;
import com.sbi.model.ProductException;
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
	
	public Product findByID(Long id) {
		Product product = productRepository.findById(id)
										.orElseThrow(() ->new ProductException("Product Not Found", id));
		return product;
	}

	public Product updateProducts(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}

}
