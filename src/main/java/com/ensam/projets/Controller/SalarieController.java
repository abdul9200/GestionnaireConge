package com.ensam.projets.Controller;
import org.springframework.web.bind.annotation.*;
import com.ensam.projets.entity.Salarie;
import com.ensam.projets.service.SalarieService;

import java.util.List;

@RestController
@RequestMapping(path = "/salarie")

public class SalarieController {
    private SalarieService salarieService;

    public SalarieController(SalarieService salarieService) {
        this.salarieService = salarieService;
    }

    @PostMapping(path = "/add")
    public Salarie addSalarie(@RequestBody Salarie salarie){
        return salarieService.addSalarie(salarie);
    }
    @PutMapping(path = "/update")
    public Salarie updateSalarie(@RequestBody Salarie salarie){
        return salarieService.updateSalarie(salarie);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeSalarie(@PathVariable(name="id")int id){
        salarieService.removeSalarie(salarieService.getSalarieById(id));
    }
    @GetMapping(path="/listSalarie")
    public List<Salarie> listSalarie(){
        return salarieService.listSalarie();
    }
}
