
package com.portfolioSpring.dao;

import com.portfolioSpring.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillDao extends JpaRepository<Skill, Integer>{
    
}
