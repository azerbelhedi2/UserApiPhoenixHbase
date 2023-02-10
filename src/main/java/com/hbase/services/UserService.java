package com.hbase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hbase.models.User;
import com.hbase.repository.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(long id) {
		return userRepository.findById(id);
	}

	@Override
	public void createUser(User user) {

		userRepository.save(user);

	}

	@Override
	public void deleteUser(long id) {

		userRepository.deleteById(id);

	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();

	}

}
