package com.maplesoft.ms.main.persistance.repositories;

import com.maplesoft.ms.main.persistance.models.Product;
import com.maplesoft.ms.main.persistance.models.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
