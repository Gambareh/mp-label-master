package com.maplesoft.ms.main.persistance.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "sm_etiquette")
public class Etiquette {

    @Id
    private Long id;

    @Column(name = "label_path")
    private String labelUrl;
    @OneToMany(fetch = FetchType.LAZY,
               cascade = CascadeType.ALL)
    @JoinColumn(name = "etiquette_id")
    Set<LabelMessage> labelMessage;


}
