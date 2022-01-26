package com.ensam.projets.service;

import com.ensam.projets.entity.Groupe;
import com.ensam.projets.entity.Salarie;
import com.ensam.projets.repository.GroupeRepository;
import com.ensam.projets.repository.SalarieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class GroupeServiceImpl implements GroupeService{
    private GroupeRepository rep;
    private SalarieRepository repS;

    public GroupeServiceImpl(GroupeRepository r) {
        rep = r;
    }

    @Override
    public Groupe addGroupe(Groupe groupe) {
        return rep.save(groupe);
    }

    @Override
    public void removeGroupe(Groupe groupe) {
        rep.delete(groupe);

    }

    @Override
    public Groupe updateGroupe(Groupe groupe) {
        return rep.save(groupe);
    }

    @Override
    public Groupe getGroupeById(int id) {
        return rep.findById(id).get();
    }

    @Override
    public Groupe addSalarieToGroupe(int idGroupe, int idSalarie) {
        Groupe groupe = rep.findById(idGroupe).get();
        Salarie salarie=repS.findById(idSalarie).get();
        salarie.setGroupe(groupe);
        groupe.getSalaries().add(salarie);
        repS.save(salarie);
        return rep.save(groupe);
    }

    @Override
    public List<Groupe> listGroupe() {
        return rep.findAll();
    }
}
