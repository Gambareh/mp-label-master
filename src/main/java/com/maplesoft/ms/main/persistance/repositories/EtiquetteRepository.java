package com.maplesoft.ms.main.persistance.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.maplesoft.ms.main.persistance.models.BasicEtiquette;

public interface EtiquetteRepository<T extends BasicEtiquette> extends JpaRepository<T, Long> {
}
