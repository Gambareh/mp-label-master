package com.maplesoft.ms.main.persistance.dto;

import java.util.Date;


public class ProductCategoryDto {

    private Long id;
    private String categoryName;
    private Date createdOn;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
      
    }
   

