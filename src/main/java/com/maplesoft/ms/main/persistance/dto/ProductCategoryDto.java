package com.maplesoft.ms.main.persistance.dto;

import com.maplesoft.ms.main.persistance.models.LabelMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductCategoryDto {

    private Long id;
    private String categoryName;
    private Date createdOn;
    Set<LabelMessage> labelMessages;
}
