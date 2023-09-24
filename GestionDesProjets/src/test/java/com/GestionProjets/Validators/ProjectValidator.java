package com.GestionProjets.Validators;

import com.GestionProjets.entities.Project;

import java.util.Date;

public class ProjectValidator {
	
	
public Boolean validateProject() {
  
Project project = new Project();
  Date endDate = project.getEndDate();
  Date startDate = project.getStartDate();
  //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   //String date1 = sdf.format(endDate);
   //String date2 = sdf.format(startDate);
   //if(startDate.before(endDate)) {
	   //return true;} else {return false;}
  return startDate.before(endDate);
   }
	

}
		  




