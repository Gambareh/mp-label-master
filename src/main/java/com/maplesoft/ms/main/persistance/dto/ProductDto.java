package com.maplesoft.ms.main.persistance.dto;

import java.util.Date;

import com.maplesoft.ms.main.persistance.models.BasicEtiquette;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {

    private Long id;
    private String label;
    private String shortLabel;
    private Date createdOn;
   
}
