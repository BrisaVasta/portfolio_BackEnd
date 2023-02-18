package com.portfolioSpring;


import com.portfolioSpring.dao.EducacionDao;
import com.portfolioSpring.dao.ExpLaboralDao;
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

import com.portfolioSpring.entity.Persona;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController

@CrossOrigin(origins = "https://portfolio-nuevo.web.app", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
//@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    private PersonaDao persoServ;


    @GetMapping("persona/verPersona/{id}")
    public Persona verPersona(@PathVariable int id) {
        return persoServ.findById(id).orElse(null);
    }
 
    @PutMapping("persona/editarPersona")
    public void editarPersona(@RequestBody Persona p){
        persoServ.save(p);
        
    }
 
   

}
    
