package com.ensam.projets.Controller;
import org.springframework.web.bind.annotation.*;
import com.ensam.projets.entity.Groupe;
import com.ensam.projets.service.GroupeService;

import java.util.List;

@RestController
@RequestMapping(path = "/groupe")

public class GroupeController {
    private GroupeService groupeService;

    public GroupeController(GroupeService groupeService) {
        this.groupeService = groupeService;
    }

    @PostMapping(path = "/add")
    public Groupe addGroupe(@RequestBody Groupe groupe){
        return groupeService.addGroupe(groupe);
    }
    @PutMapping(path = "/update")
    public Groupe updateGroupe(@RequestBody Groupe groupe){
        return groupeService.updateGroupe(groupe);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeGroupe(@PathVariable(name="id")int id){
        groupeService.removeGroupe(groupeService.getGroupeById(id));
    }
    @GetMapping(path="/listGroupe")
    public List<Groupe> listGroupe(){
        return groupeService.listGroupe();
    }
}
