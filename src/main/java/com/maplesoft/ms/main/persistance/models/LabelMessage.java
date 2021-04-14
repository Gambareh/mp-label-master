package com.maplesoft.ms.main.persistance.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sc_label_messages)")
public class LabelMessage {

    @Id
    @Column(name = "label_message_id")
    private Long id;
    @Column(name = "label_message")
    private String messageLine;


}
