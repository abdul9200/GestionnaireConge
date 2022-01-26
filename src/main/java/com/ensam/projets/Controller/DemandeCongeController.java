package com.ensam.projets.Controller;
import com.ensam.projets.entity.Groupe;
import jdk.internal.net.http.common.Demand;
import org.springframework.web.bind.annotation.*;
import com.ensam.projets.entity.DemandeConge;
import com.ensam.projets.service.DemandeCongeService;

import java.util.List;

@RestController
@RequestMapping(path = "/demandeconge")

public class DemandeCongeController {
    private DemandeCongeService demandeCongeService;

    public DemandeCongeController(DemandeCongeService demandeCongeService) {
        this.demandeCongeService = demandeCongeService;
    }

    @PostMapping(path = "/add")
    public DemandeConge addDemandeConge(@RequestBody DemandeConge demandeConge){
        return demandeCongeService.addDemandeConge(demandeConge);
    }
    @PutMapping(path = "/addCongeToDemandeConge")
    public DemandeConge addCongeToDemandeConge(@RequestParam(name="idDemandeConge")int idDemandeConge, @RequestParam (name="idConge") int idConge){
        return demandeCongeService.addCongetoDemandeConge(idDemandeConge,idConge);
    }
    @PutMapping(path = "/update")
    public DemandeConge updateDemandeConge(@RequestBody DemandeConge demandeConge){
        return demandeCongeService.updateDemandeConge(demandeConge);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeDemandeConge(@PathVariable(name="id")int id){
        demandeCongeService.removeDemandeConge(demandeCongeService.getDemandeCongeById(id));
    }
    @GetMapping(path="/listDemandeConge")
    public List<DemandeConge> listDemandeConge(){
        return demandeCongeService.listDemandeConge();
    }
}
