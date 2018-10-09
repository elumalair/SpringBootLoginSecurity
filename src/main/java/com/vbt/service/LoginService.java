package com.vbt.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// in28minutes, dummy
		return userid.equalsIgnoreCase("dummy")
				&& password.equalsIgnoreCase("dummy");
	}

}
