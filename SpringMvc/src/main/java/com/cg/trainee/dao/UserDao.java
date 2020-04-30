package com.cg.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trainee.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{
	
	public User findByUsernameAndPassword(String username, String password);

}
