package com.ensam.projets.Controller;

import com.ensam.projets.entity.Conge;
import com.ensam.projets.service.CongeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/conge")
public class CongeController {
    private CongeService congeService;

    public CongeController(CongeService congeService) {
        this.congeService = congeService;
    }

    @PostMapping(path = "/add")
    public Conge addConge(@RequestBody Conge conge){
        return congeService.addConge(conge);
    }
    @PutMapping(path = "/update")
    public Conge updateConge(@RequestBody Conge conge){
        return congeService.updateConge(conge);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeConge(@PathVariable(name="id")int id){
        congeService.removeConge(congeService.getCongeById(id));
    }
    @GetMapping(path="/listConge")
    public List<Conge> listConge(){
        return congeService.listConge();
    }



}
