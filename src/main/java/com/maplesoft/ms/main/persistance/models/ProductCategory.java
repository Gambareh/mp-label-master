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
@Table(name = "sm_category")
public class ProductCategory {
    @Id
    @Column(name = "product_category_id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "sm_product_categories",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")})
    Set<Product> product = new HashSet<>();
}
