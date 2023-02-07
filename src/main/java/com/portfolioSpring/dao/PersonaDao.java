
package com.portfolioSpring.dao;

import com.portfolioSpring.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaDao extends JpaRepository<Persona, Integer>{
   
            
}
