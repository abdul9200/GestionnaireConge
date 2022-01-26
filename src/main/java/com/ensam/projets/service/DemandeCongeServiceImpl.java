package com.ensam.projets.service;
import com.ensam.projets.entity.Conge;
import com.ensam.projets.entity.DemandeConge;
import com.ensam.projets.repository.CongeRepository;
import com.ensam.projets.repository.DemandeCongeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DemandeCongeServiceImpl implements DemandeCongeService{
    private DemandeCongeRepository rep;
    private CongeRepository repC;

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
    public DemandeConge addCongetoDemandeConge(int idConge, int idDemandeConge) {
        DemandeConge demandeConge=rep.findById(idDemandeConge).get();
        Conge conge=repC.findById(idConge).get();
        conge.setDemandeConge(demandeConge);
        demandeConge.setConge(conge);
        repC.save(conge);
        return rep.save(demandeConge);
    }

    @Override
    public List<DemandeConge> listDemandeConge() {
        return rep.findAll();
    }
}
