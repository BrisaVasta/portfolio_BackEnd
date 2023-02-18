package com.portfolioSpring;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.portfolioSpring.dao.PersonaDao;
import com.portfolioSpring.dao.EducacionDao;
import com.portfolioSpring.dao.ExpLaboralDao;
import com.portfolioSpring.dao.ProyectoDao;
import com.portfolioSpring.entity.Persona;
import com.portfolioSpring.entity.Proyecto;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController

@CrossOrigin(origins = "https://portfolio-nuevo.web.app", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
//@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    private PersonaDao persoServ;
    @Autowired
    private ProyectoDao proyDao;

    @GetMapping("persona/verPersona/{id}")
    public Persona verPersona(@PathVariable int id) {
        return persoServ.findById(id).orElse(null);
    }
 
    @PutMapping("persona/editarPersona")
    public void editarPersona(@RequestBody Persona p){
        persoServ.save(p);
        
    }
    //---------------------------------------------------1

    @GetMapping("proyecto/verProyectos")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return (proyDao.findAll());
    }


    @PostMapping("proyecto/agregarProyecto")
    public void agregarProyecto(@RequestBody Proyecto p) {
        proyDao.save(p);
    }

    @GetMapping("proyecto/traerProyecto/{id}")
    public Proyecto traerProyecto(@PathVariable int id) {
        return proyDao.findById(id).orElse(null);
    }
    @PutMapping("proyecto/editarProyecto/{id}")
    public void editarProyecto(@PathVariable int id,@RequestBody Proyecto p) {
        proyDao.save(p);
    }
 
    @DeleteMapping("proyecto/borrarProyecto/{id}")
    public void borrarProyecto(@PathVariable int id) {
        proyDao.deleteById(id);
    }

    //---------------------------------------------------
     

}
    
