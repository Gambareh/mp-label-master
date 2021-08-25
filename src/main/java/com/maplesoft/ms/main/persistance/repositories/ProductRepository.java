package com.maplesoft.ms.main.persistance.repositories;

import com.maplesoft.ms.main.persistance.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
