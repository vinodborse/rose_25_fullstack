package com.skillio.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.exception.ProductNotFound;
import com.skillio.exception.RatingException;
import com.skillio.exception.ResourceNotFound;
import com.skillio.model.Product;
import com.skillio.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pr;

	public Product addProduct(Product product) {
		return pr.save(product);
	}

	public List<Product> getProduct(String type) {
		System.out.println(type);
		if(type.isEmpty() )  {
			return pr.findAll();
		} else {
			return pr.findByType(type);
		}
	}

	public Product updateRating(Long productId, int rating) {
		Optional<Product> product = pr.findById(productId);
		
		if(product.isPresent()) {
			Product p= product.get();
			if(rating>0 && rating <= 5) {
					
				List<Integer> userRatings = p.getUserRatings();
				userRatings.add(rating);

				//---------
				
				float newRating = (dbRating + rating)/count;
				
				p.setRating(newRating);
				p.setUserRatings(userRatings);
				return pr.save(p);				
			} else {
				//throw new RatingException("Please provide valid rating");
				throw new ResourceNotFound("Please provide valid rating");
			}
			
		} else {
			//throw new ProductNotFound("Product not found");
			throw new ResourceNotFound("Product not found");
		}
		
	}
}
