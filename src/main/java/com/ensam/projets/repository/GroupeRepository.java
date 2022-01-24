package com.ensam.projets.repository;

import com.ensam.projets.entity.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupeRepository extends JpaRepository<Groupe,Integer> {
}
