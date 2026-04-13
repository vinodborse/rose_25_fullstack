package com.skillio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Product;
import com.skillio.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return ResponseEntity.ok(ps.addProduct(product));
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProduct(@RequestParam("type") String type) {
		return ResponseEntity.ok(ps.getProduct(type));
	}
	
	@PutMapping("/add-rating")
	public ResponseEntity<Product> updateRating(@RequestParam("productId") Long productId, 
												@RequestParam("rating") int rating) {
		return ResponseEntity.ok(ps.updateRating(productId, rating));
	}
	
}
