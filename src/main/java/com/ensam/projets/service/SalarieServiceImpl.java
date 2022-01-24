package com.ensam.projets.service;

import com.ensam.projets.entity.Salarie;
import com.ensam.projets.repository.SalarieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalarieServiceImpl implements SalarieService{
    private SalarieRepository rep;

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
    public List<Salarie> listSalarie() {
        return rep.findAll();
    }
}
