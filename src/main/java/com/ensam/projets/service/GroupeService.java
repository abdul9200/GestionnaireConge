package com.ensam.projets.service;
import com.ensam.projets.entity.Groupe;

import java.util.List;
public interface GroupeService {
    Groupe addGroupe(Groupe groupe);
    void removeGroupe(Groupe groupe);
    Groupe updateGroupe(Groupe  groupe);
    Groupe getGroupeById(int id);
    List<Groupe> listGroupe();

}
