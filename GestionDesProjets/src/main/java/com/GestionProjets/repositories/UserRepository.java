package com.GestionProjets.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> FindUserByEmailAndPassword(String Email, String Password);
	List<User> FindUserByFirstNameOrLastName(String FirstName, String LastName);
 
	//pagebale sortable 
	
}
