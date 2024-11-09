package com.chatbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatbook.entities.User;
import com.chatbook.repositories.UserRepository;

@Service
public class UserServiceImplementation  implements UserService{
	@Autowired
	UserRepository repo;

	
	public void addUser(User user) {
				repo.save(user);
	}

	@Override
	public boolean userExists(String username, String email){
		User user1=repo.findByUsername(username);
		User user2=repo.findByEmail(email);
			if(user1!=null||user2!=null) {
				return true;
			
		}
		return false;
	}

	@Override
	public boolean validateUser(String username, String password) {
		String dbpass=repo.findByUsername(username).getPassword();
		if(password.equals(dbpass)) {
			return true;
		}
		return false;
	}

	@Override
	public User getUser(String username) {
		return repo.findByUsername(username);
	}

	@Override
	public void updateUser(User user) {
		repo.save(user);
		
	}
	
	

}
