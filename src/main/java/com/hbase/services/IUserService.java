package com.hbase.services;

import java.util.List;

import com.hbase.models.User;

public interface IUserService {
	
	public User getUser(long id); 
	public void createUser(User user); 
	public void deleteUser(long id); 
	public void updateUser(User user); 
	public List<User> getAllUser(); 

}
