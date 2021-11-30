package com.maplesoft.ms.main.persistance.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sm_etiquette")
public abstract class BasicEtiquette {

    @Id
    private Long id;
    @Column(name = "label_path")
    private String labelUrl;
    @Column
    private String title;
    @Column
    private String header;
    @Column
    private String message1;
    @Column
    private String message2;
    @Column
    private String message3;
    @Column
    private String message4;
    @Column
    private String message5;

}
