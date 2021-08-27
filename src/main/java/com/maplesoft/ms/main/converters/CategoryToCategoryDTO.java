package com.maplesoft.ms.main.converters;

import com.maplesoft.ms.main.persistance.dto.ProductCategoryDto;
import com.maplesoft.ms.main.persistance.models.ProductCategory;

public class CategoryToCategoryDTO {

	public void convert(ProductCategory productCategory,ProductCategoryDto categoryDto) {
		 categoryDto.setId(productCategory.getId());
		 categoryDto.setCategoryName(productCategory.getCategoryName());
		 categoryDto.setCreatedOn(productCategory.getCreatedOn());
	}
}
