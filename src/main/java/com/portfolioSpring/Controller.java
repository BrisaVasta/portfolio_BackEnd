package com.portfolioSpring;

import com.portfolioSpring.dao.EducacionDao;
import com.portfolioSpring.dao.ExpLaboralDao;
import com.portfolioSpring.entity.Persona;
import com.portfolioSpring.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolioSpring.dao.PersonaDao;
import com.portfolioSpring.dao.ProyectoDao;
import com.portfolioSpring.dao.SkillDao;
import com.portfolioSpring.dao.UserDao;
import com.portfolioSpring.entity.Educacion;
import com.portfolioSpring.entity.ExpLaboral;
import com.portfolioSpring.entity.Proyecto;
import com.portfolioSpring.entity.Skill;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController

@CrossOrigin(origins = "https://portfolio-nuevo.web.app", methods= {RequestMethod.GET,RequestMethod.POST})
//@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    private PersonaDao persoServ;
    @Autowired
    private UserDao userDao;
    @Autowired
    private ProyectoDao proyDao;
    @Autowired
    private EducacionDao educDao;
    @Autowired
    private ExpLaboralDao expLaboralDao;
    @Autowired
    private SkillDao skillDao;
    

    

 
    @GetMapping("persona/verPersona/{id}")
    public Persona verPersona(@PathVariable int id) {
        return persoServ.findById(id).orElse(null);
    }
 
    @PutMapping("persona/editarPersona")
    public void editarPersona(@RequestBody Persona p){
        persoServ.save(p);
        
    }
 
   

    //----------------------------------------------------
    @PostMapping("/api/login")
    @ResponseBody
    public User login(@RequestBody User u) {
        return userDao.findByUsernameAndPassword(u.getUsername(), u.getPassword());
    }

    @GetMapping("/api/getUser/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        return (userDao.findById(id).orElse(null));
    }

    @GetMapping("/api/verUsers")
    @ResponseBody
    public List<User> verUsers() {
        return userDao.findAll();
    }

    @PostMapping("/api/agregarUser")
    public void agregarUser(@RequestBody User u) {
        userDao.save(u);
    }

    @PutMapping("/api/editarUser") 
    public void editarUser(@RequestBody User u) {
        userDao.save(u);
    }

    @DeleteMapping("/api/borrarUser")
    @ResponseBody
    public void borrarUser(@RequestBody User u) {
        userDao.delete(u);
    }

//---------------------------------------------------

    @GetMapping("/api/verEducacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return (educDao.findAll());
    }


    @PostMapping("/api/agregarEducacion")
    public void agregarEducacion(@RequestBody Educacion e) {
        educDao.save(e);
    }

    @GetMapping("/api/traerEducacion/{id}")
    public Educacion traerEducacion(@PathVariable int id) {
        return educDao.findById(id).orElse(null);
    }
    @PutMapping("/api/editarEducacion/{id}")
    public void editarEducacion(@PathVariable int id,@RequestBody Educacion e) {
        educDao.save(e);
    }

    @DeleteMapping("/api/borrarEducacion/{id}")
    public void borrarEducacion(@PathVariable int id) {
        educDao.deleteById(id);
    }
    
    
    //---------------------------------------------------

    
