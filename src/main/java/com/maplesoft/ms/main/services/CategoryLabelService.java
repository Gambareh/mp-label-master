package com.maplesoft.ms.main.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maplesoft.ms.main.persistance.models.ProductCategory;
import com.maplesoft.ms.main.persistance.repositories.CategoryRepository;


@Service
@Transactional
public class CategoryLabelService {
	
    private final CategoryRepository categoryRepository;
    
    @Autowired
    public CategoryLabelService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

   public List<ProductCategory> getAllCategories(){
       return  categoryRepository.findAll();
   }

   public ProductCategory getCategory(Long id){
       return categoryRepository.getOne(id);
   }

}
