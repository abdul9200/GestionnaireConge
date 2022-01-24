package com.ensam.projets.repository;

import com.ensam.projets.entity.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeCongeRepository extends JpaRepository<DemandeConge, Integer> {
}
