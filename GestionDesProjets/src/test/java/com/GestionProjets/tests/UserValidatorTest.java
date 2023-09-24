package com.GestionProjets.tests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;

import java.util.Date;
import java.util.Optional;

import com.GestionProjets.Validators.UserValidator;
import com.GestionProjets.repositories.UserRepository;
import com.GestionProjets.entities.User;

@SpringBootTest

public class UserValidatorTest {
	
	@MockBean
	private UserRepository userRepository;
	
	@Test
	public void testFindUserById() {
		User user = new User();
		user.setId(1);
		user.setFirstName("Sophie");
		user.setLastName("Sophie");
		@SuppressWarnings("deprecation")
		Date birth=new Date("19/9/2000");
		
		user.setBirthday(birth);
		user.setEmail("Sophie@gmail.com");
		user.setMdp("AZ1&89aze");
		
		when(userRepository.findById((long) 1)).thenReturn(Optional.of(user));
	
	   verify(userRepository).findById((long) 1);

		
		
		//UserValidator userValidator = new UserValidator();
   //@Test
   //public void validatUserName() {
	   //assertEquals(userValidator.vaidateName("rihab"), true);
   }
   
}
