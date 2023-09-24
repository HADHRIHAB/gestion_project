package com.GestionProjets.Validators;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TaskValidator {

	public boolean validateDeadline(Date date) {
	    SimpleDateFormat sfd= new SimpleDateFormat();
		Date today= new Date();
		//sfd.format(date);
		if (today.before(date)) 
			{ return true;}
			else {return false;}
		
	}
	}

