package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojos.Role;
import com.app.pojos.User;

public interface UserService {
	User saveUser(User user);/////

	Optional<User> findByUserName(String userName); /////

	void updateUserRole(String userName, Role role);

	User updateUser(User user);

	String deleteUser(Long id);

	List<User> getAllUsersDetails();
}
