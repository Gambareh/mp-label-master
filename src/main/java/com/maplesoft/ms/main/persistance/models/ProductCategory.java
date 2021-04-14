package com.maplesoft.ms.main.persistance.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "sm_product_category")
public class ProductCategory {
    @Id
    @Column(name = "product_category_id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @ManyToMany(mappedBy = "productCategory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    Set<LabelMessage> categories = new HashSet<>();
}
