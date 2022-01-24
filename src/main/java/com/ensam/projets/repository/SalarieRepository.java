package com.ensam.projets.repository;

import com.ensam.projets.entity.Salarie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalarieRepository extends JpaRepository<Salarie,Integer> {
}
