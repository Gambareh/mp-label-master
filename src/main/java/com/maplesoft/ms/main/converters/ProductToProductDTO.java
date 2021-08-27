package com.maplesoft.ms.main.converters;

import com.maplesoft.ms.main.persistance.dto.ProductDto;
import com.maplesoft.ms.main.persistance.models.Product;

public class ProductToProductDTO {
	
	public static ProductDto convert(Product product,ProductDto productDto) {
		productDto.setId(product.getId());
		productDto.setLabel(product.getLabel());
		productDto.setShortLabel(product.getShortLabel());
		return productDto;
	}
}
