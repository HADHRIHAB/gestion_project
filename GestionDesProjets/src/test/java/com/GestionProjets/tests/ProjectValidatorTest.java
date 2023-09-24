package com.GestionProjets.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import com.GestionProjets.Validators.ProjectValidator;
@SpringBootTest

public class ProjectValidatorTest {
     
	
	ProjectValidator projectValidator;
	@BeforeAll
	public void init()
	{
		projectValidator= new ProjectValidator();
	}
	
	
	@Test
	
	public void validatDate() {
		   assertEquals(projectValidator.validateProject(), true);
	   }
	
}
