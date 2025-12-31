package com.mike.stickers.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.mike.stickers.dto.ProductDto;
import com.mike.stickers.entity.Product;
import com.mike.stickers.repository.ProductRepository;
import com.mike.stickers.service.IProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService{
	
	private final ProductRepository productRepository;
	
	@Override
	public List <ProductDto> getProducts(){  // DTO Pattern
	return productRepository.findAll().
			stream().
			map(this::transformToDTO).
			collect(Collectors.toList());
	}
	
	private ProductDto transformToDTO (Product product) {
		ProductDto productDto = new ProductDto();
//		productDto.setProductId(product.getProductId());
		BeanUtils.copyProperties(product, productDto);
		return productDto;
	}	
}
