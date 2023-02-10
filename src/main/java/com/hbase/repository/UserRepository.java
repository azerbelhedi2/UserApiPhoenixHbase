package com.hbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbase.models.User;



public interface UserRepository extends JpaRepository<User,Long> {
	
	public User findById(long id); 

}
