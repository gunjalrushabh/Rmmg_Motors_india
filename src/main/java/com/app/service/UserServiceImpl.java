package com.app.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.centralexception.ResourceNotFoundException;
import com.app.pojos.Role;
import com.app.pojos.User;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	//1.adding or saving user
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRole(Role.USER);
		user.setCreateTime(LocalDateTime.now());
		return userRepo.save(user);
	}

	@Override
	public Optional<User> findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepo.findUserByName(userName);
	}

	@Override
	public void updateUserRole(String userName, Role newRole) {
		// TODO Auto-generated method stub
	userRepo.updateUserRole(userName, newRole);
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		if(userRepo.existsById(user.getId()))
		{
		return userRepo.save(user);
	}
		else {
		throw new ResourceNotFoundException("updation failed ,User not found.....!");
	}
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		return "user deleted..";
	}

	@Override
	public List<User> getAllUsersDetails() {
		// TODO Auto-generated method stub
		return userRepo.findAll() ;
	}
	
	

}
