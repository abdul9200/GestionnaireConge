package com.ensam.projets.service;

import com.ensam.projets.entity.Conge;

import java.util.List;

public interface CongeService {
    Conge addConge(Conge conge);
    void removeConge(Conge conge);
    Conge updateConge(Conge conge);
    Conge getCongeById(int id);
    List<Conge> listConge();
}
