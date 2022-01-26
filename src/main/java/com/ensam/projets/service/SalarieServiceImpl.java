package com.ensam.projets.service;

import com.ensam.projets.entity.DemandeConge;
import com.ensam.projets.entity.Salarie;
import com.ensam.projets.repository.DemandeCongeRepository;
import com.ensam.projets.repository.SalarieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SalarieServiceImpl implements SalarieService{
    private SalarieRepository rep;
    private DemandeCongeRepository repD;

    public SalarieServiceImpl(SalarieRepository r) {
        rep = r;
    }
    @Override
    public Salarie addSalarie(Salarie salarie) {
        return rep.save(salarie);
    }

    @Override
    public void removeSalarie(Salarie salarie) {
        rep.delete(salarie);
    }

    @Override
    public Salarie updateSalarie(Salarie salarie) {
        return rep.save(salarie);
    }

    @Override
    public Salarie getSalarieById(int id) {
        return rep.findById(id).get();
    }

    @Override
    public Salarie addDemandeCongeToSalarie(int idSalarie, int IdDemandeConge) {
        Salarie salarie = rep.findById(idSalarie).get();
        DemandeConge demandeConge=repD.findById(IdDemandeConge).get();
        demandeConge.setSalarie(salarie);
        salarie.getDemandes().add(demandeConge);
        repD.save(demandeConge);
        return rep.save(salarie);
    }

    @Override
    public List<Salarie> listSalarie() {
        return rep.findAll();
    }
}
