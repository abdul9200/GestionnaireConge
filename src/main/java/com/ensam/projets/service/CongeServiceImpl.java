package com.ensam.projets.service;

import com.ensam.projets.entity.Conge;
import com.ensam.projets.repository.CongeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CongeServiceImpl implements CongeService{
    private CongeRepository rep;

    public CongeServiceImpl(CongeRepository r) {
        rep = r;
    }
    @Override
    public Conge addConge(Conge conge) {
        return rep.save(conge);
    }

    @Override
    public void removeConge(Conge conge) {
        rep.delete(conge);
    }

    @Override
    public Conge updateConge(Conge conge) {
        return rep.save(conge);
    }

    @Override
    public Conge getCongeById(int id) {
        return rep.findById(id).get();
    }

    @Override
    public List<Conge> listConge() {
        return rep.findAll();
    }
}
