package com.maplesoft.ms.main.services;

import com.maplesoft.ms.main.persistance.models.Category;
import com.maplesoft.ms.main.persistance.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class CategoryService {
    private final CategoryRepository categoryRepository;

   public List<Category> getAllCategories(){
       return  categoryRepository.findAll();
   }

   public Category getCategory(Long id){
       return categoryRepository.getOne(id);
   }

}
