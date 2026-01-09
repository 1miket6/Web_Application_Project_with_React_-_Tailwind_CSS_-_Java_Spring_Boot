package com.mike.stickers.controller;

import java.time.LocalDateTime;
import java.util.List;

import com.mike.stickers.dto.ErrorResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mike.stickers.dto.ProductDto;
import com.mike.stickers.entity.Product;
import com.mike.stickers.repository.ProductRepository;
import com.mike.stickers.service.IProductService;
import com.mike.stickers.service.impl.ProductServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.context.request.WebRequest;

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
	public ResponseEntity <List<ProductDto>> getProduct() { //DTO pattern
	  List <ProductDto> productList = iproductService.getProducts();
		return ResponseEntity.status(HttpStatus.OK).body(productList);
  }
	@ExceptionHandler(Exception.class)
	public ResponseEntity <ErrorResponseDto>handleGlobalException(Exception exception, WebRequest webRequest){
		ErrorResponseDto errorResponseDto = new ErrorResponseDto(
				webRequest.getDescription(false),
				HttpStatus.SERVICE_UNAVAILABLE,
				exception.getMessage(),
				LocalDateTime.now());
		return new ResponseEntity<>(errorResponseDto, HttpStatus.SERVICE_UNAVAILABLE);
	}
//		Thread.sleep(5000);
//		System.out.println("React StrictMode render 2 times for development.");
}
