package com.maplesoft.ms.main.persistance.repositories;

import com.maplesoft.ms.main.persistance.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
