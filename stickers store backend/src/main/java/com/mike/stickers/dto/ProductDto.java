package com.mike.stickers.dto;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

	private Long productId;
	private String name;
	private String description;
	private BigDecimal price;
	private Integer popularity;
	private String imageUrl;
	private Instant createdAt;
	
}
