package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.service.AuthenticationService;
import com.app.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/authentication")
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private UserService userService;

	@PostMapping("signup") // api/authentication/sign-up
	public ResponseEntity<?> signUp(@RequestBody User user) {
		if (userService.findByUserName(user.getUsername()).isPresent()) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
	}

	@PostMapping("signin") // api/authentication/sign-in
	public ResponseEntity<?> signIn(@RequestBody User user) {
		return new ResponseEntity<>(authenticationService.signInAndRetunJwt(user), HttpStatus.OK);
	}
}
