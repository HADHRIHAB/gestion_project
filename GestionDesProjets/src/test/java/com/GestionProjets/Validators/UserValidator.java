package com.GestionProjets.Validators;

import java.util.Date;
import java.util.List;

import com.GestionProjets.entities.User;

public class UserValidator {
	public boolean validateDeadline(Date date) {
		Date today= new Date();
		if (today.before(date)) 
			{ return true;}
			else {return false;}
		
	}
	public boolean vaidateName(String Name) {
		return Name.matches("^[a-zA-Z ]+$");
	}
	public boolean doesUserExist(List<User> usersArray, User user) {
	
		for(User usr : usersArray) {
			if(usr.getFirstName().equals(user.getFirstName())&& usr.getLastName()
					.equals(user.getLastName())&& usr.getBirthday()
					.equals(user.getBirthday())&& usr.getEmail().equals(user.getEmail())) 
				{return true;}
			}
		return false;
	}
	}

