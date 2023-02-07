
package com.portfolioSpring.dao;

import com.portfolioSpring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Integer> {
      User findByUsernameAndPassword(String Username,String Password);
      
}
