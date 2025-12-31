package com.mike.stickers.service;

import java.util.List;

import com.mike.stickers.dto.ProductDto;
import com.mike.stickers.entity.Product;

public interface IProductService {

	List<ProductDto> getProducts();
	  
	
}
