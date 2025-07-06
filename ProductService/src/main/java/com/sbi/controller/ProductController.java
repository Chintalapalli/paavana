package com.sbi.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sbi.entity.Product;
import com.sbi.model.ProductException;
import com.sbi.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/addproduct")
	public ResponseEntity<Integer> addProduct(@RequestBody List<Product> pd){
		 int addcount = 0;
		for(Product product:pd) {
			Long productId = productService.saveProduct(product);
			addcount++;
		}
		return new ResponseEntity<>(addcount,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/fetchProduct/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id){
		Product product = (productService.findByID(id));
		
		return new ResponseEntity<>(product,HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updatingProducts(@RequestBody Product product){
		product = productService.updateProducts(product);
		
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping("/allProducts")
	public List<Product> getAllProducts(){
		return productService.getProducts();
	}

}
