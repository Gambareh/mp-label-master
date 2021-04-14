package com.maplesoft.ms.main.persistance.repositories;

import com.maplesoft.ms.main.persistance.models.LabelMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelMessageRepository extends JpaRepository<LabelMessage, Long> {
}
