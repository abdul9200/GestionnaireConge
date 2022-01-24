package com.ensam.projets.service;

import com.ensam.projets.entity.Groupe;
import com.ensam.projets.repository.GroupeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupeServiceImpl implements GroupeService{
    private GroupeRepository rep;

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
    public List<Groupe> listGroupe() {
        return rep.findAll();
    }
}
