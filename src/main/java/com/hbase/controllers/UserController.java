package com.hbase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbase.models.User;
import com.hbase.services.UserService;


@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	UserService userService; 
	

	@GetMapping("")
	public List<User> getAllUsers() {
		return userService.getAllUser(); 

	}
	@GetMapping("/{id}")
	public User getById(@PathVariable("id") long id ) {
		return userService.getUser(id); 

	}
	@PostMapping("")
	public User addUser( @RequestBody User   user ) {
		
		userService.createUser(user);
		return user ; 
	}
	@PatchMapping("")
	public User updateUser(@RequestBody User user ) {
			User existingUser = userService.getUser(user.getId()) ; 
			existingUser.setFirstname(user.getFirstname());
			existingUser.setLastname(user.getLastname());
			existingUser.setEmail(user.getEmail());
			existingUser.setPassword(user.getPassword());
			userService.updateUser(existingUser);
			
			return existingUser ;
			
	}
	@DeleteMapping("/delete/{id}")
	public void deleteUser( @PathVariable("id") long id  ){
		userService.deleteUser(id);
	}

}
