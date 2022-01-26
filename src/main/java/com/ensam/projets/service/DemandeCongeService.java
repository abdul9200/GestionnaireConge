package com.ensam.projets.service;
import com.ensam.projets.entity.DemandeConge;

import java.util.List;

public interface DemandeCongeService {
    DemandeConge addDemandeConge(DemandeConge demandeConge);
    void removeDemandeConge(DemandeConge demandeConge);
    DemandeConge updateDemandeConge(DemandeConge  demandeConge);
    DemandeConge getDemandeCongeById(int id);
    DemandeConge addCongetoDemandeConge(int idConge,int idDemandeConge);
    List<DemandeConge> listDemandeConge();
}
