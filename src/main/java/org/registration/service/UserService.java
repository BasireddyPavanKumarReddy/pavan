package org.registration.service;

import org.registration.entity.User;
import org.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public void registerUser(User user)
	{
		repository.save(user);
	}

}
