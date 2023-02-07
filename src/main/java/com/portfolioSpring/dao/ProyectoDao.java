
package com.portfolioSpring.dao;

import com.portfolioSpring.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoDao extends JpaRepository<Proyecto, Integer>{
    
}
