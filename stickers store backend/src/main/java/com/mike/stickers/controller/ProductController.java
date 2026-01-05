package com.mike.stickers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.stickers.dto.ProductDto;
import com.mike.stickers.entity.Product;
import com.mike.stickers.repository.ProductRepository;
import com.mike.stickers.service.IProductService;
import com.mike.stickers.service.impl.ProductServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

	private final IProductService iproductService;
	
	
//	@Autowired
//	public ProductController(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}
	
	@GetMapping
	public List <ProductDto> getProduct() throws InterruptedException { //DTO pattern
		Thread.sleep(5000);
		System.out.println("React StrictMode render 2 times for development.");
	  List <ProductDto> productList = iproductService.getProducts();
		return productList;
  }
	
}
