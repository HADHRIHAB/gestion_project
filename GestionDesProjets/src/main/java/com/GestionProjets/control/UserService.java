package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionProjets.entities.User;

import com.GestionProjets.entitiesDto.UserDto;
import com.GestionProjets.repositories.UserRepository;


@Service


public class UserService {

	@Autowired 
	UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User create(User user) {
		return userRepository.save(user);
	}

	public Optional<User> getUserById(long id) {
		return userRepository.findById(id);
	}

	public void delete(long id) {
		userRepository.deleteById(id);
	}

	public Optional<List<User>> getByFirstNameOrsLastName(String FirstName, String LastName) {
		return Optional.of(userRepository.FindUserByFirstNameOrLastName(FirstName, LastName));
	}

	public Optional<User> getEmployeeByEmailAndPassword(String Email, String Password) {
		return userRepository.FindUserByEmailAndPassword(Email, Password);
	}
	
	public UserDto convertToDto(User user) {
		UserDto userDto= new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setBirthday(user.getBirthday());
		userDto.setEmail(user.getEmail());
		userDto.setProjects(user.getProjects());
		return userDto;
	}
}
