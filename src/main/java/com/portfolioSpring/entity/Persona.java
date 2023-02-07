
package com.portfolioSpring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter

public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String titulo;
    private String telefono;
    private int edad;
    private String email;
    private String ciudad;
    private String urlPerfil;
    private String urlBanner;
    
    
}
