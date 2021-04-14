package com.maplesoft.ms.main.services;

import com.maplesoft.ms.main.persistance.models.Product;
import com.maplesoft.ms.main.persistance.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class ProductService {
    private ProductRepository productRepository;

}
