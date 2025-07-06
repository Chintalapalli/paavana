package com.sbi.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class ProductException extends RuntimeException{
	
	private Long productId;
	
	public ProductException(String errorMsg, Long productId) {
		super(errorMsg);
		this.productId = productId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
}
