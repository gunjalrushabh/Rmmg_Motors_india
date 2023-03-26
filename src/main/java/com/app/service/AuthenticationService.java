package com.app.service;

import java.util.List;

import com.app.pojos.User;

public interface AuthenticationService {

	User signInAndRetunJwt(User signInRequest);
	
	
}
