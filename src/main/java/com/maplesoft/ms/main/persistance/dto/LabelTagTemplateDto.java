package com.maplesoft.ms.main.persistance.dto;

import com.maplesoft.ms.main.persistance.models.LabelMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LabelTagTemplateDto {

    private Long id;
    private String labelUrl;
    Set<LabelMessage> labelMessages;
}
