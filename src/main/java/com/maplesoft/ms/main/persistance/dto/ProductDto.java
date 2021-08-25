package com.maplesoft.ms.main.persistance.dto;

import com.maplesoft.ms.main.persistance.models.Etiquette;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {

    private Long id;
    private String label;
    private String shortLabel;
    private Date createdOn;
    private Etiquette etiquette;
}
