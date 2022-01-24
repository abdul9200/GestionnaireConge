package com.ensam.projets.service;
import com.ensam.projets.entity.DemandeConge;
import com.ensam.projets.repository.DemandeCongeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemandeCongeServiceImpl implements DemandeCongeService{
    private DemandeCongeRepository rep;

    public DemandeCongeServiceImpl(DemandeCongeRepository r) {
        rep = r;
    }
    @Override
    public DemandeConge addDemandeConge(DemandeConge demandeConge) {
        return rep.save(demandeConge);
    }

    @Override
    public void removeDemandeConge(DemandeConge demandeConge) {
        rep.delete(demandeConge);
    }

    @Override
    public DemandeConge updateDemandeConge(DemandeConge demandeConge) {
        return rep.save(demandeConge);
    }

    @Override
    public DemandeConge getDemandeCongeById(int id) {
        return rep.findById(id).get();
    }

    @Override
    public List<DemandeConge> listDemandeConge() {
        return rep.findAll();
    }
}
