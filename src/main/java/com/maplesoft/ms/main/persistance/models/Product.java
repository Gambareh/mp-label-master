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
@Table(name = "sm_product")
public class Product {

    @Id
    @Column(name = "product_id")
    private Long id;
    @Column(name="product_label")
    private String label;
    @Column(name = "product_short_label")
    private String shortLabel;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "label_id", referencedColumnName = "id")
    private LabelTagTemplate tagTemplate;




}