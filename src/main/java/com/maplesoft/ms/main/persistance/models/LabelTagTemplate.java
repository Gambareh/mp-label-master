package com.maplesoft.ms.main.persistance.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "sc_label_tag")
public class LabelTagTemplate {
    @Id
    @Column(name = "label_id")
    private Long id;

    @Column(name = "label_path")
    private String labelUrl;
    @OneToMany(mappedBy = "labelTagTemplate", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<LabelMessage> messages = new HashSet<>();

}
