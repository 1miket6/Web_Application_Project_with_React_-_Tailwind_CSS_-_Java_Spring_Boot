package com.mike.stickers.entity;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="products")
public class Product extends BaseEntity{
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId", nullable = false)
	private Long productId;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name="description", nullable=false)
	private String description;
	@Column(name="price", nullable=false)
	private BigDecimal price;
	@Column(name="popularity", nullable=false)
	private Integer popularity;
	@Column(name="imageUrl")
	private String imageUrl;
	
//	public Long getProductId() {
//		return productId;
//	}
//	public void setProductId(Long productId) {
//		this.productId = productId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
//	public Integer getPopularity() {
//		return popularity;
//	}
//	public void setPopularity(Integer popularity) {
//		this.popularity = popularity;
//	}
//	public String getImageUrl() {
//		return imageUrl;
//	}
//	public void setImageUrl(String imageUrl) {
//		this.imageUrl = imageUrl;
//	}
//	public Instant getCreatedAt() {
//		return createdAt;
//	}
//	public void setCreatedAt(Instant createdAt) {
//		this.createdAt = createdAt;
//	}
//	public String getCreatedBy() {
//		return createdBy;
//	}
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//	public Instant getUpdatedAt() {
//		return updatedAt;
//	}
//	public void setUpdatedAt(Instant updatedAt) {
//		this.updatedAt = updatedAt;
//	}
//	public String getUpdatedBy() {
//		return updatedBy;
//	}
//	public void setUpdatedBy(String updatedBy) {
//		this.updatedBy = updatedBy;
//	}
	
	
}
