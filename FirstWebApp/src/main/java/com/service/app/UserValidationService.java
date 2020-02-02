package com.service.app;

public class UserValidationService {
	
	public boolean validateUser(String userName, String password) {
		if(null!=userName && null!= password) {
			if(userName.equals("DTNA")&& password.equals("admin")) {
				return true;
			}
		}
		return false;
	}

}
