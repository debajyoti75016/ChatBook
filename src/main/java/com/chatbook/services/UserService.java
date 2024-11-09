package com.chatbook.services;

import com.chatbook.entities.User;

public interface UserService {

	void addUser(User user);

boolean userExists(String username, String email);

boolean validateUser(String username, String password);

User getUser(String username);

void updateUser(User user);
	

}
