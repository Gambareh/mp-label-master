package com.maplesoft.ms.main.services;

import com.maplesoft.ms.main.persistance.models.Product;
import com.maplesoft.ms.main.persistance.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProduct(Long id){
        return productRepository.getOne(id);
    }

}
