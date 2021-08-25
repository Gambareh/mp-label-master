package com.maplesoft.ms.main.persistance.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sm_label_message")
public class LabelMessage {

    @Id
    private Long id;
    @Column(name = "message")
    private String messageLine;
    @ManyToOne
    private Etiquette etiquette;




}
