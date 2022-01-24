package com.ensam.projets.service;

import com.ensam.projets.entity.Salarie;

import java.util.List;

public interface SalarieService {
    Salarie addSalarie(Salarie salarie);
    void removeSalarie(Salarie salarie);
    Salarie updateSalarie(Salarie  salarie);
    Salarie getSalarieById(int id);
    List<Salarie> listSalarie();
}
