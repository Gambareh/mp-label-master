package com.maplesoft.ms.main.persistance.repositories;

import com.maplesoft.ms.main.persistance.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllProducts(Long id);
    Product findProductById(Long id);

}
